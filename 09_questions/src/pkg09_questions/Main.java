package pkg09_questions;
import java.util.*;

public class Main{
//    Write a program using switch case  through which we can find the area of circle, squere, rectangle and triangle;
    
    public static void main(String[] args){
        areafun();
    }
    
    public static void areafun(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Area of Squere \n2. Area of Circle \n3. Area of Rectangle \n4. Area of Triangle \nMake your choice:- \n");
        
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Enter side of Squere:- ");
                int squereSide = sc.nextInt();
                
                double first = squereSide * squereSide;
                
                System.out.println(first + "M^2");
                break;
            case 2:
                System.out.println("Enter Circle radius:- ");
                int circleRadius = sc.nextInt();
                
                double second = 3.14 * (circleRadius * circleRadius);
                
                System.out.println(second + "M^2");
                break;
            
            case 3:
                System.out.println("Enter Rectangle Length:- ");
                int rectangleLength = sc.nextInt();
                
                System.out.println("Enter Rectangle Breadth:- ");
                int rectangleBreadth = sc.nextInt();
                
                double third = rectangleLength * rectangleBreadth;
                
                System.out.println(third + "M^2");
                break;
            
            case 4:
                System.out.println("Enter Triangle Height:- ");
                int triangleHeight = sc.nextInt();
                
                System.out.println("Enter Triangle Breadth:- ");
                int triangleBreadth = sc.nextInt();
                
                double fourth = 0.5 * triangleHeight * triangleBreadth;
                
                System.out.println(fourth + "M^2");
        }
    }
}