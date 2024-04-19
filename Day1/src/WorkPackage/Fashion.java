package WorkPackage;

public class Fashion extends Mall {
    private String style;

    private boolean isBeautiful;

    public Fashion() {
    }

    public Fashion(String name, double cost, boolean isAvailable, int numberOfGoods, String style, boolean isBeautiful) {
        super(name, cost, isAvailable, numberOfGoods);
        this.style = style;
        this.isBeautiful = isBeautiful;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isBeautiful() {
        return isBeautiful;
    }

    public void setBeautiful(boolean beautiful) {
        isBeautiful = beautiful;
    }

    @Override
    public String toString() {
        return "WorkPackage.Fashion{" +
                "style='" + style + '\'' +
                ", isBeautiful=" + isBeautiful +
                '}';
    }
}
