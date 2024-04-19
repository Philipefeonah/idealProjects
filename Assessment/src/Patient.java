public class Patient extends Person{

    private String typeOfSickness;

    private String currentHealthStatus;
    private String durationInHospital;
    private double paymentOfBills;

    public Patient() {
    }

    public Patient(String name, int id, String department, boolean isAvailable, String gender, String typeOfSickness,
                   String currentHealthStatus, String durationInHospital, double paymentOfBills) {
        super(name, id, department, isAvailable, gender);
        this.typeOfSickness = typeOfSickness;
        this.currentHealthStatus = currentHealthStatus;
        this.durationInHospital = durationInHospital;
        this.paymentOfBills = paymentOfBills;
    }

    public String getTypeOfSickness() {
        return typeOfSickness;
    }

    public void setTypeOfSickness(String typeOfSickness) {
        this.typeOfSickness = typeOfSickness;
    }

    public String getCurrentHealthStatus() {
        return currentHealthStatus;
    }

    public void setCurrentHealthStatus(String currentHealthStatus) {
        this.currentHealthStatus = currentHealthStatus;
    }

    public String getDurationInHospital() {
        return durationInHospital;
    }

    public void setDurationInHospital(String durationInHospital) {
        this.durationInHospital = durationInHospital;
    }

    public double getPaymentOfBills() {
        return paymentOfBills;
    }

    public void setPaymentOfBills(double paymentOfBills) {
        this.paymentOfBills = paymentOfBills;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "typeOfSickness='" + typeOfSickness + '\'' +
                ", currentHealthStatus='" + currentHealthStatus + '\'' +
                ", durationInHospital='" + durationInHospital + '\'' +
                ", paymentOfBills=" + paymentOfBills +
                '}' + super.toString();
    }
}
