package com.springSDC.springazuredemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoServiceTest {

    @Test
    public void testAddition() {
        // Arrange
        int a = 5;
        int b = 3;
        

        
        // Act
        int result = a + b;

        // Assert
        assertEquals(8, result);
    }
}
