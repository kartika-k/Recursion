public class Factorial {

    public static int factorial(int n){
        //Base Case
        if(n == 0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fact = n*fnm1;

        return fact;
    }
    public static void main(String arg[]){
        int n = 5;

        System.out.println(factorial(n));;
    }
}
