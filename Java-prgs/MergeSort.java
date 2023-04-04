import java.util.*;

public class MergeSort {


    static void merge(int arr[], int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;         
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;         
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }



    static void mergesort(int arr[], int low, int high){
        if(low>= high) return;
        int mid = (low + high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }


    public static void main(String args []){

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter number of elements in array: ");
        n = sc.nextInt();
        int array[] = new int[n];

        System.out.println("Enter elements in array: ");
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Elements in array before sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        mergesort(array, 0, n - 1);

        System.out.println("Elements after sorting are: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
