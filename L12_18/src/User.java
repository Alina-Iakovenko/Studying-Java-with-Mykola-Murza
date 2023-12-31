public abstract class User {
    private String name;
    private String surname;
    static int userCount = 0;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        userCount++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    abstract String mail(String message);


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}


