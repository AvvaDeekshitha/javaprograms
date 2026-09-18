interface Father {
    void fatherWork();
}

interface Mother {
    void motherWork();
}

class Child implements Father, Mother {

    public void fatherWork() {
        System.out.println("Father is working");
    }

    public void motherWork() {
        System.out.println("Mother is working");
    }
}

public class family {
    public static void main(String[] args) {
        Child c = new Child();

        c.fatherWork();
        c.motherWork();
    }
}
