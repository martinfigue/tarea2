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
            coca.addBebida(c);
            sprite.addBebida(s);
            fanta.addBebida(d);
            snickers.addDulce(k);
            super8.addDulce(p);
        }
    }

    public Producto comprarProducto(Moneda m, int n){
        int x = 0;
        if(m < 0 || m == null){
            throw new PagoIncorrectoException("Vuelva a colocar otra moneda");
        }
        if(m != null) {
            x = m.getValor();
        }

        if((n == COCA || n == SPRITE || n == FANTA || n == SNICKERS || n == SUPER8) && x < precio){
            monVu.addMoneda(m);
        }
        if(n==COCA  && m!=null && x>=precio){
            Bebida c = coca.getBebida();
            if(c != null){
                for(int i = 0; i<(x - precio)/100; i++){
                    Moneda m100 = new Moneda100();
                    monVu.addMoneda(m100);
                }
                return c;
            }
            else{
                monVu.addMoneda(m);
            }
        }
        else if(n==SPRITE && m != null && x>= precio) {
            Bebida s = sprite.getBebida();
            if(s != null){
                for(int i = 0; i<(x - precio)/100; i++){
                    Moneda m100 = new Moneda100();
                    monVu.addMoneda(m100);
                }
                return s;
            }
            else{
                monVu.addMoneda(m);
            }
        }
        else if(n==FANTA && m != null && x>= precio) {
            Bebida f = fanta.getBebida();
            if(f != null){
                for(int i = 0; i<(x - precio)/100; i++){
                    Moneda m100 = new Moneda100();
                    monVu.addMoneda(m100);
                }
                return f;
            }
            else{
                monVu.addMoneda(m);
            }
        }
        else if(n==SNICKERS && m != null && x>= precio) {
            Dulce k = snickers.getDulce();
            if(k != null){
                for(int i = 0; i<(x - precio)/100; i++){
                    Moneda m100 = new Moneda100();
                    monVu.addMoneda(m100);
                }
                return k;
            }
            else{
                monVu.addMoneda(m);
            }
        }
        else if(n==SUPER8 && m != null && x>= precio) {
            Dulce p = skittles.getDulce();
            if(p != null){
                for(int i = 0; i<(x - precio)/100; i++){
                    Moneda m100 = new Moneda100();
                    monVu.addMoneda(m100);
                }
                return p;
            }
            else{
                monVu.addMoneda(m);
            }
        }
        else if(n != COCA && n != SPRITE && n != FANTA && n != SKITTLES && n != SUPER8 && m != null){
            monVu.addMoneda(m);
        }
        return null;
    }

    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}