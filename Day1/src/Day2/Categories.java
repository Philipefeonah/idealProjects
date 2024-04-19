package Day2;

public class Categories {
    private String electronics;
    private String provisions;
    private String fashion;
    private String bookShelf;
    private Type type;


    public Categories() {
    }

    public Categories(String electronics, String provisions, String fashion,
                      String bookShelf, Type type) {
        this.electronics = electronics;
        this.provisions = provisions;
        this.fashion = fashion;
        this.bookShelf = bookShelf;
        this.type = type;

    }

    public String getElectronics() {
        return electronics;
    }

    public void setElectronics(String electronics) {
        this.electronics = electronics;
    }

    public String getProvisions() {
        return provisions;
    }

    public void setProvisions(String provisions) {
        this.provisions = provisions;
    }

    public String getFashion() {
        return fashion;
    }

    public void setFashion(String fashion) {
        this.fashion = fashion;
    }

    public String getBookShelf() {
        return bookShelf;
    }

    public void setBookShelf(String bookShelf) {
        this.bookShelf = bookShelf;
    }
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }




    @Override
    public String toString() {
        return "Categories{" +
                "electronics='" + electronics + '\'' +
                ", provisions='" + provisions + '\'' +
                ", fashion='" + fashion + '\'' +
                ", bookShelf='" + bookShelf + '\'' +
                ",   type='" + type + '\'' +
                '}';
    }
}
