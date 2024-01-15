// Write a program to find Length of a String using Recursion.

public class lengthOfString {

    public static int length(String str){
        //Base case
        if(str.equals("")){
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
    public static void main(String args[]){
        String str = "Hello";
        System.out.println(length(str));
    }
}
