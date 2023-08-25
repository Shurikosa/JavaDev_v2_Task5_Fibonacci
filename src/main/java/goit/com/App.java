package goit.com;

public class App 
{
    public static void main( String[] args ) {
        SimpleIterationFibonacci simpleIterationFibonacci = new SimpleIterationFibonacci();
        RecursiveFibonacci recursiveFibonacci = new RecursiveFibonacci();
        MemoisationRecursiveFibonacci memoisationRecursiveFibonacci = new MemoisationRecursiveFibonacci();

        System.out.println(simpleIterationFibonacci.findFibonacci(14));
        System.out.println(recursiveFibonacci.findFibonacci(14));
        System.out.println(memoisationRecursiveFibonacci.findFibonacci(14));

    }
}
