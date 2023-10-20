/**
 * Comprador del trabajo
 * @author ignaciodiaz
 * @author martinfigueroa
 */
public class Comprador{
    private String sonido;
    private int vuelto;

    /** Manejo de lo que el comprador consume junto con la forma de recibir y pedir el vuelto si es necesario
     *
     * @param m la moneda
     * @param cualProducto el producto que se desea comprar
     * @param exp el expendedor
     * @throws Exception
     */
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws Exception {
        vuelto = 0;
        Producto p = exp.comprarProducto(m, cualProducto);
        if(p != null){
            sonido = p.consumir();
        }
        Moneda v = exp.getVuelto();
        while(v != null){
            vuelto = v.getValor() + vuelto;
            v = exp.getVuelto();
        }

    }

    /** El vuelto total
     *
     * @return el vuelto total
     */
    public int cuantoVuelto(){
        return vuelto;
    }

    /**
     *  Lo que consume el comprador
     * @return el producto comprado y consumido
     */
    public String queConsumiste(){
        return sonido;
    }
}
