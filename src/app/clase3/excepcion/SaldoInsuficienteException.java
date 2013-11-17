package app.clase3.excepcion;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(double saldo, double cuantoDesea) {
        super("En su cuenta tiene " + saldo + " soles. "
                + "No puede prestarse " + cuantoDesea + " soles.");

    }
}
