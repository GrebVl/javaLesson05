/**
 * Реализуйте структуру телефонной книги с помощью HashMap,
 * учитывая, что 1 человек может иметь несколько телефонов.
 */

 /**
  * task01
  */
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

 public class task01 {
    public static Map<String, LinkedList<String>> addMap(Map <String, LinkedList<String>> usMap, String namStr, String numStr) {
        LinkedList<String> lst = new LinkedList<>();
        if(! usMap.containsKey(namStr)){
            lst.add(numStr);
            usMap.putIfAbsent(namStr, lst);
        }
        else{
            lst = usMap.get(namStr);
            lst.add(numStr);
            usMap.putIfAbsent(namStr, lst);
        }
        return usMap;        
    }
 
    public static void main(String[] args){
        Map <String, LinkedList<String>> phonBook = new HashMap<>();
        addMap(phonBook, "Светлана Петрова", "+7-996-886-44-33");
        addMap(phonBook, "Петр Лыков", "+7-999-888-44-33");
        addMap(phonBook, "Светлана Петрова", "+7-997-775-33-22");
        System.out.println(phonBook);            
    }
 }