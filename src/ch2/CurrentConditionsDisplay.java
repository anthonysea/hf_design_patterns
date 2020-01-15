package ch2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CurrentConditionsDisplay implements PropertyChangeListener, DisplayElement {
    private float temperature;
    private float humidity;
    // private Subject weatherData;

    public CurrentConditionsDisplay() {}

    public void update(float temperature, float humidity, float pressure) {
        update("temperature", temperature);
        update("humidity", humidity);
        display();
    }

    public void update(String propertyName, float property) {
        if (propertyName.equals("temperature")) this.temperature = property;
        if (propertyName.equals("humidity")) this.humidity = property;
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
            + " F degrees and " + humidity + "% humidity");
    }

    public void propertyChange(PropertyChangeEvent event) {
        float t;
        float h;
        if (event.getPropertyName().equals("temperature")) {
            t = (float)event.getNewValue();
            update("temperature", t);
        } else if (event.getPropertyName().equals("humidity")) {
            h = (float)event.getNewValue();
            update("humidity", h);
        }
        display();

    }

}
