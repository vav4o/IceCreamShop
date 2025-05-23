public class Shop extends ShopFactory{

    private static Shop instance;

    private Shop() {};

    public static Shop getInstance(){
        if(instance == null){
            instance = new Shop();
        }
        return instance;
    }

    @Override
    public IceCream createIceCream(String iceCreamType) {
        if(iceCreamType.equalsIgnoreCase("Chocolate")){
            return new ChocolateIceCream();
        }

        if(iceCreamType.equalsIgnoreCase("Vanilla")){
            return new VanillaIceCream();
        }

        if(iceCreamType.equalsIgnoreCase("Strawberry")){
            return new StrawberryIceCream();
        }
        System.out.println(
                "Unknown Ice Cream flavour: " + iceCreamType
        );

        return null;
    }
}
