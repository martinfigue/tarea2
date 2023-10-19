abstract class Bebida extends Producto{
    public Bebida(int numSerie){
        super(numSerie);
    }
    public int getSerie(){
        return serie;
    }
    public abstract String beber();
}

