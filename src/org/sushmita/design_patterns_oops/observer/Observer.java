package org.sushmita.design_patterns_oops.observer;

public class Observer implements IObserver{

    private IObservable observable;

    @Override
    public void notifyMe() {
        System.out.println("Hey thanks!");
        System.out.println("From Observable " + observable.getStatus());
    }

    @Override
    public void setObservable(IObservable observable) {
        this.observable = observable;
    }


}
