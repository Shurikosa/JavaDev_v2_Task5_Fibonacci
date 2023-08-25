package goit.com;

public class SimpleIterationFibonacci {
    public int findFibonacci(int input) {
        if (input < 0) {
            throw new IllegalArgumentException();
        }else if(input <= 1) {
            return input;
        }else{
            int prev = 0;
            int current = 1;
            int next;

            while (input > 0){
                next = prev + current;
                prev = current;
                current = next;
                input--;
            }
            return prev;
        }
    }
}
