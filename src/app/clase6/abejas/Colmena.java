
package app.clase6.abejas;


public class Colmena {
    
    
         public static void main(String[] args) {
             
             Reinas abeja1 = new Reinas ("Reina", "Poner Huevos");
             abeja1.Genero();
             abeja1.CicloDeDesarrollo();
             abeja1.Alimento();
             
             Zanganos abeja2 = new Zanganos ("Zangano", "Fecundar a la Reina");
             abeja2.Genero();
             abeja2.CicloDeDesarrollo();
             abeja2.Alimento();
                     
             Obreras abeja3 = new Obreras ("Obreras", "Recolectar polen, nectar, propoleo");
             abeja3.Genero();
             abeja3.CicloDeDesarrollo();
             abeja3.Alimento();
             
         }

}
