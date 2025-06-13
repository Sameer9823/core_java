import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println("Size of collection: " + nums);
        System.out.println("Is collection empty? " + nums.isEmpty());
        System.out.println("Does collection contain 20? " + nums.contains(20));
        System.out.println(" " + ((ArrayList<Integer>) nums).get(1));

        for (int num : nums) {
            System.out.println("Element: " + num);
        }


        List<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(40);
        nums2.add(50);
        nums2.add(60);

        nums.addAll(nums2);
        System.out.println("Size of collection: " + nums2);
        System.out.println("Size of collection: " + nums);


        Set<Integer> nums3 = new TreeSet<Integer>();
        nums3.add(70);
        nums3.add(80);  
        nums3.add(90);
        nums3.add(100);
        nums3.add(100); // Duplicate, will not be added
        System.out.println("Size of set: " + nums3);
        Iterator<Integer> it = nums3.iterator();
        while (it.hasNext()) {
            System.out.println("Element in set: " + it.next());
        }
        }

    }
    

