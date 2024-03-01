
package pkg07_functions;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number:- ");
        int num = sc.nextInt();
        
        int store = 1;
        for(int fac = num; fac >= 1; fac--){
            store = store * fac;
        }
        
        System.out.println(store);
    }
    
}
