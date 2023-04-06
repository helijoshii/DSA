// factorial of a given integer

import java.util.*;

public class Factorial {
    public static void main(String args[]){

        int n, ans=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        for(int i=n; i>=1; i--){
            ans = ans * i;
        }

        System.out.println("Factorial of a given number is " + ans);
    }
}


