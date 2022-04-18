package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
public class OperationTest {
   Operation op = new Operation();
    @Test
public void testAdd(){
Operation op = new Operation();

assertEquals(10,op.add(5,5));

}
@Test
  public void  testDiv(){

  assertEquals(2,op.div(10,5));

    }
    @Test
    public void  testMul(){

        assertEquals(4,op.mul(2,2));

    }
    @Test
    public void  testSub(){

        assertEquals(5,op.div(10,5));

    }

}
