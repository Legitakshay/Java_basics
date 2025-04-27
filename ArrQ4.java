package Java;

import java.util.Scanner;

public class ArrQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 2, 15, 45, 33, 42};
        int largest = Math.max(arr[0], arr[1]);
        int second = Math.min(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > largest) {

                second = largest;
                largest = arr[i];
            } else if (arr[i]>second && arr[i]!=largest) {
                arr[i]=largest;



            }
        }


    }
}
