package com.example;

import static org.junit.jupiter.api.Assertions.assertThrows;

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
  
}
