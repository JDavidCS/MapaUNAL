/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Graficos.VentanaEmergente;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author jdcor
 */
public class Edificio extends Lugar implements Ventana {
    private String foto;
    private String website;
    private int codigo;
    private String descripcion;
    private VentanaEmergente ventana = new VentanaEmergente();
    private final String linkPinIcon = "/images/pinEdificio.png";
    /**
     * @param nombre
     * @param foto
     * @param codigo
     * @param website
     * @param descripcion
     */
    public Edificio(String nombre, String foto, int codigo,String website, String descripcion) {
        super(nombre, 35);
        this.foto = foto;
        this.codigo = codigo;
        this.website = website;
        this.descripcion = descripcion;
        
        crearPin();
    } 

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public VentanaEmergente getVentana() {
        return ventana;
    }

    public void setVentana(VentanaEmergente ventana) {
        this.ventana = ventana;
    }

    

    
    
    @Override
    protected void crearPin() {
        this.pin = new Pin(linkPinIcon, this.getTamano());
        pin.setSize(pin.getWidth(), pin.getHeight());
        Edificio ed = this;
        this.pin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ed.mostrarPantalla();
            }
        });
        // ventana.mostrar("titulo", "foto", "link" "descripcion");
    }

    @Override
    public void mostrarPantalla() {
        ventana.mostrarPantalla(this.getNombre()+" | "+Integer.toString(codigo), foto, website, descripcion);
    }
    
}
