package pkg10_arrays_basic;
import java.util.*;

public class Main{
    public static void main(String[] args){
       int[] myarr = {5,3,10,1,2};
       
       for(int a = 0; a < myarr.length; a++){
           for(int b = a + 1; b < myarr.length; b++){
               if(myarr[a] < myarr[b]){
                   int temp = myarr[a];
                   myarr[a] = myarr[b];
                   myarr[b] = temp;
               }
           }
       }
       
       for(int a = 0; a < myarr.length; a++){
           System.out.print(myarr[a] + ", ");
       }
    }
}