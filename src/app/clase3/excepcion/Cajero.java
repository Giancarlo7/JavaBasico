package app.clase3.excepcion;

public class Cajero {

    public static void main(String[] args) {

        try {

            Cuenta cuentajose = new Cuenta("Jose", 5000);

            System.out.println(cuentajose.retirarCajero(3000));
            System.out.println(cuentajose.retirarCajero(4000));

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

       

    }
}
