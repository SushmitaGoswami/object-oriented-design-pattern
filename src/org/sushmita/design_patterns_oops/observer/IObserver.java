package org.sushmita.design_patterns_oops.observer;

public interface IObserver {
    public void notifyMe();
    public void setObservable(IObservable observer);
}
