import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            int sum = 0;

            for (int i = 2; i <= 7; i++) {
                int product = 1;
                for (int j = 1; j <= i; j++) {
                    product *= i / j;
                }
                sum += product;
            }
            System.out.println("Результат обчислення виразу: " + sum);

            System.out.print("Бажаєте продовжити роботу (так/ні)? ");
            String choice = scanner.next();
            continueProgram = choice.equalsIgnoreCase("так");
        }
        scanner.close();
    }
}

