package org.sushmita.design_patterns_oops.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable implements IObservable{
    private List<IObserver> observerList;

    public Observable(){
        observerList = new ArrayList<>();
    }

    @Override
    public String getStatus() {
        return "Hello World!";
    }

    @Override
    public void update() {
        for(IObserver observer: observerList){
            observer.notifyMe();
        }
    }

    @Override
    public void subscribe(IObserver observer) {
        observerList.add(observer);
        observer.setObservable(this);
    }

}
