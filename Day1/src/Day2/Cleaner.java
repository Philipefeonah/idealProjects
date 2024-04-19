package Day2;

import Day2.Person;

public class Cleaner extends Person {

    boolean isYoungOrOld;

    private String Department;

    public Cleaner() {
    }

    public Cleaner(String name, int age, int phone, String duty, String nationality, boolean isYoungOrOld, String department) {
        super(name, age, phone, duty, nationality);
        this.isYoungOrOld = isYoungOrOld;
        Department = department;
    }

    public boolean isYoungOrOld() {
        return isYoungOrOld;
    }

    public void setYoungOrOld(boolean youngOrOld) {
        isYoungOrOld = youngOrOld;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "isYoungOrOld=" + isYoungOrOld +
                ", Department='" + Department + '\'' +
                '}';
    }
}

