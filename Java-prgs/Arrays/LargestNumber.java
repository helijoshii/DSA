package Arrays;
import java.util.*;

public class LargestNumber {

    static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
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

        System.out.println("The Largest element in the array is: " + sort(array));

    }
}
