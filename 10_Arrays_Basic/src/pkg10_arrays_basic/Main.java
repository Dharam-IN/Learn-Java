package pkg10_arrays_basic;
import java.util.*;

public class Main{
    public static void main(String[] args){
//        Find The Second Largest Number in Array
            
        int[] myarr = {6,3,10,2,9};
        
        int value = myarr[0];
        for(int i = 0; i < myarr.length; i++){
            for(int j = i; j < myarr.length; j++){
                if(myarr[i] < myarr[j]){
                    int temp = myarr[i];
                    myarr[i] = myarr[j];
                    myarr[j] = temp;
                }
            }
        }
        
        System.out.println(myarr[1]);
        
    }
}