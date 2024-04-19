public class Cat {
    private String name;
    private String color;

    private String cry;

    public String getCry() {
        return cry;
    }

    public void setCry(String cry) {
        this.cry = cry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  void cry(){
        System.out.println(name + " " + "is crying meow");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
