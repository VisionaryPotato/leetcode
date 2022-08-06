package algos.src;

public class LinkedList<T>{
    // node has data and pointer to next object
    private Node<T> head; // refers to first obj
    private int size = 0;

    public static class Node<T>{
        T data;
        Node<T> next;
    }
    public void insert(T element){
        Node<T> node = new Node<>();
        // assign value to new node.
        node.data = element;
        // if this is our first object, set the head to the new node
        if(head == null)
            head = node;
        else{
            Node<T> temp = head; //temp is a reference is a copy of our head
            //look for a null pointer & assign the v
            while(temp.next != null){
                temp = temp.next;
            }
            // assigns our node to the next available pointer
            temp.next = node;
        }
        size++;
    }

    public void insertAt(int index, T element){
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        // if index == 0, we insert at the start of list
        else if (index == 0) insertAtStart(element);
        else{
            Node<T> node = new Node<>();
            node.data = element;
            Node<T> previous = getNodeAt(index-1);
            Node<T> after = getNodeAt(index);
            previous.next = node;
            node.next = after;
        }
        size++;
    }

    public void insertAtStart(T element){
        //Add element to the start of the list
        //Make a new node & assign the head ptr to it
        Node<T> node = new Node<>();
        node.data = element;
        node.next = head;
        head = node;
        size++;
    }

    public T getStart(){
        if(head == null){return null;}
        else
            return head.data;
    }

    public void delete(){
        Node<T> temp = head;
        //iterate over our list and delete every element: O(n) time-complexity
        int i = 0;
        while (temp != null){
            //delete node & move to the next one
            System.out.println("Deleting " + temp.data);
            head = null;
            temp = temp.next;
            --size;
        }
    }

    public void deleteAt(int index){
        if(index == 0) head = head.next;
        else{
            Node<T> previous = getNodeAt(index-1);
            Node<T> current = getNodeAt(index);
            current = current.next;
            previous.next = current;
        }
        --size;
    }

    public void deleteStart(){
        deleteAt(0);
    }

    public int size(){
        return size;
    }

    private Node<T> getNodeAt(int index){
        Node<T> temp = head;
        int counter = 0;
        while(counter != index){
            temp = temp.next;
            counter++;
        }
        return temp;
    }

    public void print(){
        Node<T> node = head;
        while (node != null && node.next != null){
            System.out.println(node.data);
            //move to next pointer
            node = node.next;
        }
        if(node != null)
            System.out.println(node.data);
    }
}