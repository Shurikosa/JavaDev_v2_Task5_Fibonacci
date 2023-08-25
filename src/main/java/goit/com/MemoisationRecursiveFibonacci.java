package goit.com;

public class MemoisationRecursiveFibonacci {


    public long findFibonacci(int input){
        if (input < 0) {
            throw new IllegalArgumentException();
        } else if (input <= 1) {
            return input;
        }
        long[] fibonacciCache = new long[input + 1];
        if(fibonacciCache[input] != 0){
            return fibonacciCache[input];
        }
        long fibonacciNumber = (findFibonacci(input - 1) + findFibonacci(input - 2));
        fibonacciCache[input] = fibonacciNumber;
        return fibonacciNumber;
    }
}
