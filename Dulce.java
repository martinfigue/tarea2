abstract class Dulce extends Producto{
    public Dulce(int numSerie) {
        super(numSerie);
    }
    public int getSerie(){
        return serie;
    }
    public abstract String comer();
}

