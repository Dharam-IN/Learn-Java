package pkg09_questions;
import java.util.*;

public class Main{
     public static void main(String[] args){
         int n = 5;
         int m = 5;
         
         for(int i = n; i >= 1; i--){
             for(int j = 1; j <= i; j++){
                 System.out.print(" * ");
             }
             System.out.println();
         }
     }
}