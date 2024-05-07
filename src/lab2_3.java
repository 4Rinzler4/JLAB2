public class lab2_3{
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 2; i <= 7; i++) {
            int product = 1;
            for (int j = 1; j <= i; j++) {
                product *= i / j;
            }
            sum += (i - 1) * product;
        }

        System.out.println("Результат обчислення виразу: " + sum);
    }
}
