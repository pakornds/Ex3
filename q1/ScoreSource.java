package q1;

import java.util.ArrayList;
import java.util.List;

public class ScoreSource {
    private List<ScoreListener> listeners;
    private String currentScore;

    public ScoreSource() {
        this.listeners = new ArrayList<>();
        this.currentScore = "";
    }

    public void registerListener(ScoreListener listener) {
        if (!listeners.contains(listener)) {
            listeners.add(listener);
            System.out.println("Listener registered successfully");
        }
    }

    public void unregisterListener(ScoreListener listener) {
        if (listeners.contains(listener)) {
            listeners.remove(listener);
            System.out.println("Listener unregistered successfully");
        }
    }

    public void setScoreLine(String scoreLine) {
        this.currentScore = scoreLine;
        ScoreEvent event = new ScoreEvent(scoreLine);
        notifyAllListeners(event);
    }

    private void notifyAllListeners(ScoreEvent event) {
        for (ScoreListener listener : listeners) {
            listener.scoreChange(event);
        }
    }

    public String getCurrentScore() {
        return currentScore;
    }
}
