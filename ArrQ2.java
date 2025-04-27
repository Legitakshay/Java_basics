package Java;

import java.util.Scanner;

public class ArrQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int sum = 0;
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            sum = sum / arr.length;
        }
        System.out.println("Mean : " +sum);

    }
}
