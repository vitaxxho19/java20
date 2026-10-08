import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        double average = (double) sum / n;

        System.out.println("Сумма: " + sum);
        System.out.print("Среднее: " + average);

        scanner.close();
    }
}
