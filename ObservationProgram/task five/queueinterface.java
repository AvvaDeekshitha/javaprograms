import java.util.Queue;
import java.util.LinkedList;

class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // add()
        q.add(10);
        q.add(20);

        // offer()
        q.offer(30);

        System.out.println("Queue: " + q);

        // element()
        System.out.println("Element: " + q.element());

        // peek()
        System.out.println("Peek: " + q.peek());

        // remove()
        System.out.println("Removed: " + q.remove());

        // poll()
        System.out.println("Polled: " + q.poll());

        System.out.println("Queue after operations: " + q);
    }
}
