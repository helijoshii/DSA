package Sorting;
import java.util.*;

public class InsertionSort {

    static void insertSort(int arr[], int n){
        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }

        }

        System.out.println("Elements in array after sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Enter number of elements in array: ");
        n = sc.nextInt();
        int array[] = new int[n];

        System.out.println("Enter elements in array: ");
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Elements in array before sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        insertSort(array, n);



    }
}
 