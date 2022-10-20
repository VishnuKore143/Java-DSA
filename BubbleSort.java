package DSA;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,1,8,2,7,3,6,4,0,5};
        int temp;
        for (int i=0; i<arr.length; i++){
            int flag = 0;
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag +=1;
                }
            }
            if (flag==0){
                break;
            }
        }

        //print array
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
