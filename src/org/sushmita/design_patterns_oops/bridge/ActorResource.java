package org.sushmita.design_patterns_oops.bridge;

public class ActorResource implements Resource{
    private Actor actor;

    public ActorResource(Actor actor){
        this.actor = actor;
    }
    @Override
    public String title() {
        return this.actor.getfName() + " " + this.actor.getlName();
    }

    @Override
    public String description() {
        return this.actor.getBio();
    }
}
