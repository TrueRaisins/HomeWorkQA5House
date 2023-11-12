package House;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> residents = new HashMap<>();

        // Заполняем HashMap жильцами
        residents.put("Филиппов Андрей", 11);
        residents.put("Петрс Артур", 32);
        residents.put("Богомолов Александр", 36);
        residents.put("Пушин Кирилл", 15);
        residents.put("Сайтеев Анатолий", 64);

        List<String> adultResidents = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : residents.entrySet()) {
            if (entry.getValue() > 18) {
                adultResidents.add(entry.getKey());
            }
        }

        adultResidents.sort(String::compareTo);

        for (String resident : adultResidents) {
            System.out.println(resident);
        }
    }
}