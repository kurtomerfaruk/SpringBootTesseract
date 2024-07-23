package com.kurtomerfaruk.springboottesseract;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 23.07.2024 14:44
 */
@Service
public class TesseractService {

    @Autowired
    private  Tesseract tesseract;

    public  String recognizeText(InputStream inputStream) throws IOException{
        BufferedImage image= ImageIO.read(inputStream);
        try {
            return tesseract.doOCR(image);
        }catch (TesseractException exception){
            exception.printStackTrace();
        }
        return "failed";
    }
}
