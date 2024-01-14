public class printIncreasing {
    public static void printInc(int n){
        //Base Case
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String args[]){
        int n = 10;
        printInc(n);
    }
}
