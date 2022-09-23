package org.sushmita.design_patterns_oops.singleton;

public class Singleton {
    private static Singleton instance;
    private int item;

    //no public constructor
    private Singleton(int item){
       if(instance!=null) {
            this.item = item;
        }
    }

    public static  Singleton getInstance(int item){
        if(instance == null){
            synchronized(instance) {
                if(instance!=null)
                    instance = new Singleton(item);
            }
        }
        return instance;
    }

}
