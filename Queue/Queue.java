package Queue;

public class Queue {

    private Node front;

    private Node rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    // add element to the rear of the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // remove element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        Node temp = front;
        return temp.data;
    }

    public boolean contains(int value) {
        Node current = front;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = front;
        sb.append("Front->");
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append("->");
            }
            current = current.next;
        }
        sb.append("<-Rear");
        return sb.toString().trim();
    }
}
