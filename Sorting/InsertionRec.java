package Sorting;
// Insertion sort with recusion

import java.util.*;

public class InsertionRec {
    static void insert_rec(int arr[], int i, int n){
        if(i==n) return;
        int j=i;
        while(j>0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insert_rec(arr, i+1, n);
        
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

        //Bubble sort
        insert_rec(array, 0, n);

        System.out.println("Elements in array after sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }


    }
}
