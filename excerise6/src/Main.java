import java.util.Scanner;

class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
                System.out.println("It is an integer!");
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }

        }

        return userInt;
    }

    public double promptDouble(String message)  {
        System.out.println(message);
        String userInput = scanner.nextLine();
        double userDouble = 0.0;
        boolean isDouble = false;
        while(!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
                System.out.println("It is a double!");

            }
            catch(NumberFormatException e) {
                System.out.println("This is not a double!" + message);
                userInput = scanner.nextLine();
            }
        }

        return userDouble;
    }

    public String promptString(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();
        String userString = "";
        boolean isString = false;

        while(!isString) {
            try {
                int a = Integer.parseInt(userInput);
                double b = Double.parseDouble(userInput);
                System.out.println("Invalid try again! " + message);
                userInput = scanner.nextLine();
            }
            catch (NumberFormatException e) {
                userString = userInput;
                isString = true;
                System.out.println("It is a string!!");

            }

        }
        return userString;
    }




}


public class Main {
    public static void main(String[] args) {
        boolean isTrue = true;
        while(isTrue) {
            UserInput input = new UserInput();
            int aNumber = input.promptInt("Enter an integer.");
            double newNum = input.promptDouble("Enter a double");
            String newString = input.promptString("Enter a string");
            System.out.println("THANKS!");
            isTrue = false;

        }

    }
}