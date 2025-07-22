/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

/**
 *
 * @author jdcor
 */
public class Pin extends JLabel{
    private String srcPinIcon;
    private BufferedImage image;
    private int width, height;
    
    public Pin(String srcPinIcon, int tamano){
        super();
        this.srcPinIcon = srcPinIcon;
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        try {
            image = ImageIO.read(getClass().getResource(srcPinIcon));
            
            // para mantener las proporciones de una imagen, se manda la dimension height y se calcula el width
            int widthOriginal = image.getWidth();
            int heightOriginal = image.getHeight();
            height = tamano;
            float relacionAspecto = (float) widthOriginal/heightOriginal;
            width = (int)(height*relacionAspecto);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        setOpaque(false);
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    

    // Metodo interno llamado manualmente con "repaint()"
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (image != null) {
            Graphics2D g2 = (Graphics2D) g.create();

            // Escalado de alta calidad
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            g2.dispose();
        }
    }
    
    
}
