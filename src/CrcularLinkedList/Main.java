package CrcularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> list =new CircularLinkedList<>();
        list.addFirst("Alaa");
        list.addFirst("Ahmed");
        list.addFirst("Mohammed");
        list.addLast("Ali");
        list.addLast("Hend");
        list.removeFirst();
        list.removeLast();
        list.display();





    }
}
