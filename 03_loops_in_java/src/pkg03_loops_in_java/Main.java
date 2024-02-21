package pkg03_loops_in_java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
//      FOR LOOP SYNTEX Code:-
//        for(int count = 0; count < 3; count = count +1){
//            System.out.println("Hello World " + count);
//        }

//      PRINT COUNTING FROM ONE TO TEN
//            for(int count = 0; count < 11; count++){
//                System.out.println(count);
//            }

//        WHILE LOOP SYNTEX 
//            int a = 0; //Initialisation
//            while(a<10){ //Condition Check
//                System.out.println(a);
//                a = a + 1; // Updatation
//            }

//        DO WHILE SYNTEX
//            int a = 0;
//            do{
//                System.out.println(a);
//                a =  a + 1;
//            }while(a <5);

    
    
//        PRINT THE SUM OF FIRST N NATURAL NUMBERS
//            Scanner sc = new Scanner(System.in);
//            
//            System.out.println("Please Enter a number:- ");
//            int userinp = sc.nextInt();
//            
//            int ans = 0;
//            for(int start = 1; start <= userinp; start++){
//                ans = ans + start;
//            }
//            
//            System.out.println("Your Sum value is:- " + ans);
        
//        PRINT THE TABLE OF A NUMBER INPUT BY USER
//            Scanner sc = new Scanner(System.in);
//            
//            System.out.println("Please Enter the number you want to table for:- ");
//            int tableinp = sc.nextInt();
//            
//            for(int a = 1; a<=10; a++){
//                System.out.println(tableinp + " * " + a + " = " + tableinp*a);
//            }

//        PRINT ALL EVEN NUMBERS UNTIL N
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Please Enter the number you want to prime numbers:- ");
//            int checknum = sc.nextInt();
//            
//            int all = 0;
//            for(int a = 0; a <= checknum; a++){
//                if(a % 2 == 0){
//                    all = all +1;
//                }
//            }
//            
//            System.out.println(all);

            Scanner sc = new Scanner(System.in);
            System.out.print("Please Enter a number. we will check the number prime or not:- ");
            int userinp = sc.nextInt();
            
            boolean isPrime = true;
            
            for(int a = 2; a<userinp; a++){
                if(userinp % 2 == 0){
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not prime");
            }
            
    
    
    }
    
}
