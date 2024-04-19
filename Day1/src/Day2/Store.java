package Day2;

public class Store {
    private Categories categories;



    public Store() {
    }

    public Store(Categories categories) {
        this.categories = categories;

    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }


    @Override
    public String toString() {
        return "Store{" +
                "categories=" + categories +
                '}';
    }
}
