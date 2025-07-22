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
        // Parte Grafica
        VentanaInicial v = new VentanaInicial("Mapa Unal");
        Pantalla p = new Pantalla();
        v.add(p);
        
        v.setVisible(true);
    }
    
    public static void iniciarPrograma(){
        // inicializar y declarar los lugares
        Edificio viejo = new Edificio("Julio Garavito Armero", "/images/img_Viejo.jpg",401, "https://ingenieria.bogota.unal.edu.co/", "<html>"+ "<div style='text-align: center; width: 100%;'>" + "Conoce el Edificio 401 - Julio Garavito Armero de la Facultad de Ingeniería </h3>" +
        "<br>Este icónico edificio en nuestro campus universitario tiene una historia fascinante."+
        "<br>Fue construido en 1945 bajo la visión del arquitecto Leopoldo Rother, "+
        "<br>con el propósito de integrar la Facultad de Ingeniería al corazón de nuestra universidad." +
        "<br>Inicialmente, este edificio albergaba aulas, talleres para dibujo, oficinas administrativas, despachos de profesores, una biblioteca y una acogedora cafetería."+
        "<br>Un espacio lleno de conocimiento y creatividad donde se forjaron grandes ingenieros." +
        "<br>Pero la historia no termina ahí. En la década del 60, algunos de sus espacios fueron ocupados por la Facultad de Psicología (hoy departamento),"+ 
        "<br>demostrando su versatilidad y adaptabilidad a las necesidades cambiantes de la universidad." +
        "<br>Además, a lo largo de los años, el Edificio 401 ha experimentado modificaciones, manteniendo su esencia arquitectónica y adaptándose a las demandas modernas." +
        "<br>En el marco del cumpleaños 150 de nuestra amada Facultad de Ingeniería, se llevó a cabo una modernización y reforzamiento del Edificio 401, que se completó en el año 2014."+
        "<br>Ahora, este edificio emblemático sigue siendo un faro de la educación y la innovación." +
        "</div>" +
        "</html>");
        edificios.put(viejo.getCodigo(), viejo);
        Edificio quimica = new Edificio("Departamento de Quimica", "/images/img_Quimica.jpg",451, "https://ciencias.bogota.unal.edu.co/","<html>" + 
        "<h3>Departamento de Química - Historia Fundacional</h3>" +
        "<br>El Departamento de Química comenzó a funcionar el 1 de enero de 1937, como dependencia "
        + "<br>de la Escuela de Farmacia, bajo la dirección del profesor Antonio María Barriga Villalba. Por acuerdo del "
        + "<br>Consejo Directivo del 10 de febrero de 1938, se creó el cargo de Director Especial, el cual "
        + "<br>se confirió al doctor Antonio García Banús, especialista en Química Orgánica y antiguo catedrático "
        + "<br>de la Universidad de Barcelona, quien había sido contratado por el Gobierno Nacional para prestar "
        + "<br> sus servicios a la Universidad. Al finalizar este año, mediante Acuerdo 120 del 14 de diciembre," +
        "<br>el Consejo Directivo de la Universidad creó el Departamento de Química" +
        "<br>como dependencia directa de la Universidad, el cual funcionaría a partir del 1 de enero de 1939" +
        "<br>con un Director y un Consejo Especial, integrado además del Director, por los Decanos de las Facultades "
        + "<br>de Medicina e Ingeniería, por el director de la Escuela de Farmacia y por el secretario del Departamento, "
        + "<br>quien actuaría como representante de los profesores. Una vez organizado como ente autónomo, el "
        + "Departamento pudo contar con personal docente y administrativo, y además con un presupuesto propio." +
        "</html>"); 
        edificios.put(quimica.getCodigo(), quimica);
        Edificio nea = new Edificio("Nuevo Espacio para las Artes", "/images/img_NEA.jpg",303, "https://ingenieria.bogota.unal.edu.co/","<html>" +
        "<h3>Edificio de Arquitectura - Transformación Histórica</h3>" +
        "<br>El edificio original, también llamado Edificio de Arquitectura, fue un ícono de la arquitectura moderna en Colombia" +
        "<br>y se construyó a finales de los años sesenta. En 2011, se determinó que debía ser demolido" +
        "<br>debido a problemas estructurales y se desalojó el edificio. El nuevo edificio, que forma parte "
        + "<br>de la renovación de la Facultad de Artes se construyó en dos fases. La primera fase, que incluye los bloques B y C," +
        "<br>ya está en funcionamiento y cuenta con espacios como auditorios, aulas de clase, talleres y salas de cómputo." +
        "<br>La segunda fase, que corresponde al Bloque A," +"<br>está en desarrollo y se espera que cuente con laboratorios," +
        "<br>áreas administrativas, comedores, aulas informáticas, entre otros espacios." +
        "<br>El nuevo edificio beneficiará a estudiantes de Arquitectura, Diseño Gráfico, Diseño Industrial, Cine y Televisión." +
        "<br>Se espera que el nuevo edificio sea un referente en infraestructura para la educación superior en Colombia."+
        "</html>");
        edificios.put(nea.getCodigo(), nea);
        Edificio aCiencia = new Edificio("Aulas de Ciencia", "/images/img_aulasCiencia.jpg",564, "https://ciencias.bogota.unal.edu.co/" , "<html>" +
        "<br>Este edificio está ubicado en el campus de la Universidad Nacional de Colombia en Bogotá y "
        + "<br>pertenece a la Facultad de Ciencias y un área de ocupación construida de 172.000 m^2, tiene "
        + "<br>una relación de espacio público por habitante de 29 m^2, mientras que Bogotá, una de las "
        + "<br>ciudades más densas del mundo,tiene una relación de 4 m², haciendo del campus un oasis dentro de la ciudad." +
        "<br>La Facultad de Ciencias brinda la mayor cantidad de servicios académicos" +
        "<br>a la comunidad universitaria, dentro de sus tres fines misionales: docencia, investigación y extensión." +
        "<br>Sin embargo, los espacios destinados a la docencia, siendo adecuados como laboratorios y oficinas;" +
        "<br>sumado a esto, los edificios de la Facultad, no cumplen con las normas técnicas actuales," +
        "<br>siendo de gran atención, la desactualización a la norma sismo resistente NSR 2010." +
        "<br>En paralelo a las evaluaciones físicas de las edificaciones actuales,la Facultad de Ciencias, está organizada por Departamentos," +
        "<br>es decir, las propias edificaciones son aisladas para cada programa académico (Biología, Estadística, Física," +
        "<br>Farmacia, Química, Matemáticas, Geociencias)" +
        "</html>");
        edificios.put(aCiencia.getCodigo(), aCiencia);
        
        String Descripcion5  =  "<html>"+ "Del Edifciio de Aulas de Ingeniería <h3>"
            +"<br> A los 98 años falleció, la primera mujer ingeniera de la facultad, en el año 2011."
            + "<br> Actualmente el edificio de aulas de ingeniería lleva el nombre de Guillermina Uribe Bone." 
            + "<br>El edificio posee una arquitectura similar a los edificios de aulas de ciencias humanas y "
            + "<br>el antiguo edificio de arquitectura."
            + "<br> En salones distribuidos en cuatro plantas se imparten clases para todas carreras de la Facultad "
            + "<br>asi como servicios adicionales a otras areas de docencia dentro de la universidad, como el proyecto Explora."
            + "<br> Guillermina, la primera mujer en recibir el título de Ingeniera Civil de la Facultad de Matemáticas e Ingeniería de la"
            +"<br> Universidad Nacional de Colombia, en Bogotá, el sábado 18 de diciembre de 1948, "
            + "<br>según Certificado de Graduación No. 779; es decir hace 75 años. " 
            + "</html>";


        Edificio aIng = new Edificio("Edificio Aulas de Ingeniería Guillermina Uribe Bone","/images/img_aulasIng.jpg", 453, "https://ingenieria.bogota.unal.edu.co/" , Descripcion5);
        edificios.put(aIng.getCodigo(), aIng);

        String Descripcion6 = "<html>"+ "<div style='text-align: center; width: 100%;'>" + "Del Rogelio Salmona <h3>"+
            "<br> Inaugurado en el año 2000, el actual edificio para posgrado de Ciencias Humanas llamado en "
            + "<br>honor a su arquitecto, Rogelio Salmona, posee el estilo arquitectónico de Salmona"
            + "<br> que se expresa en su similitud con obras del arquitecto como las Torres del parque o la Biblioteca Distrital Virgilio Barco."
            + "<br> Con una estructura de canales construida en ladrillo es una muestra de uno de los mas grandes arquitectos Colombianos, dentro de la UNAL."
            + "<br> Actualmente en las instalaciones del edificio se prestan servicios de Biblioteca, administrativos, docencia  y adicionalmente de eventos"
            + "<br> en sus auditorios prestos para el desarrollo de actividades de bienestar, idiomas entre otras."
            + "<br>El edificio esta siempre presto para el desarrollo  de actividades de ocio y esparcimiento social."
            + "</div>" + "</html>";

        Edificio salmona = new Edificio("Edificio Rogelio Salmona", "/images/img_salmona.jpg",225,"https://www.humanas.unal.edu.co/", Descripcion6);
        edificios.put(salmona.getCodigo(), salmona);

        String Descripcion7 = "<html>"+ "<div style='text-align: center; width: 100%;'>" + "De Veterinaria y Zootecnia <h3>"
            + "<br> Edificio adjunto de la facultad creada en 1885 en el cual se imparten clases para las carreras de Zootecnia y Veterinaria."
            + "<br>En conjunto con las instalaciones adyacentes del hospital de pequeños y grandes animales y la es tablo frente al edificio"
            +"<br> Gloria Galeano. El actual edificio data su construcción alrededor de la década de los setenta. En esta Facultad se llevan "
            +"<br>actividades que involucran pequeños animales desde caninos y felinos hasta animales como vacas, toros, caballos y ovejas." + "</div>" + "</html>";

        Edificio vete = new Edificio("Edificio de la Facultad de Medicina Veterinaria y Zootecnia", "/images/img_veterinaria.jpg",481,"http://www.veterinaria.unal.edu.co/", Descripcion7);
        edificios.put(vete.getCodigo(), vete);

        String Descripcion8 = "<html>"+ "Del FEM <h3>"
            + "<br>El edificio alberga los departamentos de Física, Matemáticas y Estadística. Este cuenta con instalaciones de docencia tanto"
            + "<br>para clases teóricas como para clases experimentales del area de la Física, que se imparten para estudiantes de toda la "
            + "<br> Sede. El edificio construido como producto de la misión alemana que dio origen a la Facultad de Ciencias lleva el nombre "
            +"<br>del profesor de Matemáticas YU Takeuchi pionero en el estudio y docencia de las matemáticas puras en el pais. Actualmente "
            + " <br>existe un edificio adjunto, el 405 o la piscina, que fue construido "
            + "<br>posteriormente unto a la tercera planta del edificio donde se ubican las oficinas y salas del profesorado."+ "</html>";


        Edificio yu = new Edificio("Edificio Yu Takeuchi","/images/img_yu.jpg",404,"https://ciencias.bogota.unal.edu.co/", Descripcion8);
        edificios.put(yu.getCodigo(), yu);
        
        
        // Servicios - Servicios repetidos key 0-5
        Servicio biblio1 = new Servicio(
                "Biblioteca Gabriel Garcia Marquez", "<html>HORARIO:<br>Lunes a jueves: 6 a.m. a 10 p.m."
                        + "<br>Viernes: 6 a.m. a 4 p.m. "
                        + "<br>Sabados: 8 a.m. a 5 p.m.</html>"
        );
        servicios.put(102, biblio1);
        Servicio biblio2 = new Servicio("Biblioteca de Ciencia y Tecnologia", "<html>HORARIO:<br>Lunes a jueves: 6 a.m. a 10 p.m."
                        + "<br>Viernes: 6 a.m. a 4 p.m. <br>Sabados: 8 a.m. a 5 p.m.</html>");
        servicios.put(454, biblio2);
        Servicio biblio3 = new Servicio("Biblioteca (hemeroteca) Nacional Universitaria Carlos Lleras Restrepo", "<html>HORARIO:"
                        + "<br>Lunes a jueves: 7 a.m. a 10 p.m."
                        + "<br>Viernes: 7 a.m. a 4 p.m. "
                        + "<br>Sabados: 8 a.m. a 5 p.m.</html>");
        servicios.put(571, biblio3);
        Servicio biblio4 = new Servicio("Biblioteca Posgrados de Ciencias Humanas Ernesto Guhl", "<html>HORARIO:"
                        + "<br>Lunes a jueves: 7 a.m. a 8 p.m."
                        + "<br>Viernes: 7 a.m. a 4 p.m. "
                        + "<br>Sabados: 8 a.m. a 1 p.m.</html>");
        servicios.put(225, biblio4);
        Servicio biblio5 = new Servicio("Biblioteca Derecho y Ciencias Politicas Arturo Valencia Zea", "<html>HORARIO:"
                        + "<br>Lunes a jueves: 7 a.m. a 8 p.m."
                        + "<br>Viernes: 7 a.m. a 4 p.m. "
                        + "<br>Sabados: 8 a.m. a 1 p.m.</html>");
        servicios.put(201, biblio5);
        Servicio biblio6 = new Servicio("Biblioteca Ciencias Economicas Antonio Garcia Nossa", "<html>HORARIO:"
                        + "<br>Lunes a jueves: 7 a.m. a 8 p.m."
                        + "<br>Viernes: 7 a.m. a 4 p.m. "
                        + "<br>Sabados: 8 a.m. a 1 p.m.</html>");
        servicios.put(310, biblio6);
        Servicio biblio7 = new Servicio("Biblioteca Ciencias Agrarias", "<html>HORARIO:"
                        + "<br>Lunes a jueves: 7 a.m. a 8 p.m."
                        + "<br>Viernes: 7 a.m. a 4 p.m. "
                        + "<br>Sabados: 8 a.m. a 1 p.m.</html>");
        servicios.put(500, biblio7);
        Servicio biblio8 = new Servicio("Biblioteca de Lenguas Extranjeras", "<html>HORARIO:"
                        + "<br>Lunes a jueves: 7 a.m. a 8 p.m."
                        + "<br>Viernes: 7 a.m. a 4 p.m. "
                        + "<br>Sabados: 8 a.m. a 5 p.m.</html>");
        servicios.put(231, biblio8);
        Servicio biblio9 = new Servicio("Biblioteca Colegio IPARM", "<html>HORARIO:"
                        + "<br>Lunes a jueves: 7 a.m. a 8 p.m."
                        + "<br>Viernes: 7 a.m. a 4 p.m. "
                        + "<br>Sabados: 8 a.m. a 5 p.m.</html>");
        servicios.put(431, biblio9);
        
        Servicio biciRun = new Servicio("Bicirun", "Horario: Lunes a viernes de 6:30 a.m. | 3:30 p.m.", "/images/pinBicicleta.png");
        servicios.put(1, biciRun);
        Servicio cafeteria = new Servicio("Cafeteria", "", "/images/pinCafeteria.png");
        servicios.put(2, cafeteria);
        Servicio comedor = new Servicio("Comedor", "<html>HORARIOS: Desayuno: 6:00 am a 9:00 am "
                        + "<br>Almuerzo: 11:30 am a 2:30 pm</html>", "/images/pinComedor.png");
        servicios.put(3, comedor);
        
        Objeto obj = new Objeto("Punto de Agua", "/images/objetoAgua.png");
        objetos.put("agua", obj);
        Objeto obj2 = new Objeto("Maquina Dispensadora", "/images/objetoMaquina.png");
        objetos.put("maquina", obj2);
        
    }
}
