package assignment_1;
    
public class CircularLinkedListUtils {

public static CircularNode insertAtPosition (CircularNode head, int data, int position) {
        CircularNode newNode = new CircularNode(data);
        if (head == null) {
            return newNode;
        }

        if (position == 1) {
            newNode.next = 

head.next;
            head.next = newNode;
            int temp = head.data; 
            head.data = newNode.data; 
            newNode.data = temp;
            return head; 
        }

        CircularNode current = head.next; 
        for (int i = 1; i < position - 1; i++) {
            if (current == head) { 
                return head; 
            }
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        return head;
    }


    public static CircularNode deleteAtPosition(CircularNode head, int position) {
        if (head == null) {
            return null;
        }

        if (position == 1) {
            if (head.next == head) {
                return null;
            }

            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }

        CircularNode previous = head;
        CircularNode current = head.next;
        
        for (int i = 1; i < position; i++) {
            previous = current;
            current = current.next;
            if (current == head.next) {
                return head;
            }
        }

        previous.next = current.next;
        
        return head;
    }


    /**
     * Q17: Write a function to search for an element in a circular linked list.
     */
    public static boolean searchElement(CircularNode head, int target) {
        if (head == null) {
            return false;
        }

        CircularNode current = head;

        do {
            if (current.data == target) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    /**
     * Q18: Write a function to split a circular linked list into 

two halves
     */
    public static CircularNode[] splitList(CircularNode head) {
        if (head == null || head.next == head) {
            return new CircularNode[]{head, null};
        }

        CircularNode slow = head;
        CircularNode fast = head;


        do {
            fast = fast.next.next;
            if (fast.next != head) {
                 slow = slow.next;
            }
        } while (fast.next != head && fast != head);

        CircularNode head2 = slow.next;
        slow.next = head;

        CircularNode current = head2;
        while (current.next != head) {
             current = current.next;
        }
        current.next = head2;
        
        return new CircularNode[]{head, head2};

    }
}

