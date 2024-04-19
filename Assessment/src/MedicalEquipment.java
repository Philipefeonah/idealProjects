public class MedicalEquipment {
    private String name;
    private int id;
    private String size;
    private String department;
    private boolean isAvailble;

    public MedicalEquipment() {
    }

    public MedicalEquipment(String name, int id, String size, String department, boolean isAvailble) {
        this.name = name;
        this.id = id;
        this.size = size;
        this.department = department;
        this.isAvailble = isAvailble;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isAvailble() {
        return isAvailble;
    }

    public void setAvailble(boolean availble) {
        isAvailble = availble;
    }

    @Override
    public String toString() {
        return "MedicalEquipment{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", size='" + size + '\'' +
                ", department='" + department + '\'' +
                ", isAvailble=" + isAvailble +
                '}';
    }
}
