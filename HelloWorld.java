import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class HelloWorld {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = s.nextLine();
        System.out.println("Hello, " + name + "!");
        s.close();
        File f = new File("Class.txt");
        s = new Scanner(f);
        String course = s.nextLine();
        System.out.println("Welcome to " + course + "!");
        s.close();
    }
}
