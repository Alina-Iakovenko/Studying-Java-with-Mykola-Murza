import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Professor professorAlex = new Professor("Alex", "Brown", 11, AcademicStatus.DOCENT, new ArrayList<>());
        professorAlex.getFields().add(StaticFields.MATH);
        System.out.println(professorAlex.getFields());
        String mail = professorAlex.mail("Hello, students!");
        System.out.println(mail);

        Student studentNick = new Student("Nick", "Black", 311, 3);
        mail = studentNick.mail("Hello, professor Alex!");
        System.out.println(mail);

        studentNick.setGroup(56);
        System.out.println(studentNick.getGroup());

        mail = professorAlex.mail("Who are you?", "Black");
        System.out.println(mail);

        mail = professorAlex.mail(5, "Black");
        System.out.println(mail);

        final Professor profMike = new Professor("Mike", "Green", 9, AcademicStatus.PROFESSOR, new ArrayList<>());
        profMike.setExperience(profMike.getExperience() + 1);
        System.out.println(profMike.getExperience());

        System.out.println(User.userCount);




    }
}