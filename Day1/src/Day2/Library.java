package Day2;

public class Library {
   private Department department;
    public Library() {

    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Library{" +
                "department=" + department +
                '}';
    }
}

//    public String viewClassInformation(){
//        return "Library{" +
//                "liberianA=" + liberianA +
//                ", borrowerA=" + borrowerA +
//                ", cleanerA=" + cleanerA +
//                '}';
//    }

