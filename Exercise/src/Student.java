public class Student extends Human{
    private String schoolName;
    private String skill;

    public Student(String name, int age, String nationality, String schoolName, String skill) {
        super(name, age, nationality);
        this.schoolName = schoolName;
        this.skill = skill;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String getResponsible() {
        return "Study";
    }

    @Override
    public String toString() {
        return "Study";
    }
}
