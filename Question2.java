package assignment_2;
import java.util.Stack;

public class Question2 {
    public static Stack<Integer> sortStack(Stack<Integer> input) {

        Stack<Integer> tempStack = new Stack<>();
        while (!input.isEmpty()) {
            int tmp = input.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > tmp) {
                input.push(tempStack.pop());
            }
            tempStack.push(tmp);
        }
        return tempStack;
    }
}
