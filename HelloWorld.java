import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = s.nextLine();
        System.out.println("Hello, " + name + "!");
        s.close();
    }
}
