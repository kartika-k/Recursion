//Print all Binary strings of size n without consecutive ones
public class BinaryStringsProblem {

    public static void printBinaryStrings(int n, int lastPlace, String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        //kaam
        // if(lastPlace == 0){
        //     //sit 0 on chair n
        //     printBinaryStrings(n-1, 0, str+"0");
        //     //sit 1 on chair n
        //     printBinaryStrings(n-1, 1, str+"1");
        // }else{
        //     printBinaryStrings(n-1, 0, str+"0");
        // }

        printBinaryStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinaryStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        printBinaryStrings(3,0,"");
    }
}
