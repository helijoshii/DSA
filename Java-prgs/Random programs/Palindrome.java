// whether string is palindrome or not

import java.util.*;

public class Palindrome{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String str, rev = "";

        System.out.println("Enter a string: ");
        str = sc.nextLine();
       
        for(int i = str.length() - 1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str + " is palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }


    }
}
