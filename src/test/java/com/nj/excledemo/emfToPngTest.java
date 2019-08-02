package com.nj.excledemo;

import org.freehep.graphicsio.emf.EMFInputStream;
import org.freehep.graphicsio.emf.EMFRenderer;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName emfToPngTest
 * @Author shangpinyuan06
 * @Date 2019/8/2 9:06
 **/
public class emfToPngTest {
    private byte[] emfToPng(InputStream is){
// InputStream inputStream=null;
        byte[] by=null;
        EMFInputStream emf = null;
        EMFRenderer emfRenderer = null;
//创建储存图片二进制流的输出流
        ByteArrayOutputStream baos = null;
//创建ImageOutputStream流
        ImageOutputStream imageOutputStream = null;
        try {
            emf = new EMFInputStream(is, EMFInputStream.DEFAULT_VERSION);
            emfRenderer = new EMFRenderer(emf);

            final int width = (int)emf.readHeader().getBounds().getWidth();
            final int height = (int)emf.readHeader().getBounds().getHeight();
            final BufferedImage result = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = (Graphics2D)result.createGraphics();
            emfRenderer.paint(g2);

//创建储存图片二进制流的输出流
            baos = new ByteArrayOutputStream();
//创建ImageOutputStream流
            imageOutputStream = ImageIO.createImageOutputStream(baos);
//将二进制数据写进ByteArrayOutputStream
            ImageIO.write(result, "png", imageOutputStream);
//inputStream = new ByteArrayInputStream(baos.toByteArray());
            by=baos.toByteArray();
/*JPanel resultPanel = new JPanel() {

private static final long serialVersionUID = 1L;

public void paintComponent(Graphics g) {
super.paintChildren(g);
Graphics2D g2 = (Graphics2D)g;
g2.drawImage(result, 0, 0, width, height,null);
g2.dispose();
}
};

JFrame ui = new JFrame("EMF Reader");
ui.getContentPane().setLayout(new BorderLayout());
ui.getContentPane().add(resultPanel, BorderLayout.CENTER);
ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ui.setSize(new Dimension(width, height));
ui.setVisible(true);*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                if(imageOutputStream!=null){
                    imageOutputStream.close();
                }
                if(baos!=null){
                    baos.close();
                }
                if(emfRenderer!=null){
                    emfRenderer.closeFigure();
                }
                if(emf!=null){
                    emf.close();
                }
            } catch (IOException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        return by;
    }
}
