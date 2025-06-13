import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students  {
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

  
    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Students other) {
        if (this.age > other.age) {
            return 1; // this is greater than other
        } else if (this.age < other.age) {
            return -1; // this is less than other
        } else {
            return 0; // this is equal to other
        }
    }
    
}

public class Demo {
    public static void main(String[] args) {

        // Demonstrating sorting in Java using Collections

        // Comparator<Integer> com = new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer a, Integer b) {
        //         if(a%10 > b%10) {
        //             return 1; // a is greater than b
        //         } else  {
        //             return -1; // a is equal to b
        //         }
        //     }
        // };

        // List<Integer> list = new ArrayList<>();
        // list.add(43);
        // list.add(31);
        // list.add(30);
        // list.add(40);
        // list.add(50);

        // Collections.sort(list, com); // Sort in ascending order
        // // Note: The above line will not work as Collection does not have a sort method.    



        // System.out.println("Original List: " + list);
        // list.sort((a, b) -> b - a); // Sort in descending order
        // System.out.println("Sorted List: " + list);


        Comparator<Students> com = (a, b) -> {
            if(a.age > b.age) {
                return 1; // a is greater than b
            } else  {
                return -1; // a is equal to b
        }
           
        };

        List<Students> students = new ArrayList<>();
        students.add(new Students(20, "Alice"));
        students.add(new Students(22, "Bob"));  
        students.add(new Students(21, "Charlie"));
        students.add(new Students(23, "Dave"));
        students.add(new Students(19, "Eve"));

        Collections.sort(students, com); // Sort in ascending order by age

        for (Students student : students) {
            System.out.println(student);
        }
        // System.out.println("Original List: " + students);

    }

}
