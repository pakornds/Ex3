package q2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class LiveResultSubscriber implements PropertyChangeListener {
    private String displayName;

    public LiveResultSubscriber(String name) {
        this.displayName = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("scoreLine".equals(evt.getPropertyName())) {
            String newScore = (String) evt.getNewValue();
            System.out.println("live result: " + newScore);
        }
    }

    public String getDisplayName() {
        return displayName;
    }
}
