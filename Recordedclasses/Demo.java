
// class Alien {
//     private final int id;
//     private final String name;

//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }
//     public int getId() {
//         return id;
//     }
//     public String getName() {
//         return name;
//     }
//     @Override
//     public String toString() {
//         return "Alien [id=" + id + ", name=" + name + "]";
//     }
//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }
    

// }

record Alien(int id, String name) {
    // The record automatically provides the equals, hashCode, and toString methods
    // based on the fields defined in the record.
}


public class Demo {
    public static void main(String[] args) {
        Alien a = new Alien(1, "Sameer");
        Alien b = new Alien(1, "Sameer");

        System.out.println(a.equals(b));
        
    }
    
}
//conical contrustor
//conpact