package Day1;

public class PhilipString {
    private String original;

    public PhilipString(String original) {
        this.original = original;
    }

    public PhilipString() {

    }

    public void callMyName(){
        System.out.println("This is the name: " + this.original);
    }
}
