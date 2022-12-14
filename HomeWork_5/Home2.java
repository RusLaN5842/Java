package HomeWork_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class Home2 {
    public static void main(String[] args) {
        String[] str = { "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов" };
        ArrayList<String> staff = new ArrayList<>(Arrays.asList(str));
        TreeMap<Integer, String> names = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < staff.size(); i++) {
            String[] FIO = staff.get(i).split(" ");
            String name = FIO[0];
            int count = 0;
            for (int j = 0; j < staff.size(); j++) {
                String[] FIO1 = staff.get(j).split(" ");
                String name1 = FIO1[0];
                if (name.equals(name1)) {
                    count++;
                }
            }
            if (!names.containsValue(name)) {
                names.put(count, name);
            }
        }
        for (var el : names.entrySet()) {
            System.out.printf("Количество повторений : %s Имена: %s", el.getKey(), el.getValue() + "\n");
        }
    }
}