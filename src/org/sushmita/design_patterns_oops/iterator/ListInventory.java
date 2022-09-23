package org.sushmita.design_patterns_oops.iterator;

import java.util.List;

public class ListInventory implements Inventory{

    private List<Object> objects;

    public ListInventory(List<Object> objects){
        this.objects = objects;
    }
    @Override
    public Iterator getIterator() {
        return new ListIterator(this);
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }
}
