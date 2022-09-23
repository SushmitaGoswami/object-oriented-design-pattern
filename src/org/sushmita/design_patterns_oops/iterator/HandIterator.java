package org.sushmita.design_patterns_oops.iterator;

public class HandIterator implements Iterator{

    private HandInventory handInventory;
    private int marker = 0;
    public HandIterator(HandInventory handInventory){
        this.handInventory = handInventory;
    }
    @Override
    public boolean hasNext() {
        return marker <= 1;
    }

    @Override
    public Object next() {
        switch (marker){
            case 0: marker = 1; return handInventory.getLeft();
            case 1: marker = 2; return handInventory.getRight();
            default:return null;
        }
    }
}
