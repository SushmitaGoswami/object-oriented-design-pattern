package org.sushmita.design_patterns_oops.iterator;

public class HandInventory implements Inventory{
    private Object left;
    private Object right;

    public HandInventory(Object left, Object right) {
        this.left = left;
        this.right = right;
    }

    public Object getLeft() {
        return left;
    }

    public void setLeft(Object left) {
        this.left = left;
    }

    public Object getRight() {
        return right;
    }

    public void setRight(Object right) {
        this.right = right;
    }

    @Override
    public Iterator getIterator() {
        return new HandIterator(this);
    }
}
