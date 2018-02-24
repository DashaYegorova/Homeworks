package lesson11;

import lesson9.Person;

public class Driver extends Person {
    private String fullName;
    private int experience;

    Driver() {
    }

    public Driver(String fullName, int experience) {
        super();
        this.fullName = fullName;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
