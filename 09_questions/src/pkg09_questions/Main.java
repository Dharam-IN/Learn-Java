package pkg09_questions;

import java.util.*;

public class Main{
//    Sum Of Odd numbers from 1 to N
    public static void main(String args[]){
        sumodd();
    }
    
    public static void sumodd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any number to find sum of odd numbers from 1 to n");
        int num = sc.nextInt();
        int store = 0;
        for(int a = 1; a <= num; a++){
            if(a % 2 != 0){
                store = store + a;
            }
        }
        
        System.out.println(store);
        
    }
}