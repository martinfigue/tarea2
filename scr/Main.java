/**
 * El main del trabajo
 * @author ignaciodiaz
 * @author martinfigueroa
 * Aqui estan mostradas las funcionalidades probadas en los test 
 */

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Expendedor exp = new Expendedor(1, 900);
            Moneda m;
            Comprador c;
            Comprador i;
            m = new Moneda1000();
            c = new Comprador(m, Expendedor.SNICKERS, exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
            i = new Comprador(m, Expendedor.SNICKERS, exp);
            System.out.println(i.queConsumiste() + ", " + c.cuantoVuelto());
        }
        catch (Exception NoHayProductoException) {
                System.out.println("No hay más de este producto");
        }
        try {
            Expendedor exp = new Expendedor(5, 700);
            Moneda m;
            Comprador c;
            m = new Moneda100();
            c = new Comprador(m,Expendedor.COCA,exp);
            System.out.println(c.queConsumiste()+", "+c.cuantoVuelto());
        }
        catch (Exception PagoInsuficienteException) {
            System.out.println("Pago insuficiente");
        }
        try{
            Expendedor exp = new Expendedor(5, 700);
            Moneda m = null;
            Comprador c;
            c = new Comprador(m,Expendedor.COCA,exp);
            System.out.println(c.queConsumiste()+", "+c.cuantoVuelto());

        }
        catch (Exception PagoIncorrectoException) {
            System.out.println("Vuelva a ingresar una moneda válida");
        }
    }

}