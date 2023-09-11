public sealed class Employee extends User permits Professor, Director {
    private AcademicStatus academicStatus;
    public Employee(String name, String surname, AcademicStatus academicStatus) {
        super(name, surname);
        this.academicStatus = academicStatus;
    }

    public AcademicStatus getAcademicStatus() {
        return academicStatus;
    }

    public void setAcademicStatus(AcademicStatus academicStatus) {
        this.academicStatus = academicStatus;
    }

    @Override
    String mail(String message) {
        return message;
    }
}
