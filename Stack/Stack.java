package Stack;

public class Stack {

    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        int popValue = top.data;
        top = top.next;
        return popValue;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    public void clear() {
        top = null;
    }

    public int size() {
        int size = 0;
        Node current = top;
        while (current != null) {
            current = current.next;
            size ++;
        }
        return size;
    }

    public boolean contains(int value) {
        Node current = top;
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
        StringBuilder stringBuilder = new StringBuilder();
        Node currentNode = top;
        while (currentNode != null) {
            stringBuilder.append(currentNode.data).append(" ");
            currentNode = currentNode.next;
        }
        return stringBuilder.toString().trim();
    }
}
