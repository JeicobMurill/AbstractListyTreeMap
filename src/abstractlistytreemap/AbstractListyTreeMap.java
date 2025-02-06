/**
 *
 * @author jeico
 */


package abstractlistytreemap;

import java.util.AbstractList;
import java.util.TreeMap;
import java.util.Map;




public class AbstractListyTreeMap extends AbstractList<String> {
    

    private String[] data;
    private int size;   
    private TreeMap<String, Integer> nameAgeMap; 

    
    public AbstractListyTreeMap(int capacity) {
        data = new String[capacity];
        size = 0;
        nameAgeMap = new TreeMap<>(); 
    }

    public void addElement(String name, int age) {
        if (size < data.length) {
            data[size] = name;  
            nameAgeMap.put(name, age);
            size++;  //
        } else {
            System.out.println("Lista llena, no se puede agregar más elementos.");
        }
    }

    public int size() {
        return size;
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        } else {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
    }

    public Integer getAge(String name) {
        return nameAgeMap.get(name);
    }

    
    public void displaySortedByName() {
        System.out.println("Nombres y edades ordenados por nombre:");
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            System.out.println(entry.getKey() + " - Edad: " + entry.getValue());
        }
    }

  
    public static void main(String[] args) {
        AbstractListyTreeMap list = new AbstractListyTreeMap(5);

     
        list.addElement("Juan", 25);
        list.addElement("Ana", 30);
        list.addElement("Pedro", 22);
        list.addElement("Maria", 28);

     
        System.out.println("Tamano de la lista: " + list.size());

     
        System.out.println("Elemento en indice 2: " + list.get(2));  // "Pedro"

      
        String nameToFind = "Ana";
        System.out.println("La edad de " + nameToFind + " es: " + list.getAge(nameToFind));

      
        list.displaySortedByName();

      
        try {
            System.out.println(list.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}