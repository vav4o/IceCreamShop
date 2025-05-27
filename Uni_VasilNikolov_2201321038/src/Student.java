import java.util.ArrayList;
import java.util.List;

public abstract class Student implements ScoreStrat {

    public String name;

    public String power;

    private double score;

    private Task task;

    public Student(){
    }

    public void takeTask(Task task){
        this.task = task;
    }

    public void getScored(double score){
        this.score = score;
    }
}
