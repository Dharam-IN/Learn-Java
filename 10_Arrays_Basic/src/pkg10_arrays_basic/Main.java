package pkg10_arrays_basic;
import java.util.*;

public class Main{
    public static void main(String[] args){
//        int[] myarr = {1,1,2,2,3,4,3};
//        int sum = 7;
//        boolean find = false;
//        for(int i = 0; i < myarr.length; i++){
//            for(int j = 0; j < myarr.length; j++){
//                if(myarr[i] + myarr[j] == sum){
//                    System.out.println(myarr[i] + " " + myarr[j]);
//                    find = true;
//                }
//            }
//            if(find){
//                break;
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Row and Column size:- ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] myarr = new int[row][col];
        
        int max = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                myarr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Your 2D Array:- ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(myarr[i][j]);
            }
            System.out.println();
        }
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(max < myarr[i][j]){
                    max = myarr[i][j];
                }
            }
        }
        
        System.out.println(max);
    }
}