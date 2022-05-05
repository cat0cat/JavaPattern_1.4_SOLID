
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //SOLID. Liskov substitution principle - наследники класса Product полностью играют роль предка
        Product[] products = {new Milk(), new Sugar(), new Flour()};
        //DRY - повторяющийся вывод списка продуктов на экран выносим в отдельный метод

        printProducts(products);
        SuperBasket basket = new SuperBasket();


        while (true) {
            System.out.println("Выберите действие:\n" +
                    "1. Возможные товары для покупки\n" +
                    "2. Добавить в корзину\n" +
                    "3. Удалить из корзины\n" +
                    "4. Очистить корзину\n" +
                    "5. Показать корзину\n" +
                    "0. Выход");
            String input = scanner.nextLine();
            if ("0".equals(input)) {
                System.out.println("Программа завершена!");
                break;
            }
            int operation = Integer.parseInt(input);

            switch (operation) {
                case 1:
                    printProducts(products);
                    basket.message();
                    break;
                case 2:
                    System.out.println("Введите номер товара, который требуется добавить и количество:");
                    String input1 = scanner.nextLine();
                    String[] parts = input1.split(" ");
                    int productNumber = Integer.parseInt(parts[0]) - 1;   //номер продукта
                    products[productNumber].addCount(Integer.parseInt(parts[1])); //количество продукта
                    basket.addProduct(products[productNumber]);
                    basket.print();
                    break;
                case 3:
                    basket.print();
                    System.out.println("Введите номер товара, который требуется удалить:");
                    String input2 = scanner.nextLine();
                    int productNumber2 = Integer.parseInt(input2);   //номер продукта
                    basket.removeProduct(products[productNumber2]);
                    basket.print();
                    break;
                case 4:
                    basket.clear();
                    System.out.println("Корзина пуста");
                    basket.print();
                    basket.message();
                    break;
                case 5:
                    basket.print();
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        scanner.close();
    }

    //DRY - повторяющийся вывод списка продуктов на экран выносим в отдельный метод
    public static void printProducts(Product[] products) {
        System.out.println("Список возможных товаров для покупки");
        // Magic - вместо числа используем products.length
        for (int i = 0; i < products.length; i++) {
            System.out.println(i+1 + ". " + products[i] + " " + products[i].getPrice());
        }
    }


}