/**
 * Пусть дан список сотрудников:
 * Иван Иванов
 * Светлана Петрова
 * Кристина Белова
 * Анна Мусина
 * Анна Крутова
 * Иван Юрин
 * Петр Лыков
 * Павел Чернов
 * Петр Чернышов
 * Мария Федорова
 * Марина Светлова
 * Мария Савина
 * Мария Рыкова
 * Марина Лугова
 * Анна Владимирова
 * Иван Мечников
 * Петр Петин
 * Иван Ежов
 * Написать программу, 
 * которая найдет и выведет повторяющиеся имена
 * с количеством повторений. 
 * Отсортировать по убыванию популярности.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

import java.util.Collections;
import static java.util.stream.Collectors.*;

public class task02 {
    public static Map<String, Integer> addMap(Map <String, Integer> usMap, String[] namStr) {
        for(int i = 0; i< namStr.length; i++){
            int size = 1;
            String[] temp = namStr[i].split(" ");
            if(! usMap.containsKey(temp[0])){
                usMap.putIfAbsent(temp[0], size);
            }
            else{
                size = usMap.get(temp[0]) + 1;
                usMap.put(temp[0], size);
            }
        }
        return usMap;        
    }
 
    public static void main(String[] args){
        String[] str = {"Иван Иванов", "Светлана Петрова", "Кристина Белова",
            "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
            "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
            "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
            "Петр Петин", "Иван Ежов"};
        
        Map <String, Integer> usMap = new HashMap<>();
        addMap(usMap, str);
        System.out.println(usMap);
        LinkedHashMap<String, Integer> sortMap = new LinkedHashMap<>();
        sortMap = usMap
             .entrySet()
             .stream()
             .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
             .collect(
                 toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                     LinkedHashMap::new));
        System.out.println(sortMap);      
    }
    
}
