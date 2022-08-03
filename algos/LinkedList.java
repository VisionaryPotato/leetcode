public class LinkedList<T>{
    // node has data and pointer to next object
    private Node<T> head; // refers to first obj
    public void insert(int element){
        Node<T> node = new Node<>();
        // assign value to new node.
        node.data = element;
        if(head == null){
            // if this is our first object, set the head to the new node
            head = node;
        }
        else{
            Node<T> n = head;
            //looks for a null pointer
            while(n.next != null){
                n = n.next;
            }
            // assigns null pointer to our node
            n.next = node;
        }

    }

    public void print(){
        Node<T> node = head;
        while (node.next != null){
            System.out.println(node.data);
            //move to next pointer
            node = node.next;
        }
        System.out.println(node.data);
    }
}