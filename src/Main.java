import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("H");
        stack.push("E");
        stack.push("L");
        stack.push("L");
        stack.push("O");
        stack.push(" ");
        stack.push("W");
        stack.push("O");
        stack.push("R");
        stack.push("L");
        stack.push("D");

        System.out.println("Stack<String> stack [INITIAL]: " + stack);
        System.out.println("Stack<String> stack [SIZE-INIT]: " + stack.size());

        DynamicSelect dynamicSelect = new DynamicSelect();

        Object[] dynamicStack = dynamicSelect.StackDynamicSelect(2, stack);

        System.out.println("Stack element caught: " + Arrays.toString(dynamicStack));
        System.out.println("Stack<String> stack [FINAL]: " + stack);
        System.out.println("Stack<String> stack [SIZE-FINAL]: " + stack.size());
    }
}