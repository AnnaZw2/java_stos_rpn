package com.example;

public class Stack {
    private int capacity;
    private int expandCapacity = 2;
    private String[] stack;
   
    public  Stack (){
       capacity = 2;
       this.stack = new String[capacity];
    
    }

    public Stack(int size) {
        this.capacity = size;
        this.stack = new String[capacity];
       
    }

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

        return true;
    }

    public String peek() {
        return null;
    }

    public String pop() {
        return null;
    }

    public int length() {
        return stack.length;
    }

}
