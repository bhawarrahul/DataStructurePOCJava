package com.datastructure;

class Stack {
    private int maxSize;
    private int stackArray[];
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[this.maxSize];
        this.top = -1;
    }

    public void push(int element) {
        stackArray[++top] = element;
    }

    public int pop() {
        int topElement = stackArray[top];
        stackArray[top] = -1;
        top--;
        return topElement;
    }

    public void printStack() {
        int topIndex = top;
        for (int count = topIndex; count >= 0; count--) {
            System.out.print(stackArray[count] + " ");
        }
        System.out.println();
    }
}


public class StackDataSructure {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.printStack();

        stack.pop();
        stack.pop();
        stack.printStack();
    }
}
