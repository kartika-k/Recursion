public class optimizedPow {

    public static int optimizedPower(int x,int n){     //O(log n)
        //Base Case
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x,n/2);
        int powerSq = halfPower*halfPower;

        //if n is odd
        if(n%2 != 0 ){
            powerSq = x*powerSq;
        }
        return powerSq;

    }
    public static void main(String args[]){
        int x = 2;
        int n = 10;

        System.out.println(optimizedPower(x,n));

    }
}
