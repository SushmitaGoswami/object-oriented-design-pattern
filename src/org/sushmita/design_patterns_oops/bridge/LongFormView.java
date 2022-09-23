package org.sushmita.design_patterns_oops.bridge;

public class LongFormView implements IFormView{
    private Resource resource;

    public LongFormView(Resource resource){
        this.resource = resource;
    }
    @Override
    public void description() {
        System.out.println("Long Form View");
        System.out.println(resource.description());
    }

    @Override
    public void title() {
        System.out.println("Long Form View");
        System.out.println(resource.title());
    }
}
