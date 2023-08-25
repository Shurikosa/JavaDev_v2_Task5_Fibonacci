package goit.com;

public class RecursiveFibonacci {

    public long findFibonacci(int input){
        if (input < 0) {
            throw new IllegalArgumentException();
        } else if (input <= 1) {
            return input;
        }
        return findFibonacci(input - 1) + findFibonacci(input - 2);

    }
}
