import java.util.Deque;
import java.util.ArrayDeque;

class DequeDemo {
    public static void main(String[] args) {

        Deque<Integer> d = new ArrayDeque<>();

        // addFirst() and addLast()
        d.addFirst(20);
        d.addLast(30);

        // offerFirst() and offerLast()
        d.offerFirst(10);
        d.offerLast(40);

        System.out.println("Deque: " + d);

        // peekFirst() and peekLast()
        System.out.println("First: " + d.peekFirst());
        System.out.println("Last: " + d.peekLast());

        // removeFirst() and removeLast()
        System.out.println("Removed First: " + d.removeFirst());
        System.out.println("Removed Last: " + d.removeLast());

        // pollFirst() and pollLast()
        System.out.println("Polled First: " + d.pollFirst());
        System.out.println("Polled Last: " + d.pollLast());

        System.out.println("Deque after operations: " + d);
    }
}
