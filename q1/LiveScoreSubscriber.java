package q1;

public class LiveScoreSubscriber implements ScoreListener {
    private String subscriberName;

    public LiveScoreSubscriber(String name) {
        this.subscriberName = name;
    }

    public LiveScoreSubscriber() {
        this.subscriberName = "Default Live Score Subscriber";
    }

    @Override
    public void scoreChange(ScoreEvent event) {
        System.out.println("live result: " + event.getLatestScore());
    }

    public String getSubscriberName() {
        return subscriberName;
    }
}
