import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    // Unión de dos conjuntos
    public static Set<Object> union(Set<Object> a, Set<Object> b) {
        Set<Object> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    // Intersección de dos conjuntos
    public static Set<Object> intersect(Set<Object> a, Set<Object> b) {
        Set<Object> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    // Diferencia de a - b
    public static Set<Object> diff(Set<Object> a, Set<Object> b) {
        Set<Object> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }

    // Verificar si b es subconjunto de a
    public static boolean isSubset(Set<Object> a, Set<Object> b) {
        return a.containsAll(b);
    }

    // Producto cartesiano a X b
    public static Set<String> cartesiano(Set<Object> a, Set<Object> b) {
        Set<String> result = new HashSet<>();
        for (Object elementA : a) {
            for (Object elementB : b) {
                result.add("(" + elementA + ", " + elementB + ")");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Set<Object> setA = new HashSet<>();
        Set<Object> setB = new HashSet<>();

        // Agregar elementos a los conjuntos
        setA.add(1);
        setA.add(2);
        setA.add(3);

        setB.add(2);
        setB.add(3);
        setB.add(4);

        // Pruebas
        System.out.println("Unión: " + union(setA, setB));
        System.out.println("Intersección: " + intersect(setA, setB));
        System.out.println("Diferencia A - B: " + diff(setA, setB));
        System.out.println("B es subconjunto de A: " + isSubset(setA, setB));
        System.out.println("Producto cartesiano A x B: " + cartesiano(setA, setB));
    }
}
