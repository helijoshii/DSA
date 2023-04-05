package Sorting;
//Bubble sort with recusion

import java.util.*;

public class BubbleRec {

    static void bubble_rec(int arr[], int n){
        if(n==1) return;
        for(int j=0; j<=n-2; j++){
            if(arr[j]> arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            
        }
        bubble_rec(arr, n-1);
        
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of elemnts in array: ");
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

        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Bubble sort
        bubble_rec(array, n);

        System.out.println("Elements in array after sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
