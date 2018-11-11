import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class zerosatend {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n=Integer.parseInt(sc.nextLine());

        int n1[]=new int[n];
        for(int i=0;i<n1.length;i++){
          System.out.println("Enter the number:" +(i+1));
          n1[i]= Integer.parseInt(sc.nextLine());
        }

        System.out.println("Numbers: ");
        IntStream.of(n1).forEach(value -> System.out.printf("%d ", value));


        int arr[] =n1.clone() ;
        int n2 = arr.length;
        pushZerosToEnd(arr, n2);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }


    static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
    }


}




