package pkg10_arrays_basic;
import java.util.*;

public class Main{
    public static void main(String[] args){
//        Reverse Array
        
        int[] myarr = {1,2,5,4,6,3,2};
        
        System.out.println("Your Array:- ");
        for(int i = 0; i < myarr.length; i++){
            System.out.print(myarr[i] + ", ");
        }
        
        System.out.println("Reverse Array:-");
        
        int[] newarr = new int[myarr.length];
        
        for(int i = 0; i < myarr.length; i++){
            int temp = myarr.length;
            newarr[i] = myarr[temp - 1 - i];
        }
        
        for(int i = 0; i < newarr.length; i++){
            System.out.print(newarr[i] + ", ");
        }
    }
}


