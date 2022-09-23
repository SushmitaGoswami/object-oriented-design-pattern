package org.sushmita.design_patterns_oops.bridge;

public class ShortFormView implements IFormView{
    private Resource resource;

    public ShortFormView(Resource resource){
        this.resource = resource;
    }
    @Override
    public void description() {
        System.out.println("Short Form View");
        System.out.println(resource.description());
    }

    @Override
    public void title() {
        System.out.println("Short Form View");
        System.out.println(resource.title());
    }
}
