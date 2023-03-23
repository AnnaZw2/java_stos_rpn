package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



public class StackTest {
    // write test that ensures that user envokes push method with int argument
//and thorw excpetion if not
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

    
    
   
  
}


  

