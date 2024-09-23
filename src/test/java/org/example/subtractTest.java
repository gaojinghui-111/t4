package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class subtractTest {
    Calc c=new Calc();
    @Test
    void testSubtract(){
        assertEquals(12,c.subtract(20,8));
    }

}
