package app.clase2.bicicleta;
// selecionnar y control+r = modifica todas las palabras al mismo tiempo
public class appbicicleta {

    public static void main(String[] args) {

        Bicicleta  Monark = new Bicicleta();
        Monark.setMarca("Monark");
        Monark.setModelo("123");

        Monark.cambiarLlantas();

        System.out.println(Monark.getMarca());
        
    }
}
