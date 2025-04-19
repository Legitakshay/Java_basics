package Java;


public class WhileLoop {
    public static void main(String[] args) {
        //int n =5;
        //int i =1;
        // while (i<=n){
        //   System.out.println(i);
        // i++;

        int n = 121;
        int sum = 0;
        int temp = n;

        while (n != 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            //    System.out.println(rem);
            n = n / 10;
        }
        System.out.println(sum==temp);

    }
}

//while only needs condition its not mandatory to initialize it inside the brackets.
//we use a temp vriable to check wether the given input is palindrome.