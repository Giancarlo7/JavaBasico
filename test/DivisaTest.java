
import app.clase6.modelo.Divisa;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivisaTest {

    public DivisaTest() {
    }
   @Test
    public void testDivisa() throws Exception {
        System.out.println("SUMAR DIVISAS");
        
        Divisa divisaUNO = new Divisa(10, "Soles");
        Divisa divisaDOS = new Divisa(20, "Soles");
        Divisa divisaESPERADA = new Divisa(30, "Soles");
        Divisa divisaRESULTADO = divisaDOS.sumar(divisaUNO);
        assertEquals(divisaESPERADA.getImporte(), divisaRESULTADO.getImporte());
    }
}