public enum Precios{

    PRECIOCOCA(700), PRECIOSPRITE(700), PRECIOFANTA(700), PRECIOSNICKERS(900), PRECIOSUPER8(300);

    private final int precio;

    Precios(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }
}