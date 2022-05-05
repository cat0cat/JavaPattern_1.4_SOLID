import java.util.*;

public class Basket implements IBasket {

    //SOLID.Single responsibility principle. Корзина выполняет только одну задачу - хранит список товаров.
    protected final List<Product> basketList;

    public Basket() {
        basketList = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        basketList.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        basketList.remove(product);
    }

    @Override
    public void clear() {
        basketList.clear();
    }


}
