import java.util.ArrayList;

public class Deposito<T>{
    private ArrayList<T> elementos;
    public Deposito(){
        elementos = new ArrayList();
    }
    public void addElemento(T elemento){
        elementos.add(elemento);
    }

    public T getElemento() {
        if (elementos.size() == 0) {
            return null;
        } else {
            T elemento = elementos.remove(0);
            return elemento;
        }
    }
}