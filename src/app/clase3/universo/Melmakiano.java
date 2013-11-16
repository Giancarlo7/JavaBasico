
package app.clase3.universo;

import app.clase3.universo.abstractas.Alienigena;

public class Melmakiano extends Alienigena{

    @Override
    public void comer() {
        System.out.println("comiendo gato");
    }

    @Override
    public void comunicarse() {
        System.out.println("gritando");
    }

    @Override
    public void sentir() {
        System.out.println("amando");
    }
    
}
