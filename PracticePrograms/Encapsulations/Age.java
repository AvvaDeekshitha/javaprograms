class Student {
    private String name;
    private int age;

    // Setter methods
    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

public class age {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Rahul");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
