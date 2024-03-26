package pkg09_questions;

import java.util.*;

public class Main{
    public static void main(String args[]){
//        GET FACTOR OF ANY NUMBER
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter any number to find its factor:- ");
            int num = sc.nextInt();
            
            System.out.println("Factors of " + num + "are:");
            
            for(int a = 1; a <= num; a++){
                if(num % a == 0){
                    System.out.println(a);
                }
            }
            
    }
}