package pkg10_arrays_basic;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Find Largest Number from array

        Scanner sc = new Scanner(System.in);
        System.out.println("Entet number you want to array size");
        int size = sc.nextInt();
        
        int[] myarr = new int[size];
        
        System.out.println("Enter any value in our array");
        for(int a = 0; a < myarr.length; a++){
            myarr[a] = sc.nextInt();
        }
        
        System.out.println("Your Numbers");
        for(int a = 0; a < myarr.length; a++){
            System.out.println(myarr[a]);
        }
        
        int largeNo = 0;
        for(int a = 0; a < myarr.length; a++){
            if(largeNo < myarr[a]){
                largeNo = myarr[a];
            }
        }
        
        System.out.println("Largest Number is in this Array is:- " + largeNo);
        
        
    }
    
}
