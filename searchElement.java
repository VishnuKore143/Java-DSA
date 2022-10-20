package DSA;

import java.util.Scanner;

public class searchElement {
    static int Search(){
        Scanner sc = new Scanner(System.in);
        int[] arr = {20,5,7,25};
        int sizeofarray = 6;
        int search = 7;

            for (int i = 0; i < sizeofarray; i++) {
                if (arr[i] == search)
                    return i;
            }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Search());
    }
}
