package app.clase3.interfases.capital;

import app.clase3.interfases.capital.*;

public class Palabra implements Capitalizable {

    private String texto;

    public Palabra(String texto) {
        this.texto = texto;
    }
    
    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
        return texto.toLowerCase();
    }
    
}
