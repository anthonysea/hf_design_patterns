package ch2;

// import java.util.ArrayList;
// import java.util.Observable;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class WeatherData {
    // private ArrayList<Observer> observers; Don't need to keep track of observers with built-in implementation of Observable
    private float temperature;
    private float humidity;
    private float pressure;
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);


    public WeatherData() {};

    /* Observable super class handles registration, removal, and notification methods
    /* Using java.beans PropertyChangeEvent and PropertyChangeListener because Observable/Observer is deprecated
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if ( i >= 0 ) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        setChanged(); // indicate the state has changed before calling notifyObservers()
        notifyObservers();
    }
    */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        pcs.firePropertyChange("temperature", this.temperature, temperature);
        this.temperature = temperature;
        pcs.firePropertyChange("humidity", this.humidity, humidity);
        this.humidity = humidity;
        pcs.firePropertyChange("pressure", this.pressure, pressure);
        this.pressure = pressure;
        // measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }
}
