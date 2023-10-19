abstract class Moneda implements Comparable<Moneda>{
    public Moneda(){

    }
    public Moneda getSerie(){
        return this;
    }

    @Override
    public String toString() {
        return this.getSerie() + " " + this.getValor();
    }

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