package pkg04_day_loops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int table = 2;
        
//        FOR LOOP SYNTAX
    //        for(int a = 1; a < 11; a = a + 1){
    //            System.out.println(table * a);
    //        }
    
//        WHILE LOOP SYNTAX
//            int a = 1;
//            while(a < 11){
//                System.out.println(table * a);
//                a = a + 1;
//            }

//        DO WHILE LOOP
//            int i = 1;
//            do{
//                System.out.println(table * i);
//                i = i + 1;
//            }while(i < 11);

//        QUESTION: PRINT THE SUM OF FIRST N NUTURAL NUMBERS
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Please Enter a number you want to some");
    //        int num = sc.nextInt();
    //        
    //        int sum = 0;
    //        for(int i = 0; i <= num; i++){
    //            sum = sum + i;
    //        }
    //        
    //        System.out.println("The Sum of: " + sum);
        

//        QUESTION: PRINT THE TABLE OF A NUMBER INPUT BY THE USER
//            System.out.println("Please Enter those number you want to table: ");
//            Scanner sc = new Scanner(System.in);
//            
//            int num = sc.nextInt();
//            System.out.println("Here is Your Table: ");
//
//            for(int i = 1; i <= 10; i++){
//                System.out.println(num * i);
//            }

//        QUESTION: PRINT ALL EVEN NUMBERS TILL N
//            Scanner sc = new Scanner(System.in);
//            
//            int num = sc.nextInt();
//            
//            for(int i = 0; i <= num; i++){
//                if(i % 2 == 0){
//                    System.out.println(i);
//                }
//            }

//        for(; ;) {
//            System.out.println("Apna College");
//        }

//        QUESTION
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter choose a number between 0 to 1. 0 for nothing 1 for something fun");
            int num = sc.nextInt();
            
            if(num == 1){
                System.out.println("Please Enter your 10th Marks");
                int marks = sc.nextInt();
                
                if(num >= 0 & num <= 59){
                    System.out.println("Tu life me kuch nhi ukhad payega");
                }else if(num >= 60 & num <= 89){
                    System.out.println("Kya fayda ese number lake");
                }else if(num >= 90 & num <= 100){
                    System.out.println("Kya ukhada?");
                }else{
                    System.out.println("Tu thoda sa bkl hai kya shi choose kar na");
                }
            }
            

    }
    
}
