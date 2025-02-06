/**
 *
 * @author jeico
 */


package abstractlistytreemap;

import java.util.TreeMap;




public class TreeMapEjemplo {
    public static void main(String[] args) {
        TreeMap<String, Integer> grades = new TreeMap<>();

        // Agrega estudiantes y sus calificaciones
        grades.put("Juan", 85);
        grades.put("Ana", 92);
        grades.put("Pedro", 78);
        grades.put("Carlos", 88);

        // Muestra las calificaciones ordenadas por nombre
        System.out.println("Calificaciones de los estudiantes:");
        for (String name : grades.keySet()) {
            System.out.println(name + ": " + grades.get(name));
        }
    }
}