package assignment_2;
import java.util.*;

public class Question5 {
    public static Queue<Integer> mergeQueues(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> merged = new LinkedList<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {

                merged.add(q1.poll());
            } else {
                merged.add(q2.poll());
            }
        }
        while (!q1.isEmpty()) merged.add(q1.poll());
        while (!q2.isEmpty()) merged.add(q2.poll());
        return merged;
    }
}