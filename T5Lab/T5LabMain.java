import java.util.Scanner;

public class T5LabMain {
    public static void main(String[] args) {
        int p = 10;
        int q = 13;
        boolean w = true;
        
        if (p > 8 || q < 10) {
          int sum = p + q;
          System.out.println("Sum is: " + sum);
        }
        
        if (q == 13) {
          System.out.println("q is a 13!");
        }
        
        if (!(p < 8)) {
          System.out.println("p is NOT < 8!");
        }
        
        if (!(q + p > 25)) {
          int sum = p + q;
          System.out.println("sum NOT > 25!");
        }
        
        if (w) {
          System.out.println("w is true!");
        }        
    }
}