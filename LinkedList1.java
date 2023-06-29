package com.linkedList;
public class LinkedList1<T extends Comparable<T>> {
        private T data;
        private LinkedList1<T> next;

        public LinkedList1(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public LinkedList1<T> getNext() {
            return next;
        }

        public void setNext(LinkedList1<T> next) {
            this.next = next;
        }


}


