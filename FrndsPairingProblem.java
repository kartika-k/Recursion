public class FrndsPairingProblem {

    public static int friendsPair(int n){
        //base case
        if(n == 1 || n == 2){  //n ways
            return n;
        }
        //kaam
        //choice
        //single
        int fnm1 = friendsPair(n-1);
        //pair      
        int fnm2 = (n-1) * friendsPair(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(friendsPair(4));
    }
}
