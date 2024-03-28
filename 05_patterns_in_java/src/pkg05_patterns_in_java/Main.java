package pkg05_patterns_in_java;

public class Main{
    public static void main(String args[]){
        for(int a = 1; a <= 5; a++){
            for(int b = 1; b <= a; b++){
                System.out.print("*"+ " ");
            }
            System.out.print("\n");
        }
    }
}
