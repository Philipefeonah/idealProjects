package Day1;

public class Animal {
    private String name;

    private String complexion;
    private int size;
    private int age;

    private int numberOfLeg;
    private boolean isEyesAvailable;

    private boolean isAlive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLeg() {
        return numberOfLeg;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    public boolean isEyesAvailable() {
        return isEyesAvailable;
    }

    public void setEyesAvailable(boolean eyesAvailable) {
        isEyesAvailable = eyesAvailable;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Day1.Animal{" +
                "name='" + name + '\'' +
                ", complexion='" + complexion + '\'' +
                ", size=" + size +
                ", age=" + age +
                ", numberOfLeg=" + numberOfLeg +
                ", isEyesAvailable=" + isEyesAvailable +
                ", isAlive=" + isAlive +
                '}';
    }
}
