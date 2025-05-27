public class Nerd extends Student implements ScoreStrat{

    public Nerd() {
        System.out.println(
                "Nerd has been created"
        );
    }

    @Override
    public void getScored(double score) {
        super.getScored(score);
        System.out.println(
                "Get scored by strictness, score: " + score
        );
    }
}
