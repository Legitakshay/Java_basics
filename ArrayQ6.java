package Java;

public class ArrayQ6 {
    public static void main(String[] args) {
        int []  arr = {1, 2, 3, 4, 5};
      int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i + 1];
            arr[n - 1] = temp;


        }

    }
}
//i=arr.length-1                             i=0

//j=0                                        j=arr.length-1
                                              // while(i<j){

                                                    //temp=arr[i]
                                                    //arr[i]=arr[j]
 //while{i>0                                          arr[j]=temp
  //  temp[j++]=arr[i--]                               i++
                                                       // j--
    //    }                                          // }

//for reversing an array                      its like qick sort algorithm to reverse an array.
