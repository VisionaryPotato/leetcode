package test;
import algos.src.Queue;
public class testQueue {
    public static void main(String args[]){
        Queue<String> queue = new Queue<>();
        queue.enqueue("Jonathan");
        queue.enqueue("Julian");
        queue.enqueue("Dave");
        System.out.println();
        queue.clear();
    }
}
