package Arrays;

import java.util.*;

public class Left_Rotate {
    static void reverse(int arr[], int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void leftRotate(int arr[], int n, int d){
        if(n ==0) return;
        d = d % n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
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

        System.out.println("enter index for left rotate: ");
        int d= sc.nextInt();
        leftRotate(array, n, d);

        System.out.println("After rotation:");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        
    }
}
