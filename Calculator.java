import java.util.Scanner ;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        double result = 0;
            if (operation == '+') {
                result = num1 + num2;
            }
            if (operation == '-') {
                result = num1 - num2;
            }
            if (operation == '*') {
                result = num1 * num2;
            }
            if (operation == '/') {
                result = num1 / num2;
            }
        System.out.println("Результат: " + result);
    }
}

