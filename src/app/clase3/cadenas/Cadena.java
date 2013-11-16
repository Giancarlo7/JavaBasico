
package app.clase3.cadenas;

public class Cadena {
        public static void main(String[] args) {
            Cadena.metodosString();
            
            
  }     
        
        public static void buffer2(){
            StringBuffer sb = new StringBuffer("Java Basico Tecsup Lima");
            sb.insert(11," en");
            sb.delete(21,sb.length());
                
                System.out.println(sb);
            
                
        }
        public static void buffer1(){
            
            StringBuffer buffer = new StringBuffer("Tecsup");
            buffer.append(" - ");       //appebnd sirve para agregar al primer texto
            buffer.append("Java"); 
            
            buffer.insert(0, "Instituto"); // inserta texto depende de la cntidad que le asignes
            buffer.delete(buffer.indexOf("Java"),buffer.length());
            System.out.println(buffer);
            
            System.out.println(buffer.reverse());
        
        }
        
        
        public static void metodosString() {
            
            String jose = "jose luis eusebio";
                    System.out.println(jose.toUpperCase());// en mayuscula
                    System.out.println(jose.contains("u"));
                    System.out.println(jose.length()); // numero de espacios
                    System.out.println(jose.trim()); // corre espacio
                    
        }
        
        public static void reemplazo() {
            String palabras = "java permite crear java applets, javabeans y java servlets";
            
            palabras = palabras.replaceAll("java", "php");
            
            System.out.println(palabras);


        }
        
        public static void extraccion2(){
            String texto = "tecsup";
            
            System.out.println(texto.subSequence(1, 3));
            System.out.println(texto.substring(2));        
        }
        
       public static void extraccion() {
       String texto = "Tecsup";
            System.out.println("Número de Caracteres: "+texto.length()+"\n");
        for (int i=0; i<texto.length(); i++) {
             System.out.println(texto.substring(i,i+1)+"\n");
        }
        }
        public static void concatenar(){
            String nombre = "James";
            String apellido = "Gosling";

            if(nombre.equals("James")) {
                System.out.println(nombre+" "+apellido);
}
            String completo = nombre.concat(" "+apellido);
            if(nombre.equals("James")) {
                System.out.println(completo);
}
}
}

