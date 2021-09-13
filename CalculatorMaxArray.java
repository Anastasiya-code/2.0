import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите опцию: 1- калькулятор, 2 - поиск максимального слова в массиве");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Введите первое число:");
            double num1 = scanner.nextDouble();
            System.out.println("Введите второе число:");
            double num2 = scanner.nextDouble();
            System.out.println("Введите операцию:");
            String operation = scanner.next();
            switch (operation) {
                case "+":
                    System.out.printf("%.4f", num1 + num2);
                    break;
                case "-":
                    System.out.printf("%.4f", num1 - num2);
                    break;
                case "*":
                    System.out.printf("%.4f", num1 * num2);
                    break;
                case "/":
                    System.out.printf("%.4f", num1 / num2);
                    break;
            }
        }
        else if (option == 2) {
            System.out.println("Введите размер массива:");
            int size = scanner.nextInt();
            String arrays [] = new String [size];
            System.out.println("Введите слова для массива:");
            for (int i = 0; i < size; i++) {
                arrays [i] = scanner.next();
            }
            int max = 0;
            String maxWord = null;
            for (String array : arrays) {
                int countOfLetters = array.length();
                if (countOfLetters > max) {
                    max = countOfLetters;
                    maxWord = array;
                }
            }
            System.out.println(maxWord);
        }
    }
}