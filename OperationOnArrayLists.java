import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OperationOnArrayLists {

    /* Solution for Question 1.*/

    static int searchXunsortedArray(ArrayList arr, int search)
    {
        /* indexOf() return the first occruence of an elemnet in the array.
         */
        return arr.indexOf(search);
    }


    public static void main(String[] args) {

        /* 1.  Given a set of numbers in an UNSORTED ARRAY.
         We need to find a number X in the array. If X is present in the array, we need to return the
        first index of X.  In Array Lists we have indexOf()
        */

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter the elements:");

        for(int i = 0 ; i < n ; i++)
        {
            int x = sc.nextInt();
            arr.add(x);
        }

        System.out.println("Enter the number you want to search: ");
        int search  = sc.nextInt();
        int index = searchXunsortedArray(arr, search);
        System.out.println("Index of the searched number is: " +index);






    }
}
