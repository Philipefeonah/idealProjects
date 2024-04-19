package Day2;

import Day2.Person;

public class  Liberian extends Person {

    private int yearOfExperience;
    private String educationalQualification;
    private int numberOfBook;

    public Liberian() {
    }

    public Liberian(String name, int age, int phone, String duty,
                    String nationality, int yearOfExperience,
                    String educationalQualification, int numberOfBook) {
        super(name, age, phone, duty, nationality);
        this.yearOfExperience = yearOfExperience;
        this.educationalQualification = educationalQualification;
        this.numberOfBook = numberOfBook;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getEducationalQualification() {
        return educationalQualification;
    }

    public void setEducationalQualification(String educationalQualification) {
        this.educationalQualification = educationalQualification;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    @Override
    public String toString() {
        return "Liberian{" +
                "yearOfExperience=" + yearOfExperience +
                ", educationalQualification='" + educationalQualification + '\'' +
                ", numberOfBook=" + numberOfBook +
                ", name =" + this.getName() +
                '}';
    }

}
