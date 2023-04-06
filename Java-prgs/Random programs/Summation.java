// summation of a digit of a given number

import java.util.*;

public class Summation {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n= sc.nextInt();

        int sum = 0;
         
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
        System.out.println("Sum of digits is " + sum);
    }
}

