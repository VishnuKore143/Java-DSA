package DSA;

public class stringSearch {
    public static void main(String[] args) {
        // Linear Search String

        String[] arr = {"Vishnu","Prabhu","Rohit","bunty"};
        String searchItem = "jhgjf";
        int temp = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i].equals(searchItem)){
                System.out.println(" String item is present at index "+i);
                temp+=1;
            }

        }
        if (temp==0){
            System.out.println("String item not found");
        }
    }
}
