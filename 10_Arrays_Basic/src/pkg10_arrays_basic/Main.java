package pkg10_arrays_basic;
import java.util.*;

public class Main{
    public static void main(String[] args){
//        Find The Second Largest Number in Array
            
        int[] myarr = {6,3,10,2,9};
        
        int value = myarr[0];
        for(int a = 0; a < myarr.length; a++){
            if(value < myarr[a]){
                value = myarr[a];
            }
        }
        
        System.out.println(value);
        
    }
}