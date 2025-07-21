/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


/**
 *
 * @author jdcor
 */
public class Objeto extends Lugar {
    private String linkPinIcon;
    
    
    public Objeto(String nombre, String linkPinIcon) {
        super(nombre, 35);
        this.linkPinIcon = linkPinIcon;
        crearPin();
    }

    @Override
    protected void crearPin() {
        this.pin = new Pin(linkPinIcon, this.getTamano());
        pin.setSize(pin.getWidth(), pin.getHeight());
        pin.setToolTipText(this.getNombre());
    }
    
}
