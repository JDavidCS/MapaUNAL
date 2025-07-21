/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


/**
 *
 * @author jdcor
 */
public abstract class Lugar {
    private String nombre;
    private String srcPinIcon;
    private final int tamano;
    protected Pin pin;
    public Lugar(String nombre, int tamano){
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSrcPinIcon() {
        return srcPinIcon;
    }

    public void setSrcPinIcon(String srcPinIcon) {
        this.srcPinIcon = srcPinIcon;
    }
    
    
    public Pin getPin(){
        return pin;
    }
    protected void setPin(Pin pin){
        this.pin = pin;
    }
    protected abstract void crearPin();
}
