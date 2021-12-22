package stack;

import java.util.Stack;

public class CobaStack {
    public static void main(String[] args) {
        Stack<Integer> bilangan = new Stack<>();

        for (int i = 1; i <= 5; i++) {
            bilangan.push(i);
        }

        bilangan.pop();
        bilangan.pop();

        System.out.println(bilangan.peek());
    }
}
