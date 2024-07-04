package pkg12_bubble_sort;
public class Main {
    public static void main(String[] args) {
        int[] myarr = {7,8,3,1,2};
        
        for(int i = 0; i < myarr.length - 1; i++){
            for(int j = 0; j < myarr.length - i -1; j++){
                if(myarr[j] > myarr[j+1]){
                    int temp = myarr[j];
                    myarr[j] = myarr[j+1];
                    myarr[j+1] = temp;
                }
            }
        }
        
        for(int i = 0; i < myarr.length; i++){
            System.out.print(myarr[i]);
        }
    }
    
}
