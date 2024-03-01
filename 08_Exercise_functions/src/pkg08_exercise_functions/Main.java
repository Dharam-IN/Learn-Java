
package pkg08_exercise_functions;

import java.util.*;

public class Main {
    
//    QUESTION:- Write a function to print the sum of all odd numbers from 1 to n.
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//       
//        System.out.println("Please Enter a number");
//        int n = sc.nextInt();
//        int store = 0;
//        for(int a = 1; a <= n; a++){
//            if(a%2 == 0){
//                continue;
//            }else{
//                store = store + a;
//            }
//        }
//        
//        System.out.println(store);
//        
//    }
    
    
//    QUESTION:- Write a function which takes in 2 numbers and returns the greater of those two.
    
//    public static void greaterfun(int first, int second){
//        if(first > second){
//            System.out.println(first + " Is Greather than " + second);
//        }else if(second > first){
//            System.out.println(second + " Is Greather than " + first);
//        }else{
//            System.out.println("Please Enter valid Numbers");
//        }
//    }
//    
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Please Enter a first Number:- ");
//        int first = sc.nextInt();
//        System.out.println("Please Enter a second Number:- ");
//        int second = sc.nextInt();
//        
//        greaterfun(first, second);
//        
//    }
    
    
//    QUESTION:- Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    
//    public static void adultcheck(int age){
//        if(age >= 18){
//            System.out.println("You are eligible for vote");
//        }else{
//            System.out.println("You are not eligible for vote");
//        }
//    }
//    
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter Your Age:- ");
//        int age = sc.nextInt();
//        
//        adultcheck(age);
//    }
    
    
//    QUESTION:- Write an infinite loop using do while condition.
    
    public static void main(String[] args){
        int a = 1;
        
        do{
            System.out.println(a);
            a++;
        }while(a <= 10);
    }
    
}
