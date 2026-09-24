import java.util.ArrayList;

class SearchArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Anu");
        names.add("Kiran");
        names.add("Priya");

        String search = "Kiran";

        if (names.contains(search))
            System.out.println(search + " is found");
        else
            System.out.println(search + " is not found");
    }
}
