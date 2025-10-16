# Data-Structures-java
Node Implementation of Data Structures in Java and its unique methods.

# Stack

* Follow First In Last Out (LIFO) principle.
* push() - used to push data into the stack.
* pop() - used to remove top element from the stack.
* peek() - used to return the top element of the stack.

![stack](https://github.com/user-attachments/assets/f88eca7f-93b3-4d54-a877-7446cfbe02c1)

## Application of stack
* Function call management in programming languages (call stack).
* Undo/redo operations in text editors.

# Queue

* Follows First In First Out (FIFO) principle.
* enqueue() - used to add the element to the rear of the queue.
* dequeue() - used to remove element from the front of the queue.
* peek() - used to return the front element of the queue.

![queue](https://github.com/user-attachments/assets/726b1fda-7462-4cea-97ba-3910a042a850)

## Application of Queue

* CPU Scheduling
* Breadth-First Search (BFS)

# Singly Linked List

## Definition
A **singly linked list** is a linear data structure where each element (called a **node**) contains:
- **Data**: the value stored in the node.
- **Next**: a reference (pointer) to the next node in the list.


Nodes are not stored in contiguous memory and are connected using pointers.

---

![list](https://github.com/user-attachments/assets/0fe15ad4-b4c8-430b-9ecb-3c9a10ae87ee)

## Structure Example in Java
```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
