/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficos;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author jdcor
 */
public class VentanaEmergente extends JFrame{
    private JLabel Jtitulo;
    private JLabelImage Jfoto;
    private JLabel Jwebsite;
    private JLabel Jdescripcion;
    
    public VentanaEmergente(){
        super();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        
        Jtitulo = new JLabel();
        Jtitulo.setFont(new Font("Sans-serif", Font.BOLD, 25));
        Jtitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        Jtitulo.setBorder(new EmptyBorder(20,30,20,30));
        this.add(Jtitulo);
        
        Jfoto = new JLabelImage();
        Jfoto.setBorder(new EmptyBorder(5,10,0,10));
        Jfoto.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Jfoto);
        Jwebsite = new JLabel();
        Jwebsite.setBorder(new EmptyBorder(5,10,0,10));
        Jwebsite.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Jwebsite);
        Jdescripcion = new JLabel();
        Jdescripcion.setBorder(new EmptyBorder(5,10,0,10));
        Jdescripcion.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Jdescripcion);

    }
    
    public void mostrarPantalla(String titulo, String src, String website, String descripcion){
        this.setTitle(titulo);
        Jtitulo.setText(titulo);
        Jfoto.pintar(src, 300);
        Jfoto.setPreferredSize(new Dimension(Jfoto.getWidth(), Jfoto.getHeight()));
        Jfoto.setMaximumSize(new Dimension(Jfoto.getWidth(), Jfoto.getHeight()));
        Jwebsite.setText(website);
        Jdescripcion.setText(descripcion);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        
    }
    public void mostrarPantalla(String titulo, String descripcion){
        this.setTitle(titulo);
        Jtitulo.setText(titulo);
        Jdescripcion.setText(descripcion);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
