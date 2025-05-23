public class ToppingDecorator extends IceCreamDecorator{

    private String toppingName;

    public ToppingDecorator(IceCream decoratedIceCream, String toppingName) {
        super(decoratedIceCream);
        this.toppingName = toppingName;
    }

    @Override
    public void prepare() {
        super.prepare();
        this.addTopping();
    }

    private void addTopping() {
        System.out.println(
                "Adding topping: " + this.toppingName
        );
    }
}
