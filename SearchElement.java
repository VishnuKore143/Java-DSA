package DSA;

import java.util.Scanner;

public class searchElement {
    static int Search(){
        Scanner sc = new Scanner(System.in);
        int[] arr = {20,5,7,25};
        int n = 5;
        int x = 7;

            for (int i = 0; i < n; i++) {
                if (arr[i] == x)
                    return i;
            }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Search());
    }
}
