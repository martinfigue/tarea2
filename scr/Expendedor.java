/**
 * El expendedor del trabajo
 * @author ignaciodiaz
 * @author martinfigueroa
 */
public class Expendedor{
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public  static final int FANTA = 3;
    public static final int SNICKERS = 4;
    public static final int SUPER8 = 5;
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private Deposito snickers;
    private Deposito super8;
    private Deposito monVu;
    private int precio;

    /** Expendedor y sus depositos
     *
     * @param numProductos
     * @param precioProductos
     */
    public Expendedor(int numProductos, int precioProductos){
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        snickers = new Deposito();
        super8 = new Deposito();
        monVu = new Deposito();
        precio = precioProductos;
        for(int i=0; i<numProductos; i++){
            CocaCola c = new CocaCola(100+i);
            Sprite s = new Sprite(200+i);
            Fanta f = new Fanta(200+i);
            Snickers k = new Snickers(200+i);
            Super8 p = new Super8(200+i);
            coca.addElemento(c);
            sprite.addElemento(s);
            fanta.addElemento(f);
            snickers.addElemento(k);
            super8.addElemento(p);
        }
    }

    /**
     *
     * @param m la moneda
     * @param n lo que se desea comprar
     * @return lo que se compró y el vuelto si es necesario
     * @throws PagoIncorrectoException puede lanzar esta excepcion si se ingresa una moneda que no es valida
     * @throws PagoInsuficienteException puede lanzar esta excepcion si el pago ingresado no es suficiente
     * @throws NoHayProductoException puede lanzar esta excepcion si en el deposito no hay mas de ese producto
     */
    public Producto comprarProducto(Moneda m, int n) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        int x = 0;
        if (m == null){
            throw new PagoIncorrectoException("Vuelva a ingresar una moneda válida");
        }
        if(m != null) {
            x = m.getValor();
        }

        if((n == COCA || n == SPRITE || n == FANTA || n == SNICKERS || n == SUPER8) && x < precio){
            monVu.addElemento(m);
            throw new PagoInsuficienteException("Pago insuficiente");
        }
        if(n==COCA  && m!=null && x>=precio){
            Bebida c = (Bebida) coca.getElemento();
            if(c == null){
                throw new NoHayProductoException("No hay mas de este producto");
            }
            if(c != null){
                for(int i = 0; i<(x - precio)/100; i++){
                    Moneda m100 = new Moneda100();
                    monVu.addElemento(m100);
                }
                return c;
            }
            else{
                monVu.addElemento(m);
            }
        }
        else if(n==SPRITE && m != null && x>= precio) {
            Bebida s = (Bebida) sprite.getElemento();
            if(s == null){
                throw new NoHayProductoException("No hay mas de este producto");
            }
            if(s != null){
                for(int i = 0; i<(x - precio)/100; i++){
                    Moneda m100 = new Moneda100();
                    monVu.addElemento(m100);
                }
                return s;
            }
            else{
                monVu.addElemento(m);
            }
        }
        else if(n==FANTA && m != null && x>= precio) {
            Bebida f = (Bebida) fanta.getElemento();
            if(f == null){
                throw new NoHayProductoException("No hay mas de este producto");
            }
            if(f != null){
                for(int i = 0; i<(x - precio)/100; i++){
                    Moneda m100 = new Moneda100();
                    monVu.addElemento(m100);
                }
                return f;
            }
            else{
                monVu.addElemento(m);
            }
        }
        else if(n==SNICKERS && m != null && x>= precio) {
            Dulce k = (Dulce) snickers.getElemento();
            if(k == null){
                throw new NoHayProductoException("No hay mas de este producto");
            }
            if(k != null){
                for(int i = 0; i<(x - precio)/100; i++){
                    Moneda m100 = new Moneda100();
                    monVu.addElemento(m100);
                }
                return k;
            }
            else{
                monVu.addElemento(m);
            }
        }
        else if(n==SUPER8 && m != null && x>= precio) {
            Dulce p = (Dulce) snickers.getElemento();
            if(p == null){
                throw new NoHayProductoException("No hay mas de este producto");
            }
            if(p != null){
                for(int i = 0; i<(x - precio)/100; i++){
                    Moneda m100 = new Moneda100();
                    monVu.addElemento(m100);
                }
                return p;
            }
            else{
                monVu.addElemento(m);
            }
        }
        else if(n != COCA && n != SPRITE && n != FANTA && n != SNICKERS && n != SUPER8 && m != null){
            monVu.addElemento(m);
        }
        return null;
    }

    public Moneda getVuelto(){
        return (Moneda) monVu.getElemento();
    }
}