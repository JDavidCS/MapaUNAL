/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficos;

import Clases.Pin;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import mapaunal.MapaUnal;

/**
 *
 * @author jdcor
 */
public class Mapa extends JPanel{
    private String mapaActual;
    private final String mapaGeneral = "/images/mapaGeneral.png"; 
    private final String mapaIzquierdaArriba = "/images/topL.png";
    private final String mapaIzquierdaAbajo = "/images/bottomL.png";
    private final String mapaDerechaArriba = "/images/topR.png";
    private final String mapaDerechaAbajo = "/images/bottomR.png";
    private final Pin back = new Pin("/images/arrowBack.png",50);
    
    public Mapa(){
        setBounds(0, 0, 590, 590);
        iniciar();
    }
    
    public void iniciar(){
        
        // crear Boton de atrás (re utilizado en todas las secciones)
        back.setLocation(0, 0); //locación del boton back.
        back.setSize(back.getWidth(), back.getHeight());
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                renderMapaGeneral();
            }
        });
        
        renderMapaGeneral();
    }
    
    public void renderMapaGeneral(){
        this.removeAll();
        this.setLayout(new GridLayout(2,2));
        mapaActual = mapaGeneral;
        
        Pantalla.menuLateral.setChecklist(false);
        Boton boton1 = new Boton("TOP L");
        boton1.addActionListener((ActionEvent e) -> {
            renderIzquierdaArriba();
        });
        Boton boton2 = new Boton("TOP R");
        boton2.addActionListener((ActionEvent e) -> {
            renderDerechaArriba();
        });
        Boton boton3 = new Boton("BOTTOM L");
        boton3.addActionListener((ActionEvent e) -> {
            renderIzquierdaAbajo();
        });
        Boton boton4 = new Boton("BOTTOM R");
        boton4.addActionListener((ActionEvent e) -> {
            renderDerechaAbajo();
        });
        
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        
        this.revalidate();
        this.repaint();
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image img = new ImageIcon(getClass().getResource(mapaActual)).getImage();
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }

    private void renderIzquierdaArriba() {
        this.removeAll();
        this.setLayout(null);
        mapaActual = mapaIzquierdaArriba;
        this.add(back);
        Pantalla.menuLateral.setChecklist(true);
        
        
        
        this.revalidate();
        this.repaint();
    }

    private void renderDerechaArriba() {
        this.removeAll();
        this.setLayout(null);
        mapaActual = mapaDerechaArriba;
        this.add(back);
        Pantalla.menuLateral.setChecklist(true);
        
        JLabel edPin = MapaUnal.edificios.get(453).getPin();
        edPin.setLocation(95,500);
        this.add(edPin);
        JLabel serPin = MapaUnal.servicios.get(431).getPin();
        serPin.setLocation(60, 300);
        this.add(serPin);
        JLabel ob = MapaUnal.objetos.get("maquina").getPin();
        ob.setLocation(100, 500);
        this.add(ob);
        
        
        Pantalla.menuLateral.setEdificios(new ArrayList<>(Arrays.asList(edPin)));
        Pantalla.menuLateral.setServicios(new ArrayList<>(Arrays.asList(serPin)));
        Pantalla.menuLateral.setObjetos(new ArrayList<>(Arrays.asList(ob)));
        this.revalidate();
        this.repaint();
    }

    private void renderIzquierdaAbajo() {
        this.removeAll();
        this.setLayout(null);
        mapaActual = mapaIzquierdaAbajo;
        this.add(back);
        Pantalla.menuLateral.setChecklist(true);
        
        JLabel edPin = MapaUnal.edificios.get(481).getPin();
        edPin.setLocation(560,240);
        this.add(edPin);
        
        JLabel edPin2 = MapaUnal.edificios.get(564).getPin();
        edPin2.setLocation(390,220);
        this.add(edPin2);
        
        JLabel edPin3 = MapaUnal.edificios.get(225).getPin();
        edPin3.setLocation(520,430);
        this.add(edPin3);
        
        JLabel serPin = MapaUnal.servicios.get(571).getPin();
        serPin.setLocation(60, 320);
        this.add(serPin);
        
        JLabel serPin2 = MapaUnal.servicios.get(500).getPin();
        serPin2.setLocation(410, 270);
        this.add(serPin2);
        
        JLabel serPin3 = MapaUnal.servicios.get(225).getPin();
        serPin3.setLocation(520, 370);
        this.add(serPin3);
        
        
        
        Pantalla.menuLateral.setEdificios(new ArrayList<>(Arrays.asList(edPin, edPin2, edPin3)));
        Pantalla.menuLateral.setServicios(new ArrayList<>(Arrays.asList(serPin,serPin2,serPin3)));
        Pantalla.menuLateral.setObjetos(new ArrayList<>(Arrays.asList()));
        
        this.revalidate();
        this.repaint();
    }

    private void renderDerechaAbajo() {
        this.removeAll();
        this.setLayout(null);
        mapaActual = mapaDerechaAbajo;
        this.add(back);
        Pantalla.menuLateral.setChecklist(true);
        
        
        JLabel edPin = MapaUnal.edificios.get(401).getPin();
        edPin.setLocation(185,50);
        this.add(edPin);
        
        JLabel edPin2 = MapaUnal.edificios.get(451).getPin();
        edPin2.setLocation(95, 35);
        this.add(edPin2);
        
        JLabel edPin3 = MapaUnal.edificios.get(303).getPin();
        edPin3.setLocation(300, 55);
        this.add(edPin3);
        
        JLabel edPin4 = MapaUnal.edificios.get(404).getPin();
        edPin4.setLocation(205, 0);
        this.add(edPin4);
        
        JLabel serPin = MapaUnal.servicios.get(102).getPin();
        serPin.setLocation(200, 210);
        this.add(serPin);
        
        JLabel serPin2 = MapaUnal.servicios.get(571).getPin();
        serPin2.setLocation(140, 220);
        this.add(serPin2);
        
        JLabel ob1 = MapaUnal.objetos.get("maquina").getPin();
        ob1.setLocation(185,50);
        this.add(ob1);
        
        JLabel ob2 = MapaUnal.objetos.get("agua").getPin();
        ob2.setLocation(178,50);
        this.add(ob2);
        
        //pasar los pines
        Pantalla.menuLateral.setEdificios(new ArrayList<>(Arrays.asList(edPin, edPin2, edPin3, edPin4)));
        Pantalla.menuLateral.setServicios(new ArrayList<>(Arrays.asList(serPin,serPin2)));
        Pantalla.menuLateral.setObjetos(new ArrayList<>(Arrays.asList(ob1, ob2)));
        
        this.revalidate();
        this.repaint();
    }
}
