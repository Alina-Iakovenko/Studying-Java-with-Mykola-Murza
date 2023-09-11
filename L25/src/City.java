/*1) Створити клас City, який містить поле name та
колекцію List districts з об’єктами іншого класу District (з англ. район).
 Створити вкладений клас District, який містить поле назву
 та колекцію рядків List з назвою streets.
 Таким чином буде структура даних з
 1 вкладеним класом, на верхньому рівні - місто з назвою та колекцією районів,
 а на нижньому - райони з назвою та колекцією вулиць.

        2) Створити усі потрібні конструкторі.
        Заповнити довільними значеннями таку структуру даних.
        Наприклад, місто Київ містить райони,
        а саме - (“Шевченківський” з вулицями А, “Дарницький” з вулицями В). */

import java.util.ArrayList;
import java.util.List;

public class City { //Створити клас City
    String name; //який містить поле name
    static List<String> districts; //колекцію List districts

    public City(String name, List<String> districts )
    {
        this.name = name;
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "City " +
                name;
    }

    //з об’єктами іншого класу District (з англ. район).
    public static class District {  //Створити вкладений клас District

        String district; //який містить поле назву
        List <String> street = new ArrayList<>(); //та колекцію рядків List з назвою streets.

        public District(String district, List<String> street) {
            this.district = district;
            this.street= street;
        }

        @Override
        public String toString() {
            return "District "+ district;
        }
    }
}
