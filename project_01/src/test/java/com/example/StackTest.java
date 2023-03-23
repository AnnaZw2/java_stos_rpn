package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



public class StackTest {
    @Test
    void pushShouldThrowExceptionIfArgumentIsNull() {
       final Stack stack = new Stack();
        assertThrows(IllegalArgumentException.class, 
        () -> {
            stack.push(null);
        }
            );
    }
    @Test
    void  initializedStackShouldBeEmpty(){
        final Stack stack = new Stack();
        assertTrue(stack.isEmpty());

    }

    @Test
    void elementIsAddedToStackAfterPush(){
        final Stack stack = new Stack();
        stack.push("1");
        assertFalse(stack.isEmpty());
    }

    @Test
    void elementInStackIsActuallyElelmentPushed(){
        final Stack stack = new Stack();
        stack.push("1");
        assertFalse(stack.peek().equals("1"));
    }

    @Test 
    void stackInitializedWithSpecificLengthShoulHaveThisLength(){
        final int size = 2;
        final Stack stack = new Stack(size);
       assertTrue(stack.length()==size);
     
    }

    @Test
    void stackShouldExpandCapacityWhenFull(){
        final int size = 2;
        final int expandCapacity = 5;
        final Stack stack = new Stack(size, expandCapacity);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        assertTrue(stack.length()==size+expandCapacity);
    }
    
    @Test 
    void peekShouldReturnLastElementPushed(){
        final Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        assertTrue(stack.peek().equals("3"));
    }

    @Test
    void peekShouldReturnNullIfStackIsEmpty(){
        final Stack stack = new Stack();
        assertTrue(stack.peek()==null);
   
    }

}


  

