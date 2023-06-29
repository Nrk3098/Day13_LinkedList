package com.linkedList;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class LinkedListTest {

        @Test
        void testLinkedList() {
            LinkedListNode<Integer> list = new LinkedListNode<>();
            list.add(70);
            list.add(30);
            list.add(56);
            assertEquals("70->30->56->null", list.toString());

            // Insert 40 after 30
            list.insertAfter(30, 40);
            assertEquals("70->30->40->56->null", list.toString());

            // Delete node with key value 40
            LinkedList1<Integer> node40 = list.search(40);
            assertNotNull(node40);
            list.deleteLast();
            assertEquals("70->30->56->null", list.toString());

            // Test size()
            assertEquals(3, list.size());
        }

        public static void main(String[] args) {
            LinkedListNode<Integer> list = new LinkedListNode<>();
            list.add(70);
            list.add(30);
            list.add(56);
            System.out.println("Initial Sequence: " + list.toString());

            // Append 30 and 70 to 56
            list.insertAfter(56, 30);
            list.insertAfter(30, 70);
            System.out.println("LinkedList Sequence (Appending): " + list.toString());

            // Insert 30 between 56 and 70
            list.insertAfter(56, 30);
            System.out.println("LinkedList Sequence (Inserting 30): " + list.toString());

            // Delete the first element in the LinkedList
            list.deleteFirst();
            System.out.println("LinkedList Sequence (Deleting First): " + list.toString());

            // Delete the last element in the LinkedList
            list.deleteLast();
            System.out.println("LinkedList Sequence (Deleting Last): " + list.toString());

            // Search LinkedList to find Node with value 30
            LinkedList1<Integer> node30 = list.search(30);
            System.out.println("Found Node with value 30: " + (node30 != null));

            // Insert 40 after 30
            list.insertAfter(30, 40);
            System.out.println("LinkedList Sequence (Inserting 40): " + list.toString());

            // Delete 40 from the LinkedList
            LinkedList1<Integer> node40 = list.search(40);
            if (node40 != null) {
                list.deleteLast();
            }
            System.out.println("LinkedList Sequence (Deleting 40): " + list.toString());

            // Show the size of the LinkedList
            System.out.println("Linked List Size: " + list.size());

            // Create an Ordered Linked List in ascending order
            LinkedListNode<Integer> sortedList = new LinkedListNode<>();
            sortedList.add(56);
            sortedList.add(30);
            sortedList.add(40);
            sortedList.add(70);
            System.out.println("Ordered Linked List: " + sortedList.toString());
        }
    }


