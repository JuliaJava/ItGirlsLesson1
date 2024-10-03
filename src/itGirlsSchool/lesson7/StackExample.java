package itGirlsSchool.lesson7;

import java.util.Stack;

public class StackExample {

    public static boolean isCorrectOrder(String alphabet) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = alphabet.toCharArray();
        for (char character : charArray) {
            if (stack.empty() && character == 'a') {
                stack.push(character);
            } else if (character == 'b' && stack.peek() == 'a') {
                stack.pop();
            } else if (character == 'c' && stack.peek() == 'b') {
                stack.push(character);
            } else if (character == 'd' && stack.peek() == 'c') {
                stack.push(character);
            } else if (character == 'e' && stack.peek() == 'd') {
                stack.push(character);
            } else {
                return false;
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }
}
