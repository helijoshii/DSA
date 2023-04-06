package Arrays;
import java.util.*;

public class DeleteArray {


    static int find(int arr[], int m){
        for(int i=0; i<(arr.length-1); i++){
            if(arr[i] == m){
                return i;
            }     
        }
        return -1;
    }

    static int delete(int arr[], int m){

        int pos = find(arr, m);
 
        if (pos == -1) {
            System.out.println("Element not found");
            return m;
        }
        return 0 ;
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

        System.out.println("Enter a number to be searched: ");
        int m = sc.nextInt();
        delete(array, m);


    }
}
