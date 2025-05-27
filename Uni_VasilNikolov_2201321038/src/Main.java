public class Main {
    public static void main(String[] args) {
        University uni = University.getInstance();
        University uni2 = University.getInstance();
        University uni3 = University.getInstance();

        Student tarikat = new Tarikat();

        TaskGiver taskGiver = new TaskGiver();

        tarikat.takeTask(taskGiver.prepareTask("Short_task"));

        tarikat = new PowerDecorator(tarikat, "glaze");
        tarikat = new PowerDecorator(tarikat, "glaze2");

        ScoringSystem scoringSystem = new ScoringSystem();
        scoringSystem.score(new Nerd());
        //scoringSystem.score(tarikat, 5);
        int a = 2+3;
    }
}