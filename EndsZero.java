// package Arrays;
import java.util.*;

public class EndsZero {
    static void zeros(int arr[]){
        int n = arr.length;
        int temp [] = new int[n];
        int k = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                temp[k] = arr[i];
                k++;
            }
        }

        while(k<n){
            temp[k] = 0;
            k++;
        }

        System.out.println("Elements in array after moving zeros to the end: ");
        for(int i=0; i<n; i++){
            System.out.print(temp[i] + " ");
        }
        System.out.println();
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

        zeros(array);

        
        
    }
}
