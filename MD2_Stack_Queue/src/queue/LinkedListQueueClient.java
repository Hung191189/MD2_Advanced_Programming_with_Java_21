package queue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(3);
        queue.enqueue(6);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(2);
//        queue.dequeue();
        queue.enqueue(7);
        System.out.println("Dequeued item is: " + queue.dequeue().key);

    }
}
