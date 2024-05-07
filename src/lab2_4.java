public class lab2_4 {
    public static void main(String[] args) {
        double a = -Math.PI / 2;
        double b = Math.PI / 2;
        double dx = Math.PI / 30;
        double x = a;
        double y;

        System.out.println("  x     |  f(x) ");
        System.out.println("--------|--------");

        while (x <= b) {
            if (x == 1) {
                System.out.printf("%7.2f | Невизначено%n", x);
            } else {
                y = Math.sin(x) / x;
                System.out.printf("%7.2f | %7.2f%n", x, y);
            }
            x += dx;
        }

        System.out.println("  x     |  f(x) ");
        System.out.println("-----------------");

        x = a;
        do {
            if (x == 2) {
                System.out.printf("%7.2f | Невизначено%n", x);
            } else {
                y = Math.sin(x) / x;
                System.out.printf("%7.2f | %7.2f%n", x, y);
            }
            x += dx;
        } while (x <= b);
    }
}
