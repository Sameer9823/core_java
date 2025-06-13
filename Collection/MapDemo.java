import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 85);
        students.put("Bob", 90);
        students.put("Charlie", 95);
        students.put("Dave", 85);
        students.put("Eve", 90);

        System.out.println("Size of map: " + students);
        System.out.println("keys " + students.keySet());

        for(String key : students.keySet()) {
            System.out.println("Key: " + key + ", Value: " + students.get(key));
        }
    }
}
