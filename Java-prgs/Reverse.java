import java.util.*;

public class Reverse {
    public static void main(String args[]){

        int n, reverse=0; 
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        n = sc.nextInt();


        while(n!=0){
            int digit = n % 10;
            n= n/10;
            reverse = reverse*10 + digit;

        }

        System.out.println(reverse);
    }

    
}
