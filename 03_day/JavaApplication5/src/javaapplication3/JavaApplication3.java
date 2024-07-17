package javaapplication3;

import java.util.*;

public class JavaApplication3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        CONDITIONS IN JAVA 


//            AGE 
//                System.out.println("Please Enter Your Age:- ");
//                int age = sc.nextInt();
//
//                if(age > 18){
//                    System.out.println("You are Eligible");
//                }else{
//                    System.out.println("You are not Eligible");
//                }

//            EVEN AND ODD
            
//            System.out.println("Please Enter A Number:- ");
//            int mynumber = sc.nextInt();
//            
//            if(mynumber % 2 == 0){
//                System.out.println("This is Even Number" + mynumber);
//            }else{
//                System.out.println("This is Odd Number" + mynumber);
//            }

            
//            NUMBER CHECK
            
//            System.out.println("Please Enter Your First Number");
//            int a = sc.nextInt();
//            System.out.println("Please Enter Your Second Number");
//            int b = sc.nextInt();
//            
//            if(a == b){
//                System.out.println(a + " and " + b + " Is Equal");
//            }else if(a > b){
//                System.out.println(a + " is Gretherthan " + b);
//            }else if(a < b){
//                System.out.println(a + " is Lessthan " + b);
//            }


//            SWITCH CASE IN JAVA

            System.out.println("Please Choose a Number Between 1 to 3");
            
            int num = sc.nextInt();
            switch(num){
                case 1:
                    System.err.println("Hello");
                    break;
                case 2:
                    System.err.println("Namaste");
                    break;
                case 3:
                    System.err.println("Bonjour");
                    break;
                default:
                    System.out.println("Bhai aap thode se Dimag se mansik ho mene bola hai ki 1 se 3 ke bich me choose karo");
                    break;
            }
            
    }
    
}
