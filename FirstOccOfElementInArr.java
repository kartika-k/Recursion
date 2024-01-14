public class FirstOccOfElementInArr {

    public static int firstOccurence(int arr[], int key, int i){
        //base case
        if(i == arr.length){
            return -1;
        }
        //compare key with self
        if(arr[i] == key){
            return i;
        }
        //and then look fwd
        return firstOccurence(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        // int key = 5;

        System.out.println(firstOccurence(arr,5, 0));
    }
}
