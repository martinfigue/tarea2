import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest3 {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test PagoIncorrectoException")
    void testComprarUnProducto() throws Exception {
        Expendedor exp = new Expendedor(5, 700);
        Moneda m = null;
        Comprador c;
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queConsumiste()+", "+c.cuantoVuelto());

    }
}