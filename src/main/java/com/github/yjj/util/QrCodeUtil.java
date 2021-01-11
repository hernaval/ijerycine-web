package com.github.yjj.util;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QrCodeUtil {
	
	public static  void generateQr(String text,int width,int height,String filepath) throws WriterException, IOException{
        QRCodeWriter qr  = new QRCodeWriter();
        BitMatrix bitMatrix = qr.encode(text, BarcodeFormat.QR_CODE, width, height);
        Path path = FileSystems.getDefault().getPath(filepath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path); 
    }
}
