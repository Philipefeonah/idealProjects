package WorkPackage;

public class BookShelf extends Mall {
    private String type;
    private String size;

    public BookShelf() {
    }


    public BookShelf(String name, double cost, boolean isAvailable, int numberOfGoods, String type, String size) {
        super(name, cost, isAvailable, numberOfGoods);
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "WorkPackage.BookShelf{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
