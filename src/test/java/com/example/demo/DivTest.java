package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DivTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();
    
    @Test
    public void shouldThrowException3() {
        Div div = new Div();
        
        expected.expect(ArithmeticException.class);
        div.process(1,0);
    }
    
    @Test(expected=ArithmeticException.class)
    public void shouldThrowException2() {
        Div div = new Div();
        div.process(1,0);
    }
    
    @Test
    public void shouldThrowException() {
        Div div = new Div();
        try {
            double result = div.process(1,0);
            fail("Should not be here!!");
        } catch (ArithmeticException e) {
            // TODO: handle exception
        }
        
    }

}
