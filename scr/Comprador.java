public class Comprador{
    private String sonido;
    private int vuelto;
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

    public int cuantoVuelto(){
        return vuelto;
    }

    public String queConsumiste(){
        return sonido;
    }
}
