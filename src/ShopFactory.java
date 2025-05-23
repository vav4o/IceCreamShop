public abstract class ShopFactory {

    public abstract IceCream createIceCream(String iceCreamType );

    public IceCream prepareProduct(String iceCreamType) {
        IceCream iceCream = this.createIceCream(iceCreamType);
        iceCream.prepare();

        return iceCream;
    }
}
