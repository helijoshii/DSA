import java.util.*;

public class SecondLarge {

    static int second_large(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];
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

        System.out.println("The  Second Largest element in the array is: " + second_large(array));
    }
}
