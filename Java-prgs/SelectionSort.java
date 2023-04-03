import java.util.*;

public class SelectionSort {

    static void selection_sort(int arr[], int n){
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Elements in array after sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

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

        selection_sort(array, n);


    }
}
