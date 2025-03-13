import java.util.ArrayList;
import java.util.List;

public class LinkedListDeque61B <T> implements Deque61B<T>{
    private class DequeNode{
        public T item;
        public DequeNode prev;
        public DequeNode next;
    }

    private DequeNode sentinel = new DequeNode();
    private int size;

    public LinkedListDeque61B(){
        sentinel.item = null;
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    @Override
    public void addFirst(T x) {
        DequeNode NewNode = new DequeNode();
        NewNode.item = x;
        NewNode.next = sentinel.next;
        NewNode.prev = sentinel;
        sentinel.next.prev = NewNode;
        sentinel.next = NewNode;
        size += 1;
    }

    @Override
    public void addLast(T x) {
        DequeNode NewNode = new DequeNode();
        NewNode.item = x;
        NewNode.next = sentinel;
        NewNode.prev = sentinel.prev;
        sentinel.prev.next = NewNode;
        sentinel.prev = NewNode;
        size += 1;
    }


    @Override
    public List<T> toList() {
        List<T> result = new ArrayList<>();
        DequeNode current = sentinel.next;
        while (current != sentinel) {
            result.add(current.item);
            current = current.next;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T removeFirst() {
        DequeNode first = sentinel.next;
        if (first == sentinel) {
            return null;
        }
        first.next.prev = sentinel;
        sentinel.next = first.next;
        size --;
        return first.item;
    }

    @Override
    public T removeLast() {
        DequeNode last = sentinel.prev;
        if (last == sentinel) {
            return null;
        }
        last.prev.next = sentinel;
        sentinel.prev = last.prev;
        size --;
        return last.item;
    }

    @Override
    public T get(int index) {
        DequeNode current = sentinel;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }

    private T getRecursiveHelper(DequeNode p,int i){
        if(i == 0){
            return p.item;
        }
        else {
            return getRecursiveHelper(p.next,i-1);
        }
    }

    @Override
    public T getRecursive(int index) {
        if(index < 0 || index >= size){
            return null;
        }

        DequeNode ptr = sentinel.next;
        return getRecursiveHelper(ptr,index);
    }
}