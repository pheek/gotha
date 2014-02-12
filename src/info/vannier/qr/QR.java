/*
 * static functions to generate QR Code images
 */
package info.vannier.qr;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.ByteMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Hashtable;

/**
 *
 * @author Luc
 */
public class QR {
    
    public final static int QR_DEFAULT_SIZE = 82;
    
    private static ByteMatrix qrByteMatrix(String qrText) throws WriterException{
        int size = QR_DEFAULT_SIZE;
        Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap;
        hintMap = new Hashtable<EncodeHintType, ErrorCorrectionLevel>();
        hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        
        ByteMatrix byteMatrix = qrCodeWriter.encode(qrText,
                BarcodeFormat.QR_CODE, size, size, hintMap);
        
        return byteMatrix;
    }
        
    public static BufferedImage qrImage(String qrText) throws WriterException{
        ByteMatrix byteMatrix = qrByteMatrix(qrText);
        int matrixWidth = byteMatrix.getWidth();
        BufferedImage image = new BufferedImage(matrixWidth, matrixWidth,
            BufferedImage.TYPE_INT_RGB);

        image.createGraphics();
        
        Graphics graphics = image.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, matrixWidth, matrixWidth);
        
        graphics.setColor(Color.BLACK);
 
        for (int i = 0; i < matrixWidth; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                if (byteMatrix.get(i, j) >= 0) {
                    graphics.fillRect(i, j, 1, 1);
                }
            }
        }
        return image;
    }
}