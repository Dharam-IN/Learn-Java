package pkg10_arrays_basic;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Array Row size:- ");
        int row = sc.nextInt();
        System.out.println("Enter Array Column size:- ");
        int col = sc.nextInt();
        
        int[][] numbers = new int[row][col];
        
        System.out.println("Enter Array Values:- ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Your matrix(2D) Array");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(numbers[i][j] + ", ");
            }
            System.out.println();
        }
        
        int temp = numbers[0][0];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(temp < numbers[i][j]){
                    temp = numbers[i][j];
                }
            }
        }
        
        System.out.println("Maximum Number in this Array is " +  temp);
    }
}


