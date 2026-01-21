package Loops;

public class Break {
    static public void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            
            if (i == 6) {
                break;
            }
            System.out.println(i);
            System.out.println("Loop is running");
        }
        System.out.println("Loop is terminated.");
    }
}
