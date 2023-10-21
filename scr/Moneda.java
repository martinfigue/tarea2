/**
 * Las monedas del trabajo
 * @author ignaciodiaz
 * @author martinfigueroa
 */

abstract class Moneda implements Comparable<Moneda>{
    public Moneda(){

    }

    /** @return la dirección a la moneda y la usaremos como número de serie
     */
    public Moneda getSerie(){
        return this;
    }

    @Override
    public String toString() {
        return this.getSerie() + " " + this.getValor();
    }

    /** @return el valor de la moneda
     */

    public abstract int getValor();

    @Override
    public int compareTo(Moneda o) {
        if (this.getValor() == o.getValor()){
            return 0;
        }
        else if(this.getValor() > o.getValor()){
            return 1;
        }
        else{
            return -1;
        }
    }
}