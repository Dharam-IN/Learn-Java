package second.day;

import java.util.*;

public class SecondDay {
    public static void main(String[] args){
//        Message Code:-
//            System.out.println("Welcome Back Dharam");
          
//        Input Get By User Code:-
//            System.out.println("Please Enter Your Name:- ");
//            Scanner sc = new Scanner(System.in);
//            String name = sc.next();
//            System.out.println("Your Name is:- " + name);

//        Sum Two Values
            
//            System.out.println("Please Enter Two Numbers:- ");
//            Scanner sc = new Scanner(System.in);
//            
//            int num1 = sc.nextInt();
//            int num2 = sc.nextInt();
//            int sum = num1 + num2;
//            
//            System.out.println(sum);

//        Conditions Code:-
             
//             Scanner sc = new Scanner(System.in);
//             
//             System.out.println("Please Enter Your age:- ");
//             int age = sc.nextInt();
//             
//             if(age >= 18){
//                 System.out.println("You Are Adult");
//             }else{
//                 System.out.println("You Are Not Adult");
//             }

//         Odd And Even Number Find Code:-
             
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Please Enter a number:- ");
//             int val = sc.nextInt();
//             
//             if(val % 2 == 0){
//                 System.out.println(val + " Is Even Number");
//             }else{
//                 System.out.println(val + " Is Odd Number");
//             }


//         VALUE CHECK CODE:-
//             Scanner sc = new Scanner(System.in);
//             
//             System.out.print("Please Enter First A Number:- \n");
//             int a = sc.nextInt();
//             
//             System.out.print("Please Enter Second B Number:- \n");
//             int b = sc.nextInt();
//             
//             if(a == b){
//                 System.out.print("A is Equal to B \n");
//             }else if(a > b){
//                 System.out.print("A Is grether B \n");
//             }else{
//                 System.out.print("B is Grether A \n");
//             }

//         SWITCH CASE IN JAVA
//             Scanner sc = new Scanner(System.in);
//             int button = sc.nextInt();
//             
//             switch(button){
//                 case 1:
//                     System.out.println("Hello");
//                     break;
//                 case 2:
//                     System.out.println("Namaste");
//                     break;
//                 case 3:
//                     System.out.println("India");
//                 default:
//                     System.out.println("Default Value");
//             }


//         TASKS
             Scanner sc = new Scanner(System.in);
             System.out.print("Please Enter a First Number for Calculate:- \n");
             int a = sc.nextInt();
             System.out.print("Please Enter a Second Number for Calculate:- \n");
             int b = sc.nextInt();
             System.out.print("Please Select a Number for Operator like:- \n1 for + \n2 for - \n3 for * \n4 for - \n5 for % \n");
             int operator = sc.nextInt();
             
             if(operator == 1){
                 System.out.println(a+b);
             }else if(operator == 2){
                 System.out.println(a-b);
             }else if(operator == 3){
                 System.out.println(a*b);
             }else if(operator == 4){
                 System.out.println(a/b);
             }else if(operator == 5){
                 System.out.println(a%b);
             }else{
                 System.out.println("Please Enter valid number:- ");
             }

    }
}
