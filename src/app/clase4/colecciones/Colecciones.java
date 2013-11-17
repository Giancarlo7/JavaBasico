package app.clase4.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Colecciones {

    public static void main(String[] args) {
        Colecciones.ejempLpMap();
    }

    public static void ejempLpMap() {
        
        Estudiante gian = new Estudiante("Gian", "Cama Jimenez");
        Estudiante luis = new Estudiante("Luis", "Dias Gutierres");
        Estudiante juan = new Estudiante("Juan", "Perez Montero");
        Estudiante mario = new Estudiante("Mario", "Lopez Luque");
        
        HashMap<String, Estudiante> listado = new HashMap<String, Estudiante>();
        listado.put("123", mario);
        listado.put("124", juan);
        listado.put("125", luis);
        listado.put("126", gian);
        
        listado.get("125").printEstudiante(); // ejecuta listado especifico
        
        Collection<Estudiante> listadoMap = listado.values(); // te ejecuta todo el listado
        for (Estudiante estudiante : listadoMap) {
            estudiante.printEstudiante();
            
        }
        
    }
    
    
    public static void ejempLoHashSet() {
        Estudiante gian = new Estudiante("Gian", "Cama Jimenez");
        Estudiante luis = new Estudiante("Luis", "Dias Gutierres");
        Estudiante juan = new Estudiante("Juan", "Perez Montero");
        Estudiante mario = new Estudiante("Mario", "Lopez Luque");
        Estudiante jesus = new Estudiante("Jesus", "Fernandez Armas");

        Set<Estudiante> listado = new HashSet<Estudiante>();
        listado.add(jesus);
        listado.add(jesus);
        listado.add(mario);
        listado.add(mario);
        listado.add(juan);
        listado.add(juan);
        listado.add(luis);
        listado.add(gian);
        listado.add(gian);

        for (Estudiante estudiante : listado) {
            estudiante.printEstudiante();

        }
        System.out.println(listado.size());
        
    }

    public static void ejemploLinkedList() {

        Estudiante gian = new Estudiante("Gian", "Cama Jimenez");
        Estudiante luis = new Estudiante("Luis", "Dias Gutierres");
        Estudiante juan = new Estudiante("Juan", "Perez Montero");

        LinkedList<Estudiante> listado = new LinkedList<Estudiante>();
        listado.add(gian);
        listado.add(luis);
        listado.add(juan);

        ListIterator<Estudiante> ite = listado.listIterator();
        while (ite.hasNext()) {
            Estudiante e = (Estudiante) listado.poll();
            e.printEstudiante();
        }
        System.out.println(listado.size());


    }

    public static void ejemploEstudiantes() {

        Estudiante gian = new Estudiante("Gian", "Cama Jimenez");
        Estudiante luis = new Estudiante("Luis", "Dias Gutierres");
        Estudiante juan = new Estudiante("Juan", "Perez Montero");
        Estudiante mario = new Estudiante("Mario", "Lopez Luque");
        Estudiante jesus = new Estudiante("Jesus", "Fernandez Armas");

        List<Estudiante> listado = new ArrayList<Estudiante>();
        listado.add(jesus);
        listado.add(mario);
        listado.add(juan);
        listado.add(luis);
        listado.add(gian);

        Collections.sort(listado);

        for (Estudiante estudiante : listado) {
            estudiante.printEstudiante();
        }
// para imprimir elemento especifico
        luis = listado.get(3);
        luis.printEstudiante();
    }
}