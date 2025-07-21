/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Graficos.VentanaEmergente;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author jdcor
 */
public class Servicio extends Lugar implements Ventana{
    private String info;
    private VentanaEmergente ventana = new VentanaEmergente();
    private String linkPinIcon;
    
    public Servicio(String nombre, String info, String linkPinIcon) {
        super(nombre, 45);
        this.info = info;
        this.linkPinIcon = linkPinIcon;
        if(nombre.toLowerCase().contains("biblioteca")){
            this.linkPinIcon = "/images/biblioteca.png";
        }
        crearPin();
    }

    public Servicio(String nombre, String info) {
        super(nombre, 45);
        this.info = info;
        if(nombre.toLowerCase().contains("biblioteca")){
            this.linkPinIcon = "/images/biblioteca.png";
        }
        crearPin();
    }
    
    @Override
    protected void crearPin() {
        this.pin = new Pin(linkPinIcon, this.getTamano());
        pin.setSize(pin.getWidth(), pin.getHeight());
        
        Servicio sv = this;
        this.pin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sv.mostrarPantalla();
            }
        });
    }

    @Override
    public void mostrarPantalla() {
        ventana.mostrarPantalla(this.getNombre(), info);
    }
    
}
