import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {

    @BeforeEach
    void setUp() {
        Expendedor exp = new Expendedor(2, 300);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pruebaCompraruUnProducto() throws NoHayProductoException {
        Expendedor exp = new Expendedor(2, 300);
        Moneda m;
        Comprador c;
        m = new Moneda500();
        c = new Comprador(m,Expendedor.FANTA,exp);
        System.out.println(c.queConsumiste()+", "+c.cuantoVuelto());
    }

    @Test
    void pruebagetVuelto() {
    }
}