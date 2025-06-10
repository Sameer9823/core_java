
class A {
    String name;
    int age;
    public String toString() {
        return "Name: " + name + ", Age: " + age;

    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }
    
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.name = "sameer"; 
        obj.toString(); // Calls show of class A
        obj.age = 25; // Calls config of class A

        System.out.println(obj);
    }
    
}
