import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // SumNum();
        //5PrimeNum();
        Calculator();

    }
    // Вычислить сумма чисел от 1 до n

    private static void SumNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N : ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;

        }
        System.out.println("Сумма всех чисел от 1 до " + n + " равнв " + sum);

    }

    // Вывести все простые числа от 1 до 1000
    private static void PrimeNum() {
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " Является простым");
            }
        }

    }

    // Реализовать простой калькулятор
    private static void Calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводим число: ");
        double num_1 = scanner.nextDouble();

        System.out.println("Введите желаемое действие: ");
        char operator = scanner.next().charAt(0);

        System.out.println("Вводим число: ");
        double num_2 = scanner.nextDouble();

        double res = 0.0;

        switch (operator) {
            case '+':
                res = num_1 + num_2;
                break;
            case '-':
                res = num_1 - num_2;
                break;
            case '*':
                res = num_1 * num_2;
                break;
            case '/':
                res = num_1 / num_2;
                break;
            default:
                System.out.println("Error!");
                return;
        }
        System.out.println("Результат наших действий " + res);

    }
}
