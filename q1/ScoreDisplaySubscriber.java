package q1;

public class ScoreDisplaySubscriber implements ScoreListener {
    private String displayName;

    public ScoreDisplaySubscriber(String name) {
        this.displayName = name;
    }

    @Override
    public void scoreChange(ScoreEvent event) {
        System.out.println("live result: " + event.getLatestScore());
    }

    public String getDisplayName() {
        return displayName;
    }
}
