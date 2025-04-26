package Java;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,8,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
           // arr[1] = 85;
           // System.out.println(arr[1]);
           // System.out.println(arr[2]);
           // System.out.println(arr[3]);
           // System.out.println(arr[4]);
          //  System.out.println(arr[5]);

        }
        System.out.println(Arrays.toString(arr));
    }

}
//Array-linear,Homogeneous,continuous.
//Data type,name,dimension,allocates new in the memory,size of an array.
//default values
//integer -0//,floats-0.0,boolean-false,non primitives-null,char-null character/unicode-'\u0000'
//Array is the collection of variables