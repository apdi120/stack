import java.util.Stack;

public class StackExercises {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        stack.push("Go");

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.isEmpty());


        System.out.println("\n--- String Reversal ---");

        String original = "Hello World";
        Stack<Character> s = new Stack<>();

        for (char ch : original.toCharArray()) {
            s.push(ch);
        }

        String reversed = "";

        while (!s.isEmpty()) {
            reversed += s.pop();
        }

        System.out.println(original);
        System.out.println(reversed);


        System.out.println("\n--- Balanced Brackets ---");

        String balanced = "({[()]})";
        String unbalanced = "({[})";

        System.out.println(isBalanced(balanced));
        System.out.println(isBalanced(unbalanced));
    }

    public static boolean isBalanced(String str) {

        Stack<Character> s = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }

            else if (ch == ')' || ch == '}' || ch == ']') {

                if (s.isEmpty()) {
                    return false;
                }

                char top = s.pop();

                if (ch == ')' && top != '(' ||
                        ch == '}' && top != '{' ||
                        ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }
}