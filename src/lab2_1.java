import java.util.InputMismatchException;
import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            double x = 0, y = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Введіть значення x: ");
                    x = scanner.nextDouble();
                    System.out.print("Введіть значення y: ");
                    y = scanner.nextDouble();

                    if (isValidInput(x, y)) {
                        validInput = true;
                    } else {
                        System.out.println("Увага: Для заданих значень x та y вираз виконується ділення на 0 або отримання невизначеного результату. Спробуйте інші значення.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Помилка: Введені значення повинні бути числами.");
                    scanner.nextLine();
                }
            }
            double result = calculateFunction(x, y);
            System.out.printf("Значення функції a: %.2f%n", result);

            System.out.print("Бажаєте продовжити роботу (так/ні)? ");
            String choice = scanner.next();
            continueProgram = choice.equalsIgnoreCase("так");
        }
        scanner.close();
    }

    public static boolean isValidInput(double x, double y) {
        return x != 0 && x != -2 && Math.exp(-x) != 2 && !Double.isNaN(y);
    }

    public static double calculateFunction(double x, double y) {
        double a = (1 + y) * (((x + (y / (Math.pow(x, 2) + 4))) / (Math.exp(-x) - 2)) + (1 / (Math.pow(x, 2) + 4)));
        return a;
    }
}
