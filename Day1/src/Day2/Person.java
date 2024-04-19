package Day2;

public abstract class Person {
    private String name;
    private int age;
    private int phone;
    private String stateOfOrigin;
    private String nationality;

    public Person() {
    }

    public Person(String name, int age, int phone, String duty, String nationality) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public void giveName(String name) {
//        this.name = name;
//    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }


    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", stateOfOrigin='" + stateOfOrigin + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
