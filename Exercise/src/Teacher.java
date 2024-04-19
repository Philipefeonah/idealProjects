public class Teacher extends Human {
    private int salary;
    private String schoolName;

    public Teacher(String name, int age, String nationality, int salary, String schoolName) {
        super(name, age, nationality);
        this.salary = salary;
        this.schoolName = schoolName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String getResponsible() {
        return "Teach";
    }

    @Override
    public String toString() {
        return "Teach";
    }
}
