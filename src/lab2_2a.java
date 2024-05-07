public class lab2_2a {
    public static void main(String[] args) {
        int start = 20;
        int end = 30;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i * i;
            }
        }

        System.out.println("Сума квадратів непарних чисел у діапазоні [" + start + "; " + end + "]: " + sum);
    }
}

