public class Sugar extends Product implements IEatNow, IEatAfter{
    //SOLID. Single Responsibility Principle - класс Sugar описывает только один продукт
    //Interface Segregation Principle - применяем разные интерфейсы вместо одного большого
    //Dependency Inversion Principle - разделив интерфейсы мы не зависим от их общей функциональности,
    // мы можем поменять один интерфейс на другой
    private final String name = "Сахар";
    private final int price = 76;

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

    @Override
    public void eat() {
        System.out.println("Можно употреблять сразу");
    }
}