package JavaMethods;

class FactorialRecursion {

    static int factorial(int n) {
        if (n == 1) { 
            return 1;
        }
        return n * factorial(n - 1); 
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); 
    }
}


/* --- Fibonacci Series using Recursion---
class FibonacciRecursion {

    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(6)); // 8
    }
}*/
