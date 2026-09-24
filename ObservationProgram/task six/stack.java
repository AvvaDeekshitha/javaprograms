import java.util.Stack;

class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // push()
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack: " + s);

        // peek()
        System.out.println("Top: " + s.peek());

        // search()
        System.out.println("Position of 20: " + s.search(20));

        // pop()
        System.out.println("Popped: " + s.pop());

        // empty()
        System.out.println("Is Empty: " + s.empty());

        System.out.println("Final Stack: " + s);
    }
}
