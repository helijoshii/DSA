import java.util.*;

public class BubbleSort {

    //bubble sort function
    
    static void bubble_sort(int arr[], int n){
        for(int i = n-1; i>=0; i--){
            for(int j=0; j<= i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }           
            }
        }

        System.out.println("Elements in array after sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        //Taking input in array
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
        bubble_sort(array, n);
        

    }
}
