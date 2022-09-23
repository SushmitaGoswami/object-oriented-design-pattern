package org.sushmita.design_patterns_oops.iterator;

public class ListIterator implements Iterator{
    private ListInventory listInventory;
    private int size;

    public ListIterator(ListInventory listInventory){
        this.listInventory = listInventory;
        this.size = 0;
    }
    @Override
    public boolean hasNext() {
        return this.size <=this.listInventory.getObjects().size();
    }

    @Override
    public Object next() {
        Object ob =  this.listInventory.getObjects().get(size);
        size =+ 1;
        return ob;
    }
}
