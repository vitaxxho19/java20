import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        System.out.print(a);
        scanner.close();
    }
}
