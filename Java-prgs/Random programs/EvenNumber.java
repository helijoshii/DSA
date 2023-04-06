// Sum of even number into 1D array

import java.util.*;

public class EvenNumber {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int Size, i, EvenSum = 0;

        System.out.print(" Please Enter Number of elements in an array : ");
        Size = sc.nextInt();

        int [] a = new int[Size];
        System.out.println("Enter " + Size + " elements of array: ");
        for(i = 0; i < Size; i++){
            a[i] = sc.nextInt();
        }
        for(i = 0; i < Size; i++){
            if(a[i] % 2 == 0){
                EvenSum = EvenSum + a[i];
            }
        }
        System.out.println("The sum of even numbers in an array is " + EvenSum);



    }
}
