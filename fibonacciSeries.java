public class fibonacciSeries {

    //calculate nth term in fibonacci
    public static int fib(int n){
        //Base case - f(0) = 0 and f(1) = 1
        if(n == 0 || n == 1){
            return n;
        }
        int fib1= fib(n-1);
        int fib2 = fib(n-2);
        int fibn = fib1 + fib2;

        return fibn;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(fib(n));
    }
}
