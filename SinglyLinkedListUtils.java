package assignment_1;

public class SinglyLinkedListUtils {

    /**
     * Q5: Write a function to concatenate two linked lists
     */
    public static Node concatenateLists(Node list1Head, Node list2Head) {
        if (list1Head == null) {
            return list2Head;

        }
        if (list2Head == null) {
            return list1Head;
        }

        Node current = list1Head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = list2Head;

        
        return list1Head;
    }

    /**
     * Q6: Write a function in to rotate a linked list to the right by k places, where k is a non-negative integer
     */
    public static Node rotateRight(Node head, int k) {
        if (head == null || k == 0 || head.next == null) {
            return head;

        }

        Node current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        
        Node tail = current;
        tail.next = head;

        k = k % length;
        int stepsToNewTail = length - k;
        
        Node newTail = head;
        for (int i = 0; i < stepsToNewTail - 1; i++) {
            newTail = newTail.next;
        }
        

        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    /**
     * Q8: Write a function to search for element in singly linked list and return its position.
     * (Assume position starts at 1)
     */
    public static int searchAndReturnPosition(Node head, int target) {
        Node current = head;
        int position = 1;

        while (current != null) {
            if (current.data == target) {
                return position;
            }
            current = current.next;
            position++;  
        }
        return -1;
    }
    
    /**
     * Q9: Write a function to find the index of a given data value in a linked list 
     * If the data value is not found in the linked list, return -1.
     * (Assume index starts at 0)
     */
    public static int findIndex(Node head, int target) {

        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.data == target) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; 
    }

    /**
     * Q11: Write a function to remove at specific position from singly linked list.
     * (Assume position starts at 0)
     */
    public static Node removeAtPosition(Node head, int position) {
        if (head == null) {
            return null;
        }

        if (position == 0) {

            return head.next;
        }

        Node current = head;
        
        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            return head;
        }

        current.next = current.next.next;
        return head;
    }
}


