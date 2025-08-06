package q1;

public class ScoreEvent {
    private String latestScore;

    public ScoreEvent(String score) {
        this.latestScore = score;
    }

    public String getLatestScore() {
        return latestScore;
    }

    public void setLatestScore(String score) {
        this.latestScore = score;
    }
}
