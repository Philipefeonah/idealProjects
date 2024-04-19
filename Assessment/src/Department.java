public class Department {
    private Optometry optometry;

    private Pediatrics pediatrics;
    private Surgery surgery;

    public Department() {
    }

    public Optometry getOptometry() {
        return optometry;
    }

    public void setOptometry(Optometry optometry) {
        this.optometry = optometry;
    }

    public Pediatrics getPediatrics() {
        return pediatrics;
    }

    public void setPediatrics(Pediatrics pediatrics) {
        this.pediatrics = pediatrics;
    }

    public Surgery getSurgery() {
        return surgery;
    }

    public void setSurgery(Surgery surgery) {
        this.surgery = surgery;
    }

    @Override
    public String toString() {
        return  '\n' +
                "OPTOMETRY" + optometry + '\n' +
                "PEDIATRICS" + pediatrics + '\n' +
                "SURGERY" + surgery +
                '}';
    }
}
