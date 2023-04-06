package Arrays;
import java.util.*;

public class LinearSearch {

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
        System.out.println("enter the number you want to search: ");
        int x = sc.nextInt();
        for(int i=0; i<n; i++){
            if(array[i] == x){
                System.out.println("Element is found at index number:" + i);
            }
            
        }



    }
}
