package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

    public class CalculatorTest {

        @Test
        public void testAdd(){
            Calculator calculator = new Calculator();
            int actual = calculator.add(10,5);
            // expected dan actual setelah execution
            Assert.assertEquals(actual,15);
        }

            @Test
            public void testSubtract(){
                Calculator calculator = new Calculator();
                int actual = calculator.subtract(10,5);
                // expected dan actual setelah execution
                Assert.assertEquals(actual,5);
            }

}


