package Arrays;
import java.util.*;


public class MissingNum {
    static int missingNum(int arr[], int n){

        for(int i=1; i<=n; i++){
            int flag = 0;
            for(int j=0; j< n-1; j++){
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) return i;           
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

        int a= missingNum(array, n);
        System.out.println("Missing number is: " + a);


        

    }
}
