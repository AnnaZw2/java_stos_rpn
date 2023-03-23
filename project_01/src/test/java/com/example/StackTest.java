package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StackTest {
    // Push
    @Test
    void pushShouldThrowExceptionIfArgumentIsNull() {
        final Stack stack = new Stack();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    stack.push(null);
                });
    }

    @Test
    void initializedStackShouldBeEmpty() {
        final Stack stack = new Stack();
        assertTrue(stack.isEmpty());

    }

    @Test
    void elementIsAddedToStackAfterPush() {
        final Stack stack = new Stack();
        stack.push("1");
        assertFalse(stack.isEmpty());
    }

    @Test
    void elementInStackIsActuallyElelmentPushed() {
        final Stack stack = new Stack();
        stack.push("1");
        assertTrue(stack.peek().equals("1"));
    }

    @Test
    void stackInitializedWithSpecificLengthShoulHaveThisLength() {
        final int size = 2;
        final Stack stack = new Stack(size);
        assertTrue(stack.getCapacity() == size);

    }

    @Test
    void stackShouldExpandCapacityWhenFull() {
        final int size = 2;
        final int expandCapacity = 5;
        final Stack stack = new Stack(size, expandCapacity);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        assertTrue(stack.getCapacity() == size + expandCapacity);
    }

    // Peek

    @Test
    void peekShouldReturnLastElementPushed() {
        final Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        assertTrue(stack.peek().equals("3"));
    }

    @Test
    void peekShouldReturnNullIfStackIsEmpty() {
        final Stack stack = new Stack();
        assertTrue(stack.peek() == null);

    }

    // IsEmpty

    @Test
    void isEmptyShouldReturnTrueIfStackIsEmpty() {
        final Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    void isEmptyShouldReturnFalseIfStackIsNotEmpty() {
        final Stack stack = new Stack();
        stack.push("1");
        assertFalse(stack.isEmpty());
    }

    // Length
    @Test
    void lengthShouldReturnLengthOfStack() {
        final Stack stack = new Stack(3);
        assertTrue(stack.getCapacity() == 3);

    }

    @Test
    void lengthShouldReturnLengthOfStackAfterExpanding() {
        final int size = 3;
        final int expandCapacity = 3;
        final Stack stack = new Stack(3, 3);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        assertTrue(stack.getCapacity() == size + expandCapacity);

    }

    //Pop
    @Test
    void popShouldThorwExceptionIfStackIsEmpty() {
        final Stack stack = new Stack();
        assertThrows(IllegalStateException.class,
                () -> {
                    stack.pop();
                });
    }

    @Test
    void popShouldReturnLastElementPushed() {
        final Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        assertTrue(stack.pop().equals("3"));
    }

    @Test
    void popShouldRemoveLastElementPushed() {
        final Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.pop();
        assertTrue(stack.peek().equals("2"));
    }
}
