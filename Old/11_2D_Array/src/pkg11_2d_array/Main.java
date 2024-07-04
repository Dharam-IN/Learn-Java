package pkg11_2d_array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter Size of Columns");
        int column = sc.nextInt();
        
        int[][] numbers = new int[rows][column];
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < column; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your Matrix");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < column; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("What do you want to find:- ");
        int x = sc.nextInt();
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < column; j++){
                if(x == numbers[i][j]){
                    System.out.println("Indices of x is: (" + i + ", " + j + ")");
                }
            }
        }
        
    }
    
}
