package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dlist=new DoublyLinkedList<Integer>();
        dlist.addFirst(10);
        dlist.addFirst(70);
        dlist.addFirst(20);
        dlist.addFirst(60);
        dlist.addLast(40);
        dlist.addLast(50);
        dlist.removeFirst();
        dlist.removeFirst();
        dlist.removeLast();
        dlist.display();



    }
}
