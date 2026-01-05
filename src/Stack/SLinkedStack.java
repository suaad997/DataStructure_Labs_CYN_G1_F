package Stack;

import SinglyLinkedList.SinglyLinkedList;

public class SLinkedStack<E> implements Stack<E> {
    SinglyLinkedList<E> sList=new SinglyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return sList.isEmpty();
    }

    @Override
    public int size() {
        return sList.size();
    }

    @Override
    public void push(E data) {
        sList.addFirst(data);
    }


    @Override
    public E pop() {
        return sList.removeFirst();
    }

    @Override
    public E top() {
        return sList.getFirst();
    }
}
