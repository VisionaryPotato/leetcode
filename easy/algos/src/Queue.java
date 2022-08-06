package algos.src;

public class Queue<T> extends LinkedList<T> {
    //First in first out.
    //Waiting line models(waiting in line for a movie, web server requests, first come, first served)
    //Breadth first search.
    LinkedList<T> list = new LinkedList<>();
    private int size = 0;

    public void enqueue(T element){
        //add to back of the queue, known also as offer.
        System.out.println("Queuing " + element + ". Current position: " + size);
        list.insert(element);
        size++;
    }
    public T dequeue(){
        //dequeues the first element in the queue.
        T data = list.getStart();
        list.deleteStart();
        size--;
        return data;
    }

    public void clear(){
        while(size > 0){
            System.out.println("Fetching " + dequeue());
        }
    }

    public T peek(){
        return list.getStart();
    }

    public int size(){
        return size;
    }

}
