package pkg04_patterns_in_java;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
//        BASIC PATTERN
//        for(int a = 0; a<4; a++){
//            for(int b = 0; b<5; b++){
//                System.out.print(" * ");
//            }
//            System.out.print("\n");
//        }

//        HOLLOW RECTANGLE PATTERN
            for(int row = 1; row <=4; row++){
                for(int col = 1; col <= 5; col++){
                    if(row == 1 || col == 1 || row == 4 || col == 5){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
                
        }
    }
