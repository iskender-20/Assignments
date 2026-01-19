package assignment_1;
import java.util.HashSet;
public class DoublyLinkedListUtils {
    
    /**
     * Q12: Write a function to remove duplicates elements from doubly Linked List.
     */
    public static DoublyNode removeDuplicates(DoublyNode head) {
        if (head == null) {
            return null;
        }

        HashSet<Integer> seen = new HashSet<>();
        DoublyNode current = head;

        while (current != null) {
            if (seen.contains(current.data)) {
                
                DoublyNode nextNode = current.next;
                DoublyNode prevNode = current.prev;


                if (prevNode != null) {
                    prevNode.next = nextNode;
                } else {
                    head = nextNode;
                }
                
                if (nextNode != null) {
                    nextNode.prev = prevNode;
                }
                

                current = nextNode;
            } else {
                seen.add(current.data);
                current = current.next;
            }
        }
        return head;
    }

    /**
     * Q13: Write a function to traverse a doubly linked list in reverse and print all the 

elements.
     */
    public static void traverseReverse(DoublyNode head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        DoublyNode tail = head;
        while (tail.next != null) {

            tail = tail.next;
        }

        DoublyNode current = tail;
        System.out.print("Reverse Traversal: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.println("NULL");

    }

    /**
     * Q14: Write a function to search for an element in a doubly linked list.
     */
    public static boolean searchElement(DoublyNode head, int target) {
        DoublyNode current = head;

        while (current != null) {
            if (current.data == 

target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}