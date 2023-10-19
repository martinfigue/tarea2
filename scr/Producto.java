abstract class Producto {
    private int serie;
    public Producto(int numSerie){
        serie = numSerie;
    }
    public int getSerie(){
        return serie;
    }
    public abstract String consumir();
}

