package Java;

import java.util.Scanner;

public class LoopQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0, odd = 0;

        for (long i = 1; i <= n; i++) {
            if(i%2==0) {
                System.out.println();;
            }else{
                System.out.println(odd);
            }

        }
    }
}