package Arrays;
import java.util.*;

public class SingleElement {
    
    static int getElement(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int num = arr[i];
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[j] == num){
                    count++;
                }           
            }
            if(count == 1) return num;
        }
        return -1;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements: ");
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

        int ans = getElement(array);
        System.out.println("Element with single occurance is: " + ans);


    }
}
