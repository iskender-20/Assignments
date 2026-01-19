package assignment_2;
import java.util.*;

public class Question3 {
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {

            queue.add(stack.pop());
        }
    }
}