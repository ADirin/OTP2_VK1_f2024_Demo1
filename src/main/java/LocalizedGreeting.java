import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocalizedGreeting {

    public static void main(String[] args) {
        System.out.println("Select a Language");
        System.out.println("1. English");
        System.out.println("2. Spanish");
        System.out.println("3. French");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        Locale locale;
        switch (choice) {
            case 1:
                locale = new Locale("en", "US");
                break;
            case 2:
                locale = new Locale("es", "ES");
                break;
            case 3:
                locale = new Locale("fr", "FR");
                break;
            default:
                System.out.println("Invalid Choice");
                locale = new Locale("en", "US");
                break;

        }
        ResourceBundle messages = ResourceBundle.getBundle("Messages", locale);
        System.out.println(messages.getString("greeting"));
        sc.close();
    }
}
