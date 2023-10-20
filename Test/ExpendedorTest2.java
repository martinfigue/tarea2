import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest2 {

    @Test
    @DisplayName("Test PagoInsuficienteException")
    void testComprarUnProducto() throws Exception {
        Expendedor exp = new Expendedor(5, 700);
        Moneda m;
        Comprador c;
        m = new Moneda100();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queConsumiste()+", "+c.cuantoVuelto());

    }
}