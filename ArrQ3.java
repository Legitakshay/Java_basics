package Java;

import java.util.Scanner;

public class ArrQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {19, 67, 4, 78, 100, 3};
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max +" element present in " +index);
    }
}
