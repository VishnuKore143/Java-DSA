package DSA;

public class InsertElementAtPosition {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int insertItem = 60;
        int atPosition = 2;

        //insert item in array
        for (int i=arr.length-1; i>atPosition-1; i--){
            arr[i] = arr[i-1];
        }
        arr[atPosition-1] = insertItem;

        // print array
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
