/**
 * Clase producto usada dentro del proyecto
 */
abstract class Producto {
    private int serie;

    /**
     *
     * @param numSerie numero de serie del producto
     */
    public Producto(int numSerie){
        serie = numSerie;
    }
    public int getSerie(){
        return serie;
    }
    public abstract String consumir();
}

