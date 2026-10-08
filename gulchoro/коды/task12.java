import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        int replacements = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < 0) {
                array[i] = 0;
                replacements++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Заменено: " + replacements);

        scanner.close();
    }
}
