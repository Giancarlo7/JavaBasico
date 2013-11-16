package app.clase3.universo;

import app.clase3.universo.abstractas.Humano;

public class Terricola extends Humano {

    @Override
    public void comer() {
        System.out.println("comiendo");
    }

    @Override
    public void comunicarse() {
        System.out.println("comunicandose en Ingles");
    }

    @Override
    public void sentir() {
        System.out.println("confundido");
    }
}
