package WorkPackage;

public class Main2 {
    public static void main(String[] args) {

        Electronics electronics = new Electronics();
        electronics.setType("pansonic");
        electronics.setCost(250_000);
        electronics.setAvailable(true);
        electronics.setNumberOfGoods(10);
        electronics.setSize("Big");

        Provision provision = new Provision();
        provision.setType("Bag of rice");
        provision.setCost(90_000);
        provision.setAvailable(true);
        provision.setNumberOfGoods(30);
        provision.setSize("Big");

        Fashion fashion = new Fashion();
        fashion.setStyle("Gen Z");
        fashion.setCost(45_000);
        fashion.setBeautiful(true);

        BookShelf bookShelf = new BookShelf();
        bookShelf.setType("");
        bookShelf.setCost(50_000);
        bookShelf.setSize("small");
        bookShelf.setAvailable(true);

        Category category = new Category();
        category.setProvision(provision);
        category.setElectronics(electronics);
        category.setFashion(fashion);
        category.setBookShelf(bookShelf);

        Store2 orchidStore = new Store2();
        orchidStore.setCategory(category);

        System.out.println(orchidStore);




    }
}
