package HomeWork_2.Home1;

import java.util.HashMap;
import java.util.Map;

public class Home1 {
    public static void main(String[] args) {
        Map<String, String> params1 = new HashMap<>();
        // HashMap(Map<? extends K,? extends V> m)
        // Создает новую карту хэш-карты с теми же сопоставлениями, что и указанная
        // карта.
        params1.put("name", "Ivanov");
        params1.put("country", "Russia");
        params1.put("city", "Moscow");
        params1.put("age", null);
        // put(K key, V value)
        // Связывает указанное значение с указанным ключом на этой карте.
        System.out.println(getA(params1)); // Вывод на экран метода
    }

    public static String getA(Map<String, String> Serch) // метод поиска
    // HashMap(Map<? extends K,? extends V> m)
    //// Создает новую карту хэш-карты с теми же сопоставлениями, что и указанная
    // карта.
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, String> P : Serch.entrySet()) // Метод возвращает набор, имеющий те же элементы, что и
                                                             // хэш-карта.
        {
            if (P.getValue() != null) {
                s.append(P.getKey() + " = '" + P.getValue() + "' and ");
            }
        }
        s.delete(s.toString().length() - 5, s.toString().length());
        return s.toString();
    }

}