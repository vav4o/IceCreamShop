public class LuckyGuy extends Student implements ScoreStrat{

    public LuckyGuy() {
        System.out.println(
                "Lucky Guy has been created"
        );
    }

    @Override
    public void getScored(double score) {
        super.getScored(score);
        System.out.println(
                "Get scored by similarity in previous years, score: " + score
        );
    }
}
