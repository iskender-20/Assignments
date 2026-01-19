package assignment_1;
import java.util.Arrays;
public class Assignment1Test {
     
    public static void printSinglyList(Node head) {
        Node current = head;
        if (current == null) {
            System.out.println("The List is Empty : ");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    public static void printDoublyList(DoublyNode head) {
        DoublyNode current = head;
        if (current == null) {
            System.out.println("The List is Empty : ");
            return;
        }
        

System.out.print("Traversal: NULL <-> ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void printCircularList(CircularNode head) {

        if (head == null) {
            System.out.println("The List is Empty : ");
            return;
        }
        CircularNode current = head.next;
        System.out.print("Circular List: ");
        
        do {
            System.out.print(current.data + " -> ");
            current = current.next;

        } while (current != head.next);
        
        System.out.println("[Re-links to " + head.next.data + "]");
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("First Assignment Solutions For Data Structeres : ");
        System.out.println("==========================================");

        System.out.println("Testing Array Functions ---");

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Marrix : " + Arrays.toString(arr));


        int[] arrClone = ArrayUtils.cloneArray(arr);
        System.out.println("  Q1: Cloned Array : " + Arrays.toString(arrClone));

        int[] arrNoRandom = ArrayUtils.removeRandomElement(arr.clone());
        System.out.println("  Q2: After Removing A Random Item  : " + Arrays.toString(arrNoRandom));


        int[] arrNoSpecific = ArrayUtils.removeSpecificElement(arr, 30);
        System.out.println("  Q3: After Removing The Value : 30: " + Arrays.toString(arrNoSpecific));

        int[] arrToReverse = {1, 2, 3, 4, 5};
        ArrayUtils.reverseArray(arrToReverse);
        System.out.println("  Q4: The Matrix After Inversion  : " + Arrays.toString(arrToReverse));

        System.out.println("Testing The Functions Of A Single List  ---");


        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(3);
        
        Node list2 = new Node(4);
        list2.next = new Node(5);

        Node concatenatedList = SinglyLinkedListUtils.concatenateLists(list1, list2);

        System.out.print("  Q5: List After Merge : ");
        printSinglyList(concatenatedList); 

        Node listRotate = new Node(1);
        listRotate.next = new Node(2);
        listRotate.next.next = new Node(3);
        listRotate.next.next.next = new Node(4);

        Node rotatedList = SinglyLinkedListUtils.rotateRight(listRotate, 2);
        System.out.print("  Q6:  List After Rotation  (k=2): ");
        printSinglyList(rotatedList);

        int position = SinglyLinkedListUtils.searchAndReturnPosition(rotatedList, 2);
        System.out.println("  Q7: The Position Of Value 2 is : " + position);

        int index = SinglyLinkedListUtils.findIndex(rotatedList, 1);
        System.out.println("  Q8:  Value Index 2 is : " + index);

        Node removedList = SinglyLinkedListUtils.removeAtPosition(rotatedList, 1);
        System.out.print("  Q9: Delet Index 1 (The Value 4): ");
        printSinglyList(removedList);


        System.out.println("--- Testing Double List Functions ---");

        DoublyNode dList = new DoublyNode(1);
        dList.next = new DoublyNode(2);
        dList.next.prev = dList;
        dList.next.next = new DoublyNode(1);
        dList.next.next.prev = dList.next;
        dList.next.next.next = new DoublyNode(3);
        dList.next.next.next.prev = dList.next.next;
        dList.next.next.next.next = new DoublyNode(2);
        dList.next.next.next.next.prev = dList.next.next.next;

        System.out.print("  Original List : ");
        printDoublyList(dList);

        DoublyNode noDuplicates = DoublyLinkedListUtils.removeDuplicates(dList);
        System.out.print("  Q10: After Removing Duplicates  : ");
        printDoublyList(noDuplicates);

        System.out.print("  Q11: ");
        DoublyLinkedListUtils.traverseReverse(noDuplicates);

        boolean isFound = DoublyLinkedListUtils.searchElement(noDuplicates, 2);
        System.out.println("  Q12: Is The Value 2 Present ?  " + (isFound ? "Yes" : "No"));

        System.out.println(" Testing Circular List Functions ---");

        CircularNode cListHead = new CircularNode(1);
        CircularNode two = new CircularNode(2);
        CircularNode three = new CircularNode(3);
        

        cListHead.next = two;
        two.next = three;
        three.next = cListHead;

        CircularNode headPass = two;
        
        System.out.print(" Original List : ");
        printCircularList(headPass);

        CircularNode listAfterInsert = CircularLinkedListUtils.insertAtPosition(headPass, 4, 2);
        System.out.print("  Q13: After Inserting 4 Into Position 2 : ");
        printCircularList(listAfterInsert);

        CircularNode listAfterDelete = CircularLinkedListUtils.deleteAtPosition(listAfterInsert, 3);
        System.out.print("  Q14: After Deleting Position  3 : ");
        printCircularList(listAfterDelete);

        boolean isFoundCircular = CircularLinkedListUtils.searchElement(listAfterDelete, 3);
        System.out.println("  Q15: Is The Value 3 Present  " + (isFoundCircular ? "Yes" : "No"));

        CircularNode splitHead = new CircularNode(10);
        CircularNode n20 = new CircularNode(20);
        CircularNode n30 = new CircularNode(30);
        CircularNode n40 = new CircularNode(40);
        splitHead.next = n20;
        n20.next = n30;
        n30.next = n40;
        n40.next = splitHead;

        
        CircularNode[] halves = CircularLinkedListUtils.splitList(splitHead);
        System.out.print("  Q16: The First Half : ");
        printCircularList(halves[0]);
        System.out.print("  Q16: The Second Half : ");
        printCircularList(halves[1]);
    }
}
