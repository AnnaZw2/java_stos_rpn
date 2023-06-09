package com.example;

public class Stack {
    private int capacity;
    private int expandCapacity = 2;
    private String[] stack;
    private int top = -1;
   
    //init stack with default capacity
    public  Stack (){
       capacity = 2;
       this.stack = new String[capacity];
    
    }

    //init stack with specific capacity
    public Stack(int size) {
        this.capacity = size;
        this.stack = new String[capacity];
       
    }

    //init stack with specific capacity and expand capacity
    public Stack (int size, int expandCapacity){
        this.capacity = size;
        this.expandCapacity = expandCapacity;
        this.stack = new String[capacity];
    }



    public void push(String item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        expandStackCapacity();
        stack[++top] = item;

    

    }

    private String[] expandStackCapacity() {
        if (stack.length == capacity) {
            String newStack[] = new String[capacity + expandCapacity];

            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        return stack;
    }

    public Boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        return stack[top--];
    }

    //return the length of the stack
    public int getCapacity() {
        return stack.length;
    }

    //return the number od elements in the stack
    public int size (){
        return top + 1;
    }

}
