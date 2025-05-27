import java.util.List;

public class PowerDecorator extends StudentDecorator{

    private String power;

    public PowerDecorator(Student decoratedStudent, String power) {
        super(decoratedStudent);
        this.power = power;
        this.addPower();
    }

    @Override
    public void createStudent() {
        super.createStudent();
        this.addPower();
    }

    private void addPower() {
        System.out.println(
                "Adding power: " + this.power
        );
    }
}
