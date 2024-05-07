public class lab2_2c {
    public static void main(String[] args) {
        int start = 20;
        int end = 30;
        int sum = 0;
        int num = start;

        do {
            if (num % 2 != 0) {
                sum += num * num;
            }
            num++;
        } while (num <= end);

        System.out.println("Сума квадратів непарних чисел у діапазоні [" + start + "; " + end + "]: " + sum);
    }
}
