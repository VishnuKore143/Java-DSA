package DSA;

public class InsertElementAtIndex {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int atIndex = 2;
        int insertItem = 150;

        for (int i=arr.length-1; i>atIndex; i--){
            arr[i] = arr[i-1];
        }
        arr[atIndex] = insertItem;

        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
