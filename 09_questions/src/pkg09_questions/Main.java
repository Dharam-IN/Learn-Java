package pkg09_questions;
import java.util.*;

public class Main{
    public static void main(String[] args){
        radius();
    }
    
    public static void radius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius value:- ");
        int radius = sc.nextInt();
        
        double circumference = 2 * 3.14 * radius;
        
        System.out.println(circumference);
    }
}