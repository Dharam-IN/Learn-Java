package pkg09_questions;

import java.util.*;

public class Main{
    
//    PALINDROME NUMBER
    
    public static void main(String args[]){
        int num = 121;
        int originalnum = num;
        int store;
        int check = 0;
        while(num > 0){
            store = num % 10;
            check = check * 10 + store;
            num = num / 10;
        }
        
        if(originalnum == check){
            System.out.println(originalnum + " Is a Palindrome number");
        }else{
            System.out.println(originalnum + " Is not a Palindrome number");
        }
        
    }
}