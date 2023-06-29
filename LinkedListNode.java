package com.linkedList;
public class LinkedListNode<T extends Comparable<T>> {
        private LinkedList1<T> head;
        private LinkedList1<T> tail;

        public LinkedListNode() {
            this.head = null;
            this.tail = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void add(T data) {
            LinkedList1<T> newNode = new LinkedList1<>(data);

            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.setNext(newNode);
                tail = newNode;
            }
        }

        public void insertAfter(T key, T data) {
            LinkedList1<T> newNode = new LinkedList1<>(data);

            LinkedList1<T> current = head;
            while (current != null) {
                if (current.getData().equals(key)) {
                    newNode.setNext(current.getNext());
                    current.setNext(newNode);
                    if (current == tail)
                        tail = newNode;
                    return;
                }
                current = current.getNext();
            }
        }

        public void deleteFirst() {
            if (isEmpty())
                return;

            head = head.getNext();
            if (head == null)
                tail = null;
        }

        public void deleteLast() {
            if (isEmpty())
                return;

            if (head == tail) {
                head = null;
                tail = null;
                return;
            }

            LinkedList1<T> current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }

            current.setNext(null);
            tail = current;
        }

        public LinkedList1<T> search(T key) {
            LinkedList1<T> current = head;
            while (current != null) {
                if (current.getData().equals(key)) {
                    return current;
                }
                current = current.getNext();
            }
            return null;
        }

        public int size() {
            int count = 0;
            LinkedList1<T> current = head;
            while (current != null) {
                count++;
                current = current.getNext();
            }
            return count;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            LinkedList1<T> current = head;
            while (current != null) {
                sb.append(current.getData()).append("->");
                current = current.getNext();
            }
            sb.append("null");
            return sb.toString();
        }
    }


