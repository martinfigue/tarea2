import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest2 {

    @Test
    @DisplayName("Test PagoInsuficienteException")
    void testComprarUnProducto() throws Exception {
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
}