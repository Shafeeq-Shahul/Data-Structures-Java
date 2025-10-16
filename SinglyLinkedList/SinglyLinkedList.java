package SinglyLinkedList;

public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int size = 0;
        Node currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }
        return size;
    }

    // able to insert data at the start of the linked list
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // able to insert data at end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void insertAtIndex(int index, int data) {
        Node newNode = new Node(data);
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currentNode = head;
        for (int i = 0; i < index - 1;  i++) {
            if (currentNode == null) {
                throw new IndexOutOfBoundsException("Index out of bound.");
            }
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            throw new IndexOutOfBoundsException("Index out of bound.");
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public void deleteAtStart() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        head = head.next;
    }

    public void deleteAtEnd() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }

    public void deleteAtIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index out of bound.");
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            if (currentNode == null || currentNode.next == null) {
                throw new IndexOutOfBoundsException("Index out of bound");
            }
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        currentNode.next = currentNode.next.next;
    }

    public boolean contains(int element) {
        Node currentNode = head;
        while (currentNode != null) {
            int value = currentNode.data;
            if (value == element) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void clear() {
        head = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node currentNode = head;
        while (currentNode != null) {
            sb.append(currentNode.data).append("->");
            currentNode = currentNode.next;
        }
        sb.append("END");
        return sb.toString().trim();
    }
}
