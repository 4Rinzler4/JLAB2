public class lab2_2b {
    public static void main(String[] args) {
        int start = 20;
        int end = 30;
        int sum = 0;
        int num = start;

        while (num <= end) {
            if (num % 2 != 0) {
                sum += num * num;
            }
            num++;
        }

        System.out.println("Сума квадратів непарних чисел у діапазоні [" + start + "; " + end + "]: " + sum);
    }
}
