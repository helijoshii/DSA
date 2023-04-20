// package Arrays;

import java.util.*;

public class LeftRotate {
    static void leftrotate(int arr[], int n){

        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
          arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements in array: ");
        n = sc.nextInt();
        System.out.println("Enter elements in array: ");
        int array[] = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Elements in array are: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        leftrotate(array,n);
    }
}
