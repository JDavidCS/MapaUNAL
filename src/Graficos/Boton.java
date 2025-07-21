/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 *
 * @author jdcor
 */
public class Boton extends JButton{
    public Boton(){
        this.setContentAreaFilled(false);
//        this.setBorderPainted(false);
        this.setFocusPainted(false);
        this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        Boton boton = this;
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Cambiar estilo al pasar el mouse
                boton.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Volver al estilo original al salir
                boton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
            }
        });
    }
    public Boton(String name){
        super(name);
        this.setContentAreaFilled(false);
//        this.setBorderPainted(false);
        this.setFocusPainted(false);
        this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        // borde interacctivo
        Boton boton = this;
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Cambiar estilo al pasar el mouse
                boton.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Volver al estilo original al salir
                boton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
            }
        });
    }
    
}
