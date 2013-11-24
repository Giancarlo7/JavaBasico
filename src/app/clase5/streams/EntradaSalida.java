package app.clase5.streams;

import java.io.File;

public class EntradaSalida {

    public static void main(String[] Args) {
        EntradaSalida.createDirectorio();
    }

    public static void verifyFile() {

        File f = new File("C:\\archivo.txt");

        System.out.println("Nombre: " + f.getName());
        System.out.println("Ruta : " + f.getPath());
        System.out.println("Ruta Absoluta: " + f.getAbsolutePath());

        if (f.exists()) {
            System.out.println("Archivo sí existe!");
            System.out.println((f.canRead()) ? "Sí se puede leer" : "");
            System.out.println((f.canWrite()) ? "Sí se puede escribir" : "");
            System.out.println("La longitud del archivo es de " + f.length() + " bytes");

        } else {
            System.out.println("ARCHIVO NO EXISTE");
        }
    }

    public static void ListarDirectorio() {


        File dir = new File("C:\\ ");

        if (dir.isDirectory() && dir.exists()) {
        }

        for (String subDir : dir.list()) {
            System.out.println(subDir);
        }
    }

    public static void createDirectorio() {

        File dir = new File("c:\\javatecsup");

        if (!dir.isDirectory() && !dir.exists()) {
            dir.mkdir();
        }

    }
}