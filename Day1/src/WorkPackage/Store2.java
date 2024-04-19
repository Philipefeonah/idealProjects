package WorkPackage;

public class Store2 {
   public Category category;

    public Store2() {
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Store2{" +
                "orchiStore=" + category +
                '}';
    }
}
