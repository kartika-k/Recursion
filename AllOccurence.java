// For a given integer array of size N. You have to find all the occurrences
// (indices) of a given element (Key) and print them. Use a recursive function to solve this
// problem.

public class AllOccurence {

    public static void getAllOcc(int arr[], int key, int i){
       //Base case
        if(i == arr.length){
            return;
        }
        
        if(arr[i] == key){
           System.out.print(i+ " ");
        }
        getAllOcc(arr, key, i+1);
       
    }
    public static void main(String[] args){
        int arr[] = {3,2,4,5,6,2,7,2,2};

        getAllOcc(arr,2,0);
        System.out.println();
    }
}
