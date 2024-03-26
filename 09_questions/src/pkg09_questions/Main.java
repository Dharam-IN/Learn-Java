package pkg09_questions;

import java.util.*;

public class Main{
    public static void main(String args[]){
//       PRIME NUMBER
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to find its Number Prime or Not:- ");
            
            int num = sc.nextInt();
            
            boolean isPrime = true;
            for(int a = 2; a <= Math.sqrt(num); a++){
                if(num % a == 0){
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
    }
   
}