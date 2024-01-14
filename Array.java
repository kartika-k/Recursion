// Check if a given array is soretd or not
public class Array {

    public static boolean isSoretd(int arr[],int i){
        //Base case
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSoretd(arr, i+1);
        
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};

        System.out.println(isSoretd(arr,0));
    }
}
