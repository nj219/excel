/*
package com.nj.excledemo;

import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;

import javax.imageio.ImageIO;

*/
/**
 * 测试POI
 *
 * @author Loren
 *//*

public class ExcelController {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOut = null;
        BufferedImage bufferImg = null;
        try {
            // 先把读进来的图片放到一个ByteArrayOutputStream中，以便产生ByteArray
            // 读入图片1
            ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
            URL url = new URL("http://test.cncnews.cn:8080/wup/upload/1.jpg");
            bufferImg = ImageIO.read(url);
            ImageIO.write(bufferImg, "jpg", byteArrayOut);

            // 创建一个工作薄
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet1 = wb.createSheet("test picture");
            HSSFPatriarch patriarch = sheet1.createDrawingPatriarch();


            HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0, 1023, 255, (short) 6, 7, (short) 6, 7);
            anchor.setAnchorType(3);

            // 插入图片1
            patriarch.createPicture(anchor, wb.addPicture(byteArrayOut.toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));

            fileOut = new FileOutputStream("F:/workbook.xls");
            // 写入excel文件
            wb.write(fileOut);
            fileOut.close();
        } catch (IOException io) {
            io.printStackTrace();
            System.out.println("erorr : " + io.getMessage());
        } finally {
            if (fileOut != null) {
                try {
                    fileOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}*/
