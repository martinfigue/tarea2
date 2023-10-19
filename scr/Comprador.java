public class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualProducto, Expendedor exp){
        vuelto = 0;
        Producto p = exp.comprarProducto(m, cualProducto);
        if(p != null){
            sonido = p.beber();
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

    public String queBebiste(){
        return sonido;
    }
}
