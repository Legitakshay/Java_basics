package Java;

import java.util.Scanner;

public class CalculatorWloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter 1 for addition\n" +
                    "Enter 2 for subtraction\n" +
                    "Enter 3 for multiplication\n" +
                    "Enter 4 for division\n" +
                    "Enter 5 for exiting program");
            n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("Enter first program");
                    int first = sc.nextInt();
                    System.out.println("Enter second program");
                    int second = sc.nextInt();
                    System.out.println("sum=" + (first + second));
                }
                case 2 -> {
                    System.out.println("Enter first program");
                    int first = sc.nextInt();
                    System.out.println("Enter second program");
                    int second = sc.nextInt();
                    System.out.println("subtraction=" + (first - second));

                }
                case 3 -> {
                    System.out.println("Enter first program");
                    int first = sc.nextInt();
                    System.out.println("Enter second program");
                    int second = sc.nextInt();
                    System.out.println("Multiplication=" + (first * second));
                }
                case 4 -> {
                    System.out.println("Enter first program");
                    int first = sc.nextInt();
                    System.out.println("Enter second program");
                    int second = sc.nextInt();
                    System.out.println("divison=" + (first / second));
                }
                case 5->{
                    System.exit(0);

                }


            }


        }while (true);
    }
}
