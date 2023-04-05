package Sorting;
import java.util.*;

class Solution {
    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }

    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here.
        qs(arr, 0, arr.size() - 1);
        return arr;
    }
}

public class QuickSort {
    
    public static void main(String args[]){
        
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

        array = Solution.QuickSort(array);

        System.out.println("Elements after sorting are: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
