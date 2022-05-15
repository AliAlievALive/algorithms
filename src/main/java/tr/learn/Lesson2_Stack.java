package tr.learn;

import java.util.Stack;

public class Lesson2_Stack {
    Stack<Integer> st = new Stack<>();

    public static void main(String[] args) {
//        st.push(2);
//        st.push(7);
//        System.out.println(st.peek());
//        st.pop();
//        st.push(3);
//        st.push(4);
//        System.out.println(st.peek());
//        st.pop();
//        System.out.println(st.peek());

        // Check to (){}[]
        String s1 = "()({[]}())"; // true
        String s2 = "{}"; // true
        String s3 = "}{"; // false
        String s4 = ""; //true
        String s5 = "(()"; //false
        String s6 = "())"; //false
        String s7 = "[(])"; //false
        System.out.println(isBalanced(s1));
        System.out.println(isBalanced(s2));
        System.out.println(isBalanced(s3));
        System.out.println(isBalanced(s4));
        System.out.println(isBalanced(s5));
        System.out.println(isBalanced(s6));
        System.out.println(isBalanced(s7));
    }

    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (isOpen(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty() && isPair(stack.peek(), s.charAt(i))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isPair(char open, char close) {
        return open == '{' && close == '}' ||
                open == '[' && close == ']' ||
                open == '(' && close == ')';

    }

    private static boolean isOpen(char ch) {
        return ch == '{' || ch == '[' || ch == '(' ;
    }
}
