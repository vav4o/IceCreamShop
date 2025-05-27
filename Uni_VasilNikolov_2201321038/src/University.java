public class University {

    private static University instance;

    private University() {}

    public static University getInstance() {
        if(instance == null) {
            instance = new University();
            System.out.println("University created");
        }
        return instance;
    }
}
