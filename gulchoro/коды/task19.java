import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        int maxRow = 1;
        int maxCol = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int current = scanner.nextInt();
                if (current > max) {
                    max = current;
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }

        System.out.println("Максимум: " + max);
        System.out.print("Строка: " + maxRow + ", столбец: " + maxCol);

        scanner.close();
    }
}
