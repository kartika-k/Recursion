public class Power {

    public static int pow(int x, int n){
        //Base case
        if(n == 0){
            return 1;
        }
        int pow = x * pow(x,x^n-1);
        return pow;
    }
    public static void main(String args[]){
        int x = 2;
        int n = 10;

        System.out.println(pow(x,n));
    }
}
