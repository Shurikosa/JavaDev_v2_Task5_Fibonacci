package goit.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RecursiveFibonacciTest {

    private int testWith;
    private long result;
    private RecursiveFibonacci recursiveFibonacci = new RecursiveFibonacci();
    private long expected;

        @Test
        void testSimpleInputFibonacci(){
            //Given
            testWith = 14;
            //When
            result = recursiveFibonacci.findFibonacci(testWith);
            //Then
            expected = 377;
            assertEquals(expected, result);
        }

        @Test
        void testWithNegativeInput(){
            //Given
            testWith = -8;
            //When & Then
            assertThrows(IllegalArgumentException.class, () -> recursiveFibonacci.findFibonacci(testWith));
        }
        @Test
        void testWithZeroInput(){
            //Given
            testWith = 0;
            //When
            result = recursiveFibonacci.findFibonacci(testWith);
            //Then
            expected = 0;
            assertEquals(expected, result);
        }

        @Test
        void testWhenInputIsOne(){
            //Given
            testWith = 1;
            //When
            result = recursiveFibonacci.findFibonacci(testWith);
            //Then
            expected = 1;
            assertEquals(expected, result);
        }
}







