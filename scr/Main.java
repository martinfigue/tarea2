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
                System.out.println("No hay mas de este producto");
        }
    }
}