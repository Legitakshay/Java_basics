package Java;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 30;

        int p1 = 1, p2 = 0;
        System.out.println(p2 + "" +p1 + "");
        for (int i = 0; i <= n; i++) {
        int current = p2 + p1;
         System.out.println(current + "");
        p2 = p1;
           p1 = current;
       //for (int i = 100; i >= 0; i=i/10) {
         //  System.out.println(i);


        }

    }
}
