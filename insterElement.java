package DSA;

public class insterElement {
    static int insert(){
        int[] arr = {5,10,20,0,0,0,0};
        int n = 5;
        int x = 7;
        int capacity = 6;
        int position = 2;

        if (n==capacity)
            return n;

        int index  = position-1;
        for (int i=n-1; i>=index; i--){
            arr[i+1]=arr[i];
            arr[index]=x;
        }
        return (n+1);
    }

    public static void main(String[] args) {
        System.out.println(insert());
    }
}
