import javax.print.Doc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Doctors doctors = new Doctors();
        doctors.setName("Aang");
        doctors.setId(10);
        doctors.setGender("Male");
        doctors.setSalary(50_000);
        doctors.setNumberOfWorkDays("4 workings Days");
        doctors.setQualification("Consultant");
        doctors.setAvailable(true);
        doctors.setDepartment("Optometry");

        Nurses nurses = new Nurses();
        nurses.setName("Katara");
        nurses.setId(12);
        nurses.setGender("Female");
        nurses.setNumberOfWorkDays("5 working Days");
        nurses.setQualification("Bsc");
        nurses.setSalary(250000);
        nurses.setAvailable(false);
        nurses.setDepartment("Optometry");

        Patient patient = new Patient();
        patient.setName("Sokka");
        patient.setId(13);
        patient.setGender("Female");
        patient.setTypeOfSickness("Staphylococcus");
        patient.setAvailable(true);
        patient.setCurrentHealthStatus("Recovery");
        patient.setDurationInHospital("5 months");
        patient.setPaymentOfBills(400_000);

        MedicalEquipment medicalEquipment = new MedicalEquipment();
        medicalEquipment.setName("Retinoscopy");
        medicalEquipment.setId(1233456);
        medicalEquipment.setAvailble(false);
        medicalEquipment.setDepartment("Optometry");

        Optometry optometry = new Optometry();
        optometry.setDoctors(doctors);
        optometry.setNurses(nurses);
        optometry.setPatients(patient);
        optometry.setMedicalEquipment(medicalEquipment);

        Doctors doctors1 = new Doctors();
        doctors1.setName("Philip");
        doctors1.setId(11);
        doctors1.setGender("Male");
        doctors1.setSalary(500_000);
        doctors1.setNumberOfWorkDays("2 workings Days");
        doctors1.setQualification("MBBS");
        doctors1.setAvailable(true);
        doctors1.setDepartment("Pediatrics");

        Nurses nurse1 = new Nurses();
        nurse1.setName("Banke");
        nurse1.setId(112);
        nurse1.setGender("Female");
        nurse1.setNumberOfWorkDays("4 working Days");
        nurse1.setQualification("Bsc");
        nurse1.setSalary(250000);
        nurse1.setAvailable(false);
        nurse1.setDepartment("Pediatrics");


        Patient patient1 = new Patient();
        patient1.setName("Ketura");
        patient1.setId(113);
        patient1.setGender("male");
        patient1.setTypeOfSickness("Tuberculosis");
        patient1.setAvailable(true);
        patient1.setCurrentHealthStatus("Recovery");
        patient1.setDurationInHospital("11 months");
        patient1.setPaymentOfBills(300_000);

        MedicalEquipment medicalEquipment1 = new MedicalEquipment();
        medicalEquipment1.setName("Stethoscope");
        medicalEquipment1.setId(1533456);
        medicalEquipment1.setAvailble(true);
        medicalEquipment1.setDepartment("Pediatrics");

        Pediatrics pediatrics = new Pediatrics();
        pediatrics.setDoctors(doctors1);
        pediatrics.setNurses(nurse1);
        pediatrics.setPatients(patient1);
        pediatrics.setMedicalEquipment(medicalEquipment1);

        Doctors doctors2 = new Doctors();
        doctors2.setName("Tolulope");
        doctors2.setId(114);
        doctors2.setGender("Female");
        doctors2.setSalary(800_000);
        doctors2.setNumberOfWorkDays("3 workings Days");
        doctors2.setQualification("Consultant");
        doctors2.setAvailable(true);
        doctors2.setDepartment("Surgery");



        Nurses nurse2 = new Nurses();
        nurse2.setName("Daniel");
        nurse2.setId(122);
        nurse2.setGender("Male");
        nurse2.setNumberOfWorkDays("3 working Days");
        nurse2.setQualification("Bsc");
        nurse2.setSalary(50_000);
        nurse2.setAvailable(true);
        nurse2.setDepartment("Surgery");

        Patient patient2 = new Patient();
        patient2.setName("Eli");
        patient2.setId(133);
        patient2.setGender("Male");
        patient2.setTypeOfSickness("Cancer");
        patient2.setAvailable(true);
        patient2.setCurrentHealthStatus("Dying");
        patient2.setDurationInHospital("6 months");
        patient2.setPaymentOfBills(3_000_000);


        MedicalEquipment medicalEquipment2 = new MedicalEquipment();
        medicalEquipment2.setName("Scalpels");
        medicalEquipment2.setId(137);
        medicalEquipment2.setAvailble(true);
        medicalEquipment2.setDepartment("Survey");

        Surgery surgery = new Surgery();
        surgery.setDoctors(doctors2);
        surgery.setNurses(nurse2);
        surgery.setPatients(patient2);
        surgery.setMedicalEquipment(medicalEquipment2);

        Department department = new Department();
        department.setOptometry(optometry);
        department.setPediatrics(pediatrics);
        department.setSurgery(surgery);

        Hospital hospital = new Hospital();
        hospital.setDepartment(department);

        System.out.println(hospital);


    }
}