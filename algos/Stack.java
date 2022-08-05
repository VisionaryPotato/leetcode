public class Stack<T>{
    // FIFO, First in First out.
    // Stack can have a push, pop, and peek methods!
    LinkedList<T> list;

    public void push(T element){
        if (list == null)
            list = new LinkedList<>();
        list.insertAtStart(element);
    }
}