package com.nj.excledemo.util;

import org.apache.poi.util.IOUtils;
import org.springframework.stereotype.Component;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * 网络抓取图片 转换哼byte字节流 再根据字节流转换成 MultipartFile
 */

@Component
public class UrlToMultipartFileUtil {

    public static byte[] urlToMultipartFile(String urlStr) {
        //获取文件名称
        String fileName = urlStr.substring(urlStr.lastIndexOf("/")+1);
        URL url = null;
        InputStream input = null;
        try {
            url = new URL(urlStr);
            URLConnection urlConn=url.openConnection();
            int length=urlConn.getContentLength();
            if(length>0){
                System.out.println("==========Content==========");
                input=urlConn.getInputStream();
                //int size = input.available();
                byte[] bt = IOUtils.toByteArray(input);

                return bt;
            }else{
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            input = null;
        }
        return null;
    }
}
