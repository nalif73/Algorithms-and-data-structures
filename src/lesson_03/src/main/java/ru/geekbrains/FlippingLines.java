package ru.geekbrains;

import ru.geekbrains.stack.Stack;
import ru.geekbrains.stack.StackImpl;

public class FlippingLines {

    public static void main(String[] args) {
        String lines = "123 456 789";
        System.out.println("Original lines " + lines);
        System.out.println("Flip lines " + flip(lines));
    }

    public static String flip(String lines) {
        Stack<Character> stack = new StackImpl<>(lines.length());
        char[] chars = lines.toCharArray();
        for (int i = 0; i < lines.length(); i++) {
            stack.push(chars[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines.length(); i++)
            sb.append(stack.pop());

        return sb.toString();
    }
}
