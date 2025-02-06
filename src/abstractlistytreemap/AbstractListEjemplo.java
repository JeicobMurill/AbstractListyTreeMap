/**
 *
 * @author jeico
 */

package abstractlistytreemap;

import java.util.AbstractList;




public class AbstractListEjemplo extends AbstractList<String> {
    private String[] data;
    private int size;

    // Constructor
    public AbstractListEjemplo(int capacity) {
        data = new String[capacity];
        size = 0;
    }

    // Método para agregar un elemento
    public void addElement(String element) {
        if (size < data.length) {
            data[size] = element;
            size++;
        } else {
            System.out.println("Lista llena!");
        }
    }

    public int size() {
        return size;
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        } else {
            throw new IndexOutOfBoundsException("Fuera de rango");
        }
    }

    
    // Método principal para probar la clase
    public static void main(String[] args) {
        AbstractListEjemplo list = new AbstractListEjemplo(5);

        // Agregar elementos a la lista
        list.addElement("Juan");
        list.addElement("Ana");
        list.addElement("Pedro");

        // Mostrar los elementos de la lista
        System.out.println("Tamano de la lista: " + list.size());
        System.out.println("Elemento en indice 1: " + list.get(1));  // Debe imprimir "Ana"
        
        // Intentar acceder a un índice fuera de rango
        try {
            System.out.println(list.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
