package org.sushmita.design_patterns_oops.bridge;

public class Actor {
    private String fName;
    private String lName;
    private String bio;

    public Actor(String fName, String lName, String bio){
        this.fName = fName;
        this.lName = lName;
        this.bio = bio;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
