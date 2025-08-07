package q2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LiveScoreBean {
    private String scoreLine;
    private PropertyChangeSupport propertyChangeSupport;

    public LiveScoreBean() {
        this.scoreLine = "";
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String newScoreLine) {
        String oldScoreLine = this.scoreLine;
        this.scoreLine = newScoreLine;

        propertyChangeSupport.firePropertyChange("scoreLine", oldScoreLine, newScoreLine);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
    }
}
