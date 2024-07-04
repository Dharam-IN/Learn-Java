
package pkg06_javafunctions;

import java.util.*;

public class Main {
    
//    CUSTOM FUNCTION
//    public static void printMyName(String name){
//        System.out.println(name);
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter Your Name:- ");
//        String names = sc.next();
//        
//        printMyName(names);
//    }
    
//    CREATE A FUNCTION FOR SUM TO VALUES;
//        public static int calculateSum(int a, int b){
//            int sum = a + b;
//            return sum;
//        }
//        
//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Please Enter Two Values");
//            int a1 = sc.nextInt();
//            int b1 = sc.nextInt();
//            
//            int sum1 = calculateSum(a1, b1);
//            
//            System.out.println(sum1);
//        }
    
//        MAKE A FUNTION TO MULTIPLY 2 NUMBERS
//            public static int multiplyNum(int a, int b){
//                int multi = a * b;
//                
//                return multi;
//            }
//            
//            public static void main(String[] args){
//                Scanner sc = new Scanner(System.in);
//                int a1 = sc.nextInt();
//                int b1 = sc.nextInt();
//                
//                int multi1 = multiplyNum(a1, b1);
//                
//                System.out.println(multi1);
//            }
    
    
//        FIND THE FACTORIAL OF A NUMBER'
    
            public static void factorialNum(int num){
                int fact = 1;
                for(int i = num; i >= 1; i--){
                    fact = fact * i;
                }
                System.out.println(fact);
            }
    
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                
                factorialNum(num);
            }
}
