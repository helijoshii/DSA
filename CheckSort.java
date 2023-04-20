import java.util.*;

public class CheckSort{

    static boolean check(int arr[], int n){

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[i]) 
                    return false;
            }
        }
        return true;
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

        System.out.println("Given array is " + check(array, n));
    }
}
