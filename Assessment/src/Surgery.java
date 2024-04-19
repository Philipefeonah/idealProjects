public class Surgery {
    private Doctors doctors;
    private Nurses nurses;

    private Patient patients;

    private MedicalEquipment medicalEquipment;

    public Surgery() {
    }

    public Surgery(Doctors doctors, Nurses nurses, Patient patients, MedicalEquipment medicalEquipment) {
        this.doctors = doctors;
        this.nurses = nurses;
        this.patients = patients;
        this.medicalEquipment = medicalEquipment;
    }

    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }

    public Nurses getNurses() {
        return nurses;
    }

    public void setNurses(Nurses nurses) {
        this.nurses = nurses;
    }

    public Patient getPatients() {
        return patients;
    }

    public void setPatients(Patient patients) {
        this.patients = patients;
    }

    public MedicalEquipment getMedicalEquipment() {
        return medicalEquipment;
    }

    public void setMedicalEquipment(MedicalEquipment medicalEquipment) {
        this.medicalEquipment = medicalEquipment;
    }

    @Override
    public String toString() {
        return  '\n' +
                "Doctors=" + doctors + '\n' +
                "Nurses=" + nurses + '\n' +
                "Patients=" + patients + '\n' +
                "MedicalEquipment=" + medicalEquipment +
                '}' ;
    }
}
