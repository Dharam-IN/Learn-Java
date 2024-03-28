package pkg09_questions;

import java.util.*;

public class Main{
//    Prime Number Check
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check its prime or not");
        int num = sc.nextInt();
        
        boolean condition = true;
        for(int a = 2; a < num / 2; a++){
            if(num % a == 0){
                condition = false;
                break;
            }
        }
        
        if(condition){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime");
        }
        
    }
}