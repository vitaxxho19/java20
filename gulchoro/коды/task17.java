import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int mainDiagonalSum = 0;
        int sideDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
            sideDiagonalSum += matrix[i][n - 1 - i];
        }

        System.out.println("Главная: " + mainDiagonalSum);
        System.out.print("Побочная: " + sideDiagonalSum);

        scanner.close();
    }
}
