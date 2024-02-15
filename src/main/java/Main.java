import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        while (true) {
            System.out.println("На скольких человек разделить счёт?");
            int people = scanner.nextInt();
            if (people == 1) {
                System.out.println("Вы один, радуйтесь!");
            } else if (people < 1) {
                System.out.println("Некорректное значение");
            } else {
                System.out.println("Ого сколько у вас друзей, сейчас посчитаю!");
                calc.add();
                calc.print(people);
                break;
            }
        }
    }
}