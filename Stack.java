package com.linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack {
    private Node head;

    LinkedListStack() {
        this.head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int poppedData = head.data;
        head = head.next;
        return poppedData;
    }

    int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return head.data;
    }
}




public class Stack {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        // Push elements to the stack
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Peek at the top element
        System.out.println(stack.peek());  // Output: 56

        // Pop elements from the stack until it is empty
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());  // Output: 56, 30, 70
        }
    }

}
