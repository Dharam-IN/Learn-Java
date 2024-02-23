
package pkg05_patterns_in_java;
import java.util.*;
public class Main {
    public static void main(String[] args) {
//         int n = 4;
//         
//         for(int row = 1; row <= n; row++){
//             for(int space = 1; space <= n-row; space++){
//                 System.out.print(" ");
//             }
//             
//             for(int column = 1; column <= row; column++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }

//        PALINDROME NUMBER
            Scanner sc = new Scanner(System.in);
            int num2 = sc.nextInt();
            int num = num2;
            int reverse = 0;
            
            while(num2 != 0){
                int digit = num2 % 10;
                reverse = (reverse * 10) + digit;
                num2 = num2 / 10;
            }
            
            System.out.println("Your Number is:- " + num);
            
            if(num == reverse){
                System.out.println("Palindrome Number");
            }else{
                System.out.println("Not Palindrome");
            }

    }
    
}
