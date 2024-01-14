public class SumOfFirstNnaturalNum {

    public static int sum(int n){
        //Base condition
        if(n == 1){
            return 1;
        }
        int Snm1 = sum(n-1);
        int sumOfNTerms = n + Snm1;
        
        return sumOfNTerms;

    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(sum(n));
    }
}
