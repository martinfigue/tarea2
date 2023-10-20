import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {

    @BeforeEach
    void setUp() {
        Expendedor exp = new Expendedor(100, 300);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test comprar varios productos")
    void testComprarVariosProductos() throws Exception {
        Expendedor exp = new Expendedor(3, 700);
        Moneda m;
        Comprador c;
        Comprador a;
        Comprador l;
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queConsumiste()+", "+c.cuantoVuelto());
        a = new Comprador(m,Expendedor.FANTA,exp);
        System.out.println(a.queConsumiste()+", "+a.cuantoVuelto());
        l = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(l.queConsumiste()+", "+l.cuantoVuelto());
    }
    @Test
    @DisplayName("Test NoHayProductoException")
    void testComprar2Productos() throws Exception {
        Exception exception = assertThrows(NoHayProductoException.class,()->{
        Expendedor exp = new Expendedor(1, 900);
        Moneda m;
        Comprador c;
        Comprador i;
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.SNICKERS, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        i = new Comprador(m, Expendedor.SNICKERS, exp);
        System.out.println(i.queConsumiste() + ", " + c.cuantoVuelto());
        });
    }
}