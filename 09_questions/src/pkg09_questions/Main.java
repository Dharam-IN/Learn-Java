package pkg09_questions;
import java.util.*;

public class Main{
     public static void main(String[] args){
         int num1 = 30;
         int num2 = 42;
         
         int GCD = 1;
         
         for(int a = 1; a <= num1; a++){
             if(num1 % a == 0 && num2 % a == 0){
                 GCD = a;
             }
         }
         
         System.out.println(GCD);
         
     }
}