package Day1;

public class Dog extends  Animal{
    private String name;
    private  int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}

