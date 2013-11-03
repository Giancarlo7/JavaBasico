package app.clase2.persona;
// copiar una linea SHIFT + CONTROL + FLECHA ABAJO
// 
public class AppPersona {
    public static void main(String[] args) {
        
        Persona gian = new Persona("Gian", "CJ", 20);
        
        System.out.println("Atributos del objeto");
        System.out.println("nombres: "+gian.getNombres());
        System.out.println("Apellidos: "+gian.getApellidos());
        System.out.println("Edad: "+gian.getEdad());
         
        Persona gian2 = new Persona();
        gian2.setNombresApellidos("Gian", "CJ");
        System.out.println("NombresApellidos: "+gian2.getApellidos()+" "+gian2.getNombres());
        
        
        
    }
    
}
