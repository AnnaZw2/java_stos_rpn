package com.example;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RPNTest {
    @Test
    void calculateShouldReturnZeroIfExpressionIsEmpty() {
        final RPN rpn = new RPN();
     
        assertThrows(IllegalArgumentException.class, () -> {
            rpn.calculate(new String[] {});
        });
    }

    @Test
    void calculateShouldThrowAnExceptionIfCalculatingNull() {
        final RPN rpn = new RPN();
        assertThrows(IllegalArgumentException.class, () -> {
            rpn.calculate(null);
        });
    }


@Test
void calculateShouldThorwAnExceptionIfInvalidSymbols1(){
    final RPN rpn = new RPN();
    assertThrows(IllegalArgumentException.class, () -> {
        rpn.calculate(new String[] { "1", "a", "3" });
    });

    assertThrows(IllegalArgumentException.class, () -> {
        rpn.calculate(new String[] {  "a" });
    });

    assertThrows(IllegalArgumentException.class, () -> {
        rpn.calculate(new String[] {  "/" });
    });
}


@Test 
void calculateShouldReturnCorrectResultForSimpleExpression() {
    final RPN rpn = new RPN();
    final int result = rpn.calculate(new String[] { "1", "2", "+" });
    assertTrue(result == 3);
  

}
@Test 
void calculateShouldReturnCorrectResultForSimpleExpression2() {
    final RPN rpn = new RPN();
    final int result = rpn.calculate(new String[] { "1", "2", "-" });
    assertTrue(result == -1);


}

@Test
void calculateShouldReturnCorrectResultForSimpleExpression3() {
    final RPN rpn = new RPN();
    final int result = rpn.calculate(new String[] { "1", "2", "*" });
    assertTrue(result == 2);


}




}
