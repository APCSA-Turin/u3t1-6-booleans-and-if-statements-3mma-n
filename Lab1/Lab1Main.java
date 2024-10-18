import java.util.Scanner;

public class Lab1Main {
   public static void main(String[] args) {

    // Tell the user to enter a question
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Magic 8 Ball!");
    System.out.print("Enter a yes-no question and I will answer it: ");
    String question = scan.nextLine();
    int answer = (int) (Math.random() * 6) + 1;
    String str = "";
    if (answer == 1) {
        str = "Like- I think so?";
    }
    if (answer == 2) {
        str = "Erm- don't think so.";
    }
    if (answer == 3) {
        str = "Like- I'm feeling indeceisive rn, ask again later :P";
    }
    if (answer == 4) {
        str = "YES GIRL OF COURSE";
    }
    if (answer == 5) {
        str = "LITERALLY NO WAY LMAOOO";
    }
    if (answer == 6) {
        str = "That's a fun thought you had but um- no.";
    }
    System.out.println(str);
   }
}
