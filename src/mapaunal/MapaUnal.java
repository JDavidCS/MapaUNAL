/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapaunal;

import Clases.Edificio;
import Clases.Lugar;
import Clases.Objeto;
import Clases.Servicio;
import Graficos.VentanaInicial;
import java.util.HashMap;
import java.util.Map;
import Graficos.Pantalla;

/**
 *
 * @author jdcor
 */
public class MapaUnal {
    
    public static Map<Integer, Lugar> edificios = new HashMap<>();
    public static Map<Integer, Lugar> servicios = new HashMap<>();
    public static Map<String, Lugar> objetos = new HashMap<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear los objetos que se van a usar
        iniciarPrograma();
        VentanaInicial v = new VentanaInicial("Mapa Unal");
        Pantalla p = new Pantalla();
        v.add(p);
        
        v.setVisible(true);
    }
    
    public static void iniciarPrograma(){
        // inicializar y declarar los lugares
        Edificio viejo = new Edificio("viejo", "/images/img_Viejo.jpg",401, "https://hola.com", "hola");
        edificios.put(viejo.getCodigo(), viejo);
        Edificio quimica = new Edificio("Departamento de Quimica", "/images/img_Quimica.jpg",451, "hola", "hola");
        edificios.put(quimica.getCodigo(), quimica);
        Edificio nea = new Edificio("Nuevo Espacio para las Artes", "/images/img_NEA.jpg",303, "hola", "hola");
        edificios.put(nea.getCodigo(), nea);
        Edificio aCiencia = new Edificio("Aulas de Ciencia", "/images/img_aulasCiencia.jpg",564, "hola", "hola");
        edificios.put(aCiencia.getCodigo(), aCiencia);
        Edificio aIng = new Edificio("Aulas de Ingenieria", "/images/img_aulasIng.jpg",453, "hola", "hola");
        edificios.put(aIng.getCodigo(), aIng);
        Edificio salmona = new Edificio("Rogelio Salmona", "/images/img_salmona.jpg", 225, "hola", "hola");
        edificios.put(salmona.getCodigo(), salmona);
        Edificio vete = new Edificio("Facultad de Medicina Veterinaria y Zootecnia", "/images/img_veterinaria.jpg",481, "hola", "hola");
        edificios.put(vete.getCodigo(), vete);
        Edificio yu = new Edificio("Yu Takeuchi", "/images/img_yu.jpg",404, "hola", "hola");
        edificios.put(yu.getCodigo(), yu);
        
        // Servicios - Servicios repetidos key 0-5
        Servicio biblio1 = new Servicio("Biblioteca Gabriel Garcia Marquez", "horario: 7-18");
        servicios.put(102, biblio1);
        Servicio biblio2 = new Servicio("Biblioteca de Ciencia y Tecnologia", "horario: 7-18");
        servicios.put(454, biblio2);
        Servicio biblio3 = new Servicio("Biblioteca (hemeroteca) Nacional Universitaria Carlos Lleras Restrepo", "horario: 7-18");
        servicios.put(571, biblio3);
        Servicio biblio4 = new Servicio("Biblioteca Posgrados de Ciencias Humanas Ernesto Guhl", "horario: 7-18");
        servicios.put(225, biblio4);
        Servicio biblio5 = new Servicio("Biblioteca Derecho y Ciencias Politicas Arturo Valencia Zea", "horario: 7-18");
        servicios.put(201, biblio5);
        Servicio biblio6 = new Servicio("Biblioteca Ciencias Economicas Antonio Garcia Nossa", "horario: 7-18");
        servicios.put(310, biblio6);
        Servicio biblio7 = new Servicio("Biblioteca Ciencias Agrarias", "horario: 7-18");
        servicios.put(500, biblio7);
        Servicio biblio8 = new Servicio("Biblioteca de Lenguas Extranjeras", "horario: 7-18");
        servicios.put(231, biblio8);
        
        Servicio biciRun = new Servicio("Bicirun", "Horario\nLunes a viernes de 6:30 a.m. | 3:30 p.m.", "/images/pinBicicleta.png");
        servicios.put(1, biciRun);
        Servicio cafeteria = new Servicio("Cafeteria", "", "/images/pinCafeteria.png");
        servicios.put(2, cafeteria);
        Servicio comedor = new Servicio("Comedor", "HORARIOS:\n Desayuno: 6:00 am a 9:00 am\n Almuerzo: 11:30 am a 2:30 pm", "/images/pinComedor.png");
        servicios.put(3, comedor);
        
        Objeto obj = new Objeto("Punto de Agua", "/images/objetoAgua.png");
        objetos.put("agua", obj);
        Objeto obj2 = new Objeto("Maquina Dispensadora", "/images/objetoMaquina.png");
        objetos.put("maquina", obj2);
        
    }
}
