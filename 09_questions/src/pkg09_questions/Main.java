package pkg09_questions;

import java.util.*;

public class Main{
//    Write a function which takes in 2 numbers and returns the greater of those two.
        public static void main(String args[]){
            greater();
        }
        
        public static void greater(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your First Number:- ");
            int num1 = sc.nextInt();
            System.out.println("Enter Your Second Number:- ");
            int num2 = sc.nextInt();
            
            if(num1 > num2){
                System.out.println(num1 + " Is greater than " + num2);
            }else if(num1 == num2){
                System.out.println(num1 + " and " + num2 + " are equal");
            }else{
                System.out.println(num2 + " Is greater than " + num1);
            }
        }
        
}