package Day2;

import Day2.Person;

public class Borrower extends Person {

    boolean isAStudent;
    private int numberOfBooksborrowed;

    public Borrower() {
    }

    public Borrower(String name, int age, int phone, String duty,
                    String nationality, boolean isAStudent,
                    int numberOfBooksborrowed) {
        super(name, age, phone, duty, nationality);
        this.isAStudent = isAStudent;
        this.numberOfBooksborrowed = numberOfBooksborrowed;
    }


    public boolean isAStudent() {
        return isAStudent;
    }

    public void setAStudent(boolean AStudent) {
        isAStudent = AStudent;
    }

    public int getNumberOfBooksborrowed() {
        return numberOfBooksborrowed;
    }

    public void setNumberOfBooksborrowed(int numberOfBooksborrowed) {
        this.numberOfBooksborrowed = numberOfBooksborrowed;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "isAStudent=" + isAStudent +
                ", numberOfBooksborrowed=" + numberOfBooksborrowed +
                '}';
    }
}
