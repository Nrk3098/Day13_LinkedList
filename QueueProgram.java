package com.linkedList;


    class Node1 {
        int data;
        Node1 next;

        Node1(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedListQueue {
        private Node1 head;
        private Node1 tail;

        LinkedListQueue() {
            this.head = null;
            this.tail = null;
        }

        boolean isEmpty() {
            return head == null;
        }

        void enqueue(int data) {
            Node1 newNode = new Node1(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int dequeue() {
            if (isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            int dequeuedData = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return dequeuedData;
        }
    }

    public class QueueProgram {
        public static void main(String[] args) {
            LinkedListQueue queue = new LinkedListQueue();

            // Enqueue elements to the queue
            queue.enqueue(56);
            queue.enqueue(30);
            queue.enqueue(70);

            // Dequeue elements from the queue
            while (!queue.isEmpty()) {
                System.out.println(queue.dequeue());  // Output: 56, 30, 70
            }
        }
    }


