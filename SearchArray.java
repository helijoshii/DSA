import java.util.*;

public class SearchArray {

    static int search(int arr[], int m){
        for(int i=0; i<(arr.length-1); i++){
            if(arr[i] == m){
                System.out.println("Found");
            }     
        }
        return -1;
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
        search(array, m);

    }
}
