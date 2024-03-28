package pkg09_questions;

import java.util.*;

public class Main{
//     FACTORS
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Any number to get factor:- ");
       int value = sc.nextInt();
       
       System.out.println("Factors of " + value);
       for(int a = 1; a <= value; a++){
           if(value % a == 0){
               System.out.println(a);
           }
       }
    }
}