public class Flour extends Product implements IEatAfter{
    //SOLID. Single Responsibility Principle - класс Flour описывает только один продукт
    private final String name = "Мука";
    private final int price = 81;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void cook() {
        System.out.println("Сначала приготовить");
    }
}