import java.io.InvalidClassException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please tell me your name");
        String name = scan.nextLine();
        //System.out.println(name);
        if (name.equals("Alice")) {
            System.out.println("Hello " + name + "!");
        } else if (name.equals("alice")) {
            System.out.println("Hello " + name + "!");
        } else if (name.equals("Bob")) {
            System.out.println("Hello " + name + "!");
        } else if (name.equals("bob")) {
            System.out.println("Hello " + name + "!");
        } else {
            System.out.println("Stranger danger!");
        }
    }
}