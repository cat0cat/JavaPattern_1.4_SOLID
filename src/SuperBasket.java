public class SuperBasket extends Basket implements IBasket{

    //SOLID. Open Closed Principle - имплементируя интерфейс, добавляем классу функциональности, не изменяя его код
    public void print() {
        int sumProducts = 0; //итоговая сумма чека
        System.out.println("Ваша корзина:");
        System.out.println("Наименование товара  Количество  Цена/за.ед  Общая стоимость");
        for (Product product : basketList) {
            if (product.getCount() !=0)  {
                sumProducts += product.getCount() * product.getPrice();
                System.out.printf("%-15s %6d %12d %12d \n", product.getName(),
                        product.getCount(), product.getPrice(), product.getCount() * product.getPrice());

            }
        }
        System.out.printf("%40s %7d \n","Итого: ", sumProducts);
    }

    public void message() {
        System.out.println("Корзина грустит, в ней пусто...");
    }
}
