package WorkPackage;

public abstract class Mall {
    private String name;
    private double cost;
    private boolean isAvailable;
    private int numberOfGoods;

    public Mall() {
    }

    public Mall(String name, double cost, boolean isAvailable, int numberOfGoods) {
        this.name = name;
        this.cost = cost;
        this.isAvailable = isAvailable;
        this.numberOfGoods = numberOfGoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getNumberOfGoods() {
        return numberOfGoods;
    }

    public void setNumberOfGoods(int numberOfGoods) {
        this.numberOfGoods = numberOfGoods;
    }

    @Override
    public String toString() {
        return "Mall{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", isAvailable=" + isAvailable +
                ", numberOfGoods=" + numberOfGoods +
                '}';
    }
}
