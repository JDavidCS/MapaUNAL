/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficos;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author jdcor
 */
public class Pantalla extends JPanel {
    static MenuLateral menuLateral;
    
    public Pantalla(){
        // atributos del contenedor "Mayor"
        this.setLayout(new BorderLayout(20,20)); //20,20 es la margen
        iniciar();
    }
    
    private void iniciar(){
        // Para permitir un tamaño fijo al mapa
        JPanel adapt = new JPanel();
        adapt.setLayout(null);
        
        menuLateral = new MenuLateral();
        this.add(menuLateral, BorderLayout.WEST);
        
        Mapa mp = new Mapa();   
        
       
        adapt.add(mp);
        this.add(adapt, BorderLayout.CENTER);
    }
}
