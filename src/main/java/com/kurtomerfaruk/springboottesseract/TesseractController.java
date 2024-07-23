package com.kurtomerfaruk.springboottesseract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 23.07.2024 14:41
 */
@RestController
public class TesseractController {
    @Autowired
    private TesseractService tesseractService;

    @PostMapping("/ocr")
    public String recognizeText(@RequestParam("file")MultipartFile file) throws IOException {
        return tesseractService.recognizeText(file.getInputStream());
    }
}
