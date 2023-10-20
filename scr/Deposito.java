import java.util.ArrayList;

public class Deposito<T>{
    private ArrayList<T> content;
    public Deposito(){
        content = new ArrayList();
    }
    public void addElemento(T elemento){
        content.add(elemento);
    }

    public T getElemento() {
        if (content.size() == 0) {
            return null;
        } else {
            T elemento = content.remove(0);
            return elemento;
        }
    }
}