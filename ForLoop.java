package Loops;
import java.util.*;

public class ForLoop {
    
   
    static public void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number:");
         int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(2*i+1);
        }
        System.out.println("Loop is Completed.");
    }
}