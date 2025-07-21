/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jdcor
 */
public class MenuLateral extends JPanel {
    private ArrayList<JLabel> edificios = new ArrayList();
    private ArrayList<JLabel> servicios = new ArrayList();
    private ArrayList<JLabel> objetos = new ArrayList();
    private JCheckBox op1, op2, op3;
    
    
    public MenuLateral(){
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(300,100));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));

        iniciar();
    }

    public ArrayList getEdificios() {
        return edificios;
    }

    public void setEdificios(ArrayList edificios) {
        this.edificios = edificios;
    }

    public ArrayList getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList servicios) {
        this.servicios = servicios;
    }

    public ArrayList getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList objetos) {
        this.objetos = objetos;
    }
    
    
    private void iniciar(){
        // titulo
        JLabel titulo = new JLabel("Menú");
        titulo.setFont(new Font("Sans-serif", Font.BOLD, 30));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(titulo);
        
        //check list horizontal
        JPanel checkList = new JPanel();
        checkList.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
        checkList.setBackground(Color.WHITE);
        checkList.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        op1 = new JCheckBox("Edificios", true);
        op1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op1.isSelected()){
                    for(JLabel el:edificios){
                        el.setVisible(true);
                        el.repaint();
                    }
                } else {
                    for(JLabel el:edificios){
                        el.setVisible(false);
                        el.repaint();
                    }
                }
                
            }
                
        });
        op1.setSelected(true);
        
        op2 = new JCheckBox("Servicios", true);
        op2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op2.isSelected()){
                    for(JLabel el:servicios){
                        el.setVisible(true);
                        el.repaint();
                    }
                } else {
                    for(JLabel el:servicios){
                        el.setVisible(false);
                        el.repaint();
                    }
                }   
            }   
        });
        
        op3 = new JCheckBox("Objetos", true);
        op3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op3.isSelected()){
                    for(JLabel el:objetos){
                        el.setVisible(true);
                        el.repaint();
                    }
                } else {
                    for(JLabel el:objetos){
                        el.setVisible(false);
                        el.repaint();
                    }
                }   
            }   
        });
        
        checkList.add(op1);
        checkList.add(op2);
        checkList.add(op3);
        add(checkList);
    }
    
    public void setChecklist(boolean status){
        op1.setEnabled(status);
        op1.setSelected(status);
        op2.setEnabled(status);
        op2.setSelected(status);
        op3.setEnabled(status);
        op3.setSelected(status);
    }
}
