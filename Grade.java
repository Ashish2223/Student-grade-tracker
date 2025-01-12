package StudentGradeTracker;

public class Grade {
    private double score;
    private double weight;
    
    public Grade(double score, double weight) {
        this.score = score;
        this.weight = weight;
        
    }
    public double getWeight() {
        return weight;
    }
    public double getScore() {
        return score;
    }

}
