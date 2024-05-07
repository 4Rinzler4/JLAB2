import java.util.Scanner;
public class lab2_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0, y = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Введіть значення x: ");
            x = scanner.nextDouble();
            System.out.print("Введіть значення y: ");
            y = scanner.nextDouble();

            if (x != 0 && x != -2 && Math.exp(-x) != 2) {
                validInput = true;
            } else {
                System.out.println("Увага: Для заданих значень x та y вираз виконується ділення на 0 або отримання невизначеного результату. Спробуйте інші значення.");
            }
        }
        double result = calculateFunction(x, y);
        System.out.printf("Значення функції a: %.2f%n", result);
    }
    public static double calculateFunction(double x, double y) {
        double a = (1 + y) * (((x + (y / (Math.pow(x, 2) + 4))) / (Math.exp(-x) - 2)) + (1 / (Math.pow(x, 2) + 4)));
        return a;
    }
}
