package DSA;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10,40,80,30,60,20};
        int deleteElement = 80;
        int count = 0;

        for (int i = 0; i< arr.length; i++){
            if (deleteElement==arr[i]){
                for (int j=i; j< arr.length-1; j++) {
                    arr[i] = arr[j + 1];
                    count += 1;
                }
                break;
            }
        }
        if (count==0){
            System.out.println("Element not found.");
        }else {
            System.out.println("Element deleted successfully");
            for (int i=0; i<arr.length-1; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
