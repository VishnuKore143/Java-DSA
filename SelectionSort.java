package DSA;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {38,52,9,18,6,65,13};
        int min, temp = 0;

        for (int i=0; i< arr.length; i++){

            min = i;

            for (int j=i; j<arr.length; j++){

                if (arr[j]<arr[min]){
                    min = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
