package Work28.Task2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class Tester
{


    public static void main(String[] args) {
        System.out.println(createMap());
        System.out.println(getCountTheSameFirstName(createMap(), "Алексей"));
        System.out.println(getCountTheSameLastName(createMap(), "Ро"));

    }
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Копылов","Михаил");
        map.put("Делибалтов","Костас");
        map.put("Бердников","Олег");
        map.put("Охелунджонов","Аман");
        map.put("Артём","Шрам");
        map.put("Иван","Стрюковатый");
        map.put("Старчиков","Владислав");
        map.put("Фролов","Дмитрий");
        map.put("Колядова","Варвара");
        map.put("Кабанова","Виталина");
        return (HashMap<String, String>) map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getValue().equals(name))
                count++;

        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String surname)
    {
        //Напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(surname))
                count++;
        }
        return count;

    }

}
