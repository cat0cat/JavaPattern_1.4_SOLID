public abstract class Product {

    private String name;
    private int count;
    private int price;

    public String getName () {
        return name;
    }

    public int getCount () {
        return count;
    }

    public int getPrice () {
        return price;
    }

    public String setName (String name) {
        return this.name = name;
    }

    public int addCount(int count) {
        return this.count += count;
    }

    public int removeCount(int count) {
        return this.count -= count;
    }

    public int setPrice (int price) {
        return this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}
