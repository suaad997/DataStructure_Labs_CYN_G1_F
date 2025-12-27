package DoublyLinkedList;

public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList() {
        head=new Node(null,null,null);
        tail=new Node(head,null,null);
        head.setNext(tail);
        size=0;
    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size()==0;
    }

class Node<E>{
private Node<E> prev;
private E data;
private Node<E> next;


    public Node(Node<E> prev, E data, Node<E> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}



}
