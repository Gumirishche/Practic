package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    TangentOperation tangent=new TangentOperation();
    @Test
    public void applyTestTangent(){
        assertEquals(tangent.apply(0.785398),0.999999,0.0001);
        assertEquals(tangent.apply(-0.785398),-0.99999,0.0001);
        assertEquals(tangent.apply(1.0/0.0),0.0/0.0,0.0001);
        assertEquals(tangent.apply(-1.0/0.0),0.0/0.0,0.00001);
        assertEquals(tangent.apply(0.0/0.0),0.0/0.0,0.0001);
    }
}