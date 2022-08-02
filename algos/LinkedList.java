//want to store some values ex. 5,12,6,9,8
//we could have a node [5| ]->[12| ]->[6| ]->[9| ]->[8| ]->null
class LinkedList{
    // node has data and pointer to next object
    Node head; // refers to first obj

    public void insert(int element){
        Node node = new Node();
        // assign value to new node.
        node.data = element;
        if(head == null){
            // if this is our first object, set the head to the new node
            head = node;
        }
        else{
            Node n = head;
            //looks for a null pointer
            while(n.next != null){
                n = n.next;
            }
            // assigns null pointer to our node
            n.next = node;
        }

    }

    public void print(){
        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            //move to next pointer
            node = node.next;
        }
        System.out.println(node.data);
    }
}