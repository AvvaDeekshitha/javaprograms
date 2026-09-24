import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // add()
        list.add(20);
        list.add(30);
        list.add(40);

        // addFirst() and addLast()
        list.addFirst(10);
        list.addLast(50);
        System.out.println("List: " + list);

        // get()
        System.out.println("Element: " + list.get(2));

        // getFirst() and getLast()
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        // remove(index)
        list.remove(2);

        // remove(object)
        list.remove(Integer.valueOf(40));
        System.out.println("After remove: " + list);

        // removeFirst() and removeLast()
        System.out.println("Removed First: " + list.removeFirst());
        System.out.println("Removed Last: " + list.removeLast());

        // offer()
        list.offer(60);
        System.out.println("After offer: " + list);

        // peek()
        System.out.println("Peek: " + list.peek());

        // poll()
        System.out.println("Poll: " + list.poll());

        System.out.println("Final List: " + list);
    }
}
