/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author jdcor
 * Ventana Principal
 */
public class VentanaInicial extends JFrame{
    public VentanaInicial(String nombre){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,600);
        this.setTitle(nombre);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        ImageIcon image = new ImageIcon(getClass().getResource("/images/UNAL-Logo.png"));
        this.setIconImage(image.getImage());
    }
}
