public class Main {
    public static void main(String[] args) {
        Shop shop = Shop.getInstance();

        IceCream iceCream = shop.prepareProduct("Vanilla");
        iceCream = new ToppingDecorator(iceCream, "glaze");
        iceCream.prepare();

        IceCream iceCream2 = shop.prepareProduct("Strawberry");
    }
}