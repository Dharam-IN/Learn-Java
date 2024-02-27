
package pkg06_javafunctions;

import java.util.*;

public class Main {
    
    public static void printMyName(String name){
        System.out.println(name);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Name:- ");
        String names = sc.next();
        
        printMyName(names);
    }
    
}
