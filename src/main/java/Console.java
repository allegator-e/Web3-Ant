import java.io.IOException;
import java.util.Scanner;

public class Console {
    private static String userCommand = "";
    private static final Scanner commandReader = new Scanner(System.in);
    private static final ManagerCommand manager = new ManagerCommand();

    public static void main(String[] args) throws IOException {
        while (!userCommand.equals("exit")) {
            System.out.print(">> ");
            userCommand = commandReader.nextLine().trim();

            switch (userCommand) {
                case "":
                case "exit":
                    break;
                case "help":
                    manager.help();
                    break;
                case "show":
                    manager.show();
                    break;
                case "insert":
                    double x = (Double)input("x", "double");
                    double y = (Double)input("y", "double");
                    double r = (Double)input("r", "double");
                    manager.insert(x, y, r);
                    break;
                case "delete":
                    int index = (Integer)input("id", "int");
                    manager.delete(index);
                    break;
                case "clear":
                    manager.clear();
                    break;
                default:
                    System.out.println("Неопознанная команда. Наберите 'help' для справки.");
            }
        }
    }

    private static Number input(String message, String type) {
        while (true) {
            try {
                System.out.print(message + ": ");
                if (type.equals("int")) {
                    return Integer.parseInt(commandReader.nextLine());
                } else if (type.equals("double")) {
                    return Double.parseDouble(commandReader.nextLine());
                }
            } catch (NumberFormatException e) {
                System.out.println("\nНеобходимо ввести значение типа " + type);
            }
        }
    }

}
