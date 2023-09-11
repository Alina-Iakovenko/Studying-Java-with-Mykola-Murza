public final class Student extends User {

    private int group;
    private int year;

    Student(String name, String surname, int group, int year) {
        super (name, surname);
        this.group = group;
        this.year = year;
    }



    @Override
    public String getName() {
        System.out.print("Student`s name is: ");
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        System.out.println("Student added new info about name.");
    }
    @Override
    public String getSurname() {
        System.out.print("Student`s surname is: ");
        return super.getSurname().charAt(0) +".";
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
        System.out.println("Student added new info about surname.");
    }

    public int getGroup() {
        System.out.print("Group number is: ");
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
        System.out.println("Student added new info about group #.");
    }

    public int getYear() {
        System.out.print("Year of Study is: ");
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        System.out.println("Student added new info about year of study.");
    }
    @Override
    String mail(String message) {
        return "Student " + super.getName() + ": " + message;
    }


}
