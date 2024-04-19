package WorkPackage;

public class Category {
    private Electronics electronics;
    private Provision provision;
    private Fashion fashion;
    private  BookShelf bookShelf;

    public Category() {
    }

    public Electronics getElectronics() {
        return electronics;
    }

    public void setElectronics(Electronics electronics) {
        this.electronics = electronics;
    }

    public Provision getProvision() {
        return provision;
    }

    public void setProvision(Provision provision) {
        this.provision = provision;
    }

    public Fashion getFashion() {
        return fashion;
    }

    public void setFashion(Fashion fashion) {
        this.fashion = fashion;
    }

    public BookShelf getBookShelf() {
        return bookShelf;
    }

    public void setBookShelf(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public String toString() {
        return "Category{" +
                "electronics=" + electronics +
                ", provision=" + provision +
                ", fashion=" + fashion +
                ", bookShelf=" + bookShelf +
                '}';
    }
}
