public abstract class Person {
    private String name;
    private String gender;
    private int id;
    private String department;
    private boolean isAvailable;


    public Person() {
    }

    public Person(String name, int id, String department, boolean isAvailable, String gender) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.isAvailable = isAvailable;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
