import java.util.*;

public class PhoneBook {
    Map<String, ArrayList<String>> treeMap = new TreeMap<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if (phone.matches("\\d+") && name.matches("[A-Яа-яёЁ]+")) {
            for(String key : treeMap.keySet()) {
                List<String> strings = treeMap.get(key);
                if(strings.contains(phone)) {
                    strings.remove(phone);
                }
            }
            if (treeMap.containsKey(name)) {
                treeMap.get(name).add(phone);
            } else {
                treeMap.put(name, new ArrayList<>(Arrays.asList(phone)));
            }
        } else {
            System.out.println("Неверный формат ввода!");
        }
    }

    public String getNameByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
         for(String key : treeMap.keySet()) {
             if(treeMap.get(key).contains(phone)) {
                 return key + " - " + phone;
             }
         }
         return "";
    }

    public Set<String> getPhonesByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
         if(treeMap.containsKey(name)) {
             fillUpContactList(name, treeSet);
         }
        return treeSet;
    }

    private void fillUpContactList(String name, TreeSet<String> treeSet) {
        for(String phone : treeMap.get(name)){
            treeSet.add(name + " - " + phone);
        }
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        for(String key : treeMap.keySet()) {
            fillUpContactList(key, treeSet);
        }
        return treeSet;
    }

}