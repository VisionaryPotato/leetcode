package algos.src;

import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T>{
    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    public static class Node<T>{
        T data;
        //Two node pointers (prev. & next)
        Node<T> prev, next;
        public Node(T data, Node<T> prev, Node<T> next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
        @Override public String toString(){
            return data.toString();
        }
    }

    public void clear(){

    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        //returns true if the list is empty
        return true;
    }

    public void add(T element){

    }

    public void addFirst(T element){
        //adds element to the beginning of the list

    }

    public void addAt(int index, T data) throws Exception{
        //adds an element at a specified index
    }
    public Iterator<T> iterator() {
        return null;
    }

}