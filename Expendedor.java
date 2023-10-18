public class Expendedor{
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public  static final int FANTA = 2;
    public static final int SKITTLES = 2;
    public static final int SUPER8 = 2;
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private Deposito skittles;
    private Deposito super8;
    private Deposito monVu;
    private int precio;
    private int precio
    public Expendedor(int numBebidas, int precioBebidas){
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        skittles = new Deposito();
        super8 = new Deposito();
        monVu = new Deposito();
        precio = precioBebidas;
        for(int i=0; i<numBebidas; i++){
            CocaCola c = new CocaCola(100+i);
            Sprite s = new Sprite(200+i);
            coca.addBebida(c);
            sprite.addBebida(s);
        }
    }

    public Bebida comprarBebida(Moneda m, int n){
        int x = 0;
        if(m != null) {
            x = m.getValor();
        }

        if((n == COCA || n == SPRITE) && x < precio){
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
        else if(n != COCA && n != SPRITE && m != null){
            monVu.addMoneda(m);
        }
        return null;
    }

    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}