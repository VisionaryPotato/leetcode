package algos.src;

public class Stack<T> extends LinkedList<T>{
    // FIFO, First in First out.
    // Stack can have a push, pop, and peek methods!

    // Once our Stack object is created, we're going to use a linked list to store values in our stack
    LinkedList<T> list = new LinkedList<>();

    public void push(T element){
        list.insertAtStart(element);
    }

    public T pop(){
        T data = list.getStart();
        list.deleteStart();
        return data;
    }

    public T peak(){
       return list.getStart();
    }

    public boolean isEmpty(){
        return size() <= 0;
    }


    public void clear(){
        while(list.size > 0){
            pop();
        }
    }

    public void show(){
        list.print();
    }

}