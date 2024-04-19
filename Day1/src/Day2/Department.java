package Day2;

public class Department {
    private Liberian liberianA;

    private  Borrower borrowerA;

    private Cleaner cleanerA;

    public Department() {
    }

    public Department(Liberian liberianA, Borrower borrowerA, Cleaner cleanerA){
        this.liberianA = liberianA;
        this.borrowerA = borrowerA;
        this.cleanerA = cleanerA;
    }

    public Liberian getLiberianA() {
        return liberianA;
    }

    public void setLiberianA(Liberian liberianA) {
        this.liberianA = liberianA;
    }

    public Borrower getBorrowerA() {
        return borrowerA;
    }

    public void setBorrowerA(Borrower borrowerA) {
        this.borrowerA = borrowerA;
    }

    public Cleaner getCleanerA() {
        return cleanerA;
    }

    public void setCleanerA(Cleaner cleanerA) {
        this.cleanerA = cleanerA;
    }

    @Override
    public String toString() {
        return "Department{" +
                "liberianA=" + liberianA +
                ", borrowerA=" + borrowerA +
                ", cleanerA=" + cleanerA +
                '}';
    }

        public String viewClassInformation(){
        return "Library{" +
                "liberianA=" + liberianA +
                ", borrowerA=" + borrowerA +
                ", cleanerA=" + cleanerA +
                '}';
    }
}
