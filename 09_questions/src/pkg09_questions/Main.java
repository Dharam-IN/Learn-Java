package pkg09_questions;

import java.util.*;

public class Main{
//    Enter 3 numbers from the user & make a function to print their average.
    public static void main(String args[]){
        average();
    }
    
    public static void average(){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter User 1 Number:- ");
        int a = sc.nextInt();
        System.out.println("Enter User 2 Number:- ");
        int b = sc.nextInt();
        System.out.println("Enter User 3 Number:- ");
        int c = sc.nextInt();
        
        double average = (a + b + c) / 3.0;
        
        
        System.out.println("Average of " + a + " " + b + " " + c + " is " + average);
        System.out.println(average);
    }
}