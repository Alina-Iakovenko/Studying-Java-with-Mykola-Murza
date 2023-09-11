import java.util.List;

public non-sealed class Professor extends Employee implements CanTeach {

    private int experience;
    private int msgSent;
    static String department = "Computer Science";
    private List<AcademicField> fields;

    Professor(String name, String surname, int experience, AcademicStatus academicStatus, List<AcademicField> fields) {
        super(name, surname, academicStatus);
                this.experience = experience;
                msgSent = 0;
                this.fields = fields;
    }

    @Override
    public String mail(String message) {
        msgSent++;
        return "Professor " + super.getName() + " sent " + this.getMsgSent() + "th" + " message: " + message;
    }

    @Override
    public String mail(String message, String studentSurname) {
        msgSent++;
        return "Professor " + super.getName() + " send to " + studentSurname + ": " + message;
    }

    @Override
    public String mail(double mark, String studentSurname) {
        msgSent++;
        return "Professor " + super.getName() + " put the mark " + studentSurname + ": " + mark;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getMsgSent() {
        return msgSent;
    }

    public static String getDepartment() {
        return department;
    }

    public static void setDepartment(String department) {
        Professor.department = department;
    }

    public List<AcademicField> getFields() {
        return fields;
    }
}


