// remove duplicates from sorted array

package Arrays;
import java.util.*;

public class RemoveDuplicates {
    static int dupes(int arr[]){
        int i=0;
        for(int j=0; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }

        }
        return i+1;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements in array: ");
        n = sc.nextInt();
        System.out.println("Enter elemnts in array: ");
        int array[] = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Elements in array are: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int k = dupes(array);
        System.out.println("Array aftre removing duplicates: ");
        for(int i=0; i<k; i++){
            System.out.print(array[i] + " ");
        }
    }
}
