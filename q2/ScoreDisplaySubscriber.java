package q2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ScoreDisplaySubscriber implements PropertyChangeListener {
    private String subscriberName;

    public ScoreDisplaySubscriber(String name) {
        this.subscriberName = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("scoreLine".equals(evt.getPropertyName())) {
            String newScore = (String) evt.getNewValue();
            System.out.println("live result: " + newScore);
        }
    }

    public String getSubscriberName() {
        return subscriberName;
    }
}
