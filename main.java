package assignment_2;
import java.util.*;


public class main {
    public static void main(String[] args) {
        // Q1: Reverse String
        System.out.println("Q1: " + Question1.reverseString("Ali"));

        // Q2: Sort Stack
        Stack<Integer> s = new Stack<>();
        s.push(20); s.push(10); s.push(30);
        System.out.println("Q2: Sorted Stack: " + Question2.sortStack(s));

        // Q3: Reverse Queue
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3));
        Question3.reverseQueue(q);
        System.out.println("Q3: Reversed Queue: " + q);

        // Q4: Priority Queue (Smallest first)
        PriorityQueue<Integer> pq = Question4.createPriorityQueue();
        pq.add(50); pq.add(10); pq.add(30);
        System.out.print("Q4: Priority Queue Elements: ");
        while(!pq.isEmpty()) System.out.print(pq.poll() + " "); 
        System.out.println();

        // Q5: Merge Queues
        Queue<Integer> q1 = new LinkedList<>(Arrays.asList(1, 4, 7));
        Queue<Integer> q2 = new 

LinkedList<>(Arrays.asList(2, 5, 8));
        System.out.println("Q5: Merged Queues: " + Question5.mergeQueues(q1, q2));
    }
}
