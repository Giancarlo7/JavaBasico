package app.clase2.animales;


public class zoologico {
    
    public static void main(String[] args) {
        
        Tigre diego = new Tigre("Diego", 8);
        diego.hacerRuido();
        diego.hacerRuido(true);
        diego.comer();
        Gallina mamba = new Gallina("Mamba", 2);
        mamba.hacerRuido();
        mamba.comer();
        vicuña nala = new vicuña("Nala", 3);
        nala.hacerRuido();
        nala.comer();
        
    }
    
}
