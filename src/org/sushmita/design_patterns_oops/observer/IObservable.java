package org.sushmita.design_patterns_oops.observer;

public interface IObservable {
    public String getStatus();
    public void update();
    public void subscribe(IObserver observer);
}
