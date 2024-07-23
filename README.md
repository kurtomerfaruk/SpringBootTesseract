#### Brief:
This project (POC) consists of how to implement Tesseract OCR engine in Spring boot.

#### API Endpoint: http://localhost:9191/ocr

#### Example Usage
Request **(Form-data)** :

**File:** Select postman UI file type

![Alt](/src/main/resources/response.png "Response")

**Tesseract Supported Language**
This project supports only english. If you want different language, You must download traineddata from below list.

#### Language List
Lang Code | Language | 4.0 traineddata
:---------| :------- | :---------------
deu | German | [deu.traineddata](https://github.com/tesseract-ocr/tessdata/raw/4.00/deu.traineddata)
eng | English | [eng.traineddata](https://github.com/tesseract-ocr/tessdata/raw/4.00/eng.traineddata)
enm | English, Middle (1100-1500) | [enm.traineddata](https://github.com/tesseract-ocr/tessdata/raw/4.00/enm.traineddata)
tur | Turkish | [tur.traineddata](https://github.com/tesseract-ocr/tessdata/raw/4.00/tur.traineddata)

#### Libraries:
https://github.com/tesseract-ocr/tesseract

https://github.com/tesseract-ocr/tessdata 

