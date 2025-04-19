package Java;

public class Year {
    public static void main(String[] args) {
        int year = 1900;
        if (year % 100 == 0) {
            if (year%400==0){
                System.out.println("leap");
            }else{
                System.out.println("not leap");

            }

        }else {
            if (year % 4 == 0) {
                System.out.println("leap");
                }else{
                    System.out.println("not leap");

                }
        }
    }

}
