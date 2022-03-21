import java.util.Arrays;

public class Project2_3 {

    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};  
        int sum = 0;  
        
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
          
        }  
       arr[15] = sum;
        arr[16] = sum/18;
        
        for(int element: arr) {
        System.out.println(element );
        }
       
    }  
}