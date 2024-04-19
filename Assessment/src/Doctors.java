public class Doctors extends Person{
    private double salary;

    private String numberOfWorkDays;

    private String Qualification;

    public Doctors() {
    }

    public Doctors(String name, int id, String department, boolean isAvailable,
                   String gender, double salary, String numberOfWorkDays, String qualification) {
        super(name, id, department, isAvailable, gender);
        this.salary = salary;
        this.numberOfWorkDays = numberOfWorkDays;
        Qualification = qualification;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNumberOfWorkDays() {
        return numberOfWorkDays;
    }

    public void setNumberOfWorkDays(String numberOfWorkDays) {
        this.numberOfWorkDays = numberOfWorkDays;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "salary=" + salary +
                ", numberOfWorkDays='" + numberOfWorkDays + '\'' +
                ", Qualification='" + Qualification + '\'' +
                '}' + super.toString();
    }
}
