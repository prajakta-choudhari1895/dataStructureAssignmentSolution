package com.src.dsa.project;

import java.util.Scanner;
import java.util.Stack;

public class Skyscraper {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of floors in the building: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the floor size given on day " + i);
            int floor = sc.nextInt();
            stack.push(floor);
        }

        sortstack(stack,n);
    }

    public static Stack<Integer> sortstack(Stack<Integer> input, int n) {

        Stack<Integer> tempStack = new Stack<>();
        while (!input.isEmpty()) {
            int temp = input.pop();
            for (int i = 0; i < n; i++) {
                while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                    input.push(tempStack.pop());
                    System.out.println("Day " + i + ":" + temp);
                }
            }
        }
        return tempStack;
    }
}
