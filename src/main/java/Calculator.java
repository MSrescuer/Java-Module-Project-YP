import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    double totalPrice;
    ArrayList<Product> product;

    public Calculator() {
        product = new ArrayList<>();
    }

    public void add() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите товар:");
            String productInput = scanner.next();
            while (true) {
                Scanner scanPrice = new Scanner(System.in);
                System.out.println("Введите цену:");
                double priceInput = 0;
                if (scanPrice.hasNextDouble()) {
                    priceInput = scanPrice.nextDouble();
                    if (priceInput < 0) {
                        System.out.println("Цена не может быть меньше ноля");
                    } else {
                        System.out.println("Товар добавлен");
                        product.add(new Product(productInput, priceInput));
                        totalPrice += priceInput;
                        break;
                    }
                } else {
                    System.out.println("Ошибка ввода, нужны цифры");
                }
            }
            System.out.println("Хотите добавить еще товар?");
            System.out.println("Введите Завершить для подсчёта, или любой символ что-бы добавить еще товар");
            String end = scanner.next();
            if (end.equalsIgnoreCase("Завершить") || productInput.equalsIgnoreCase("Завершить")) {
                System.out.println("Рассчёт завершён.");
                break;
            }
        }
    }

    public void print(int people) {
        Formatter formatter = new Formatter();

        System.out.println("Добавленные товары");
        for (int i = 0; i < product.size(); i++) {

            System.out.println(product.get(i).name);
        }
        double summa = totalPrice / people;
        System.out.println("Общая сумма: " + String.format("%.2f", totalPrice) + " " + formatter.formatter(totalPrice));
        System.out.println("Каждый должен: " + String.format("%.2f", summa) + " " + formatter.formatter(summa));
    }
}


