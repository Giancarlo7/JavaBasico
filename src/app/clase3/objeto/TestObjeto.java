package app.clase3.objeto;


public class TestObjeto {
    
public static void main(String[] arg){
            Socio s1 = new Socio(302, "David", "Tecsup"); 
            Socio s2= new Socio(302, "David", "Tecsup");
            if (s1 == s2 ) {
                System.out.println("Comprobando referencia");
}
            if (s1.equals(s2)){
                System.out.println("Comprobando el valor");
}
}
    
}
