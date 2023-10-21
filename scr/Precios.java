/**
 * El enum con los precios
 * @author ignaciodiaz
 * @author martinfigueroa
 */

public enum Precios{

    PRECIOCOCA(700), PRECIOSPRITE(700), PRECIOFANTA(700), PRECIOSNICKERS(900), PRECIOSUPER8(300);

    /** Los precios de cada producto
     */

    private final int precio;
    /** @param precio asocia un precio a cada constante
     */
    Precios(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }
}