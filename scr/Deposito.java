import java.util.ArrayList;

/**
 * Los depósitos de productos o monedas del trabajo
 * @author ignaciodiaz
 * @author martinfigueroa
 */
public class Deposito<T>{
    private final ArrayList<T> content;
    public Deposito(){
        content = new ArrayList();
    }

    /**
     * Agrega un elemnto al depósito
     * @param elemento el elemento que queremos agregar al depósito
     */
    public void addElemento(T elemento){
        content.add(elemento);
    }

    /**
     * Retira un elemento del depósito
     * @return el producto que queremos retirar del depósito
     */
    public T getElemento() {
        if (content.size() == 0) {
            return null;
        } else {
            T elemento = content.remove(0);
            return elemento;
        }
    }
}