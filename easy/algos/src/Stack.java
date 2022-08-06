package algos.src;

public class Stack<T> extends LinkedList<T>{
    // FIFO, First in First out.
    // Stack can have a push, pop, and peek methods!

    // Once our Stack object is created, we're going to use a linked list to store values in our stack
    LinkedList<T> list = new LinkedList<>();
    private int size = 0;
    public void push(T element){
        list.insertAtStart(element);
        size++;
    }

    public T pop(){
        T data = list.getStart();
        list.deleteStart();
        size--;
        return data;
    }

    public T peek(){
       return list.getStart();
    }

    public boolean isEmpty(){
        return size() <= 0;
    }


    public void clear(){
        while(size > 0){
            pop();
        }
    }

    public int size(){
        return size;
    }

    public void show(){
        list.print();
    }

}