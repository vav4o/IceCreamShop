public class Tarikat extends Student implements ScoreStrat{

    public Tarikat() {
        System.out.println(
                "Tarikat has been created"
        );
    }

    @Override
    public void getScored(double score) {
        super.getScored(score);
        System.out.println(
                "Get scored by originality, score: " + score
        );
    }
}
