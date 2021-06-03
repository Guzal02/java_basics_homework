import java.util.ArrayList;

public class TodoList {

    ArrayList<String> list = new ArrayList<>();

    public boolean isNonExistentIndex(int index) {
        return index >= list.size();
    }

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        list.add(todo);
        System.out.println("Добавлено дело: " + '"' + todo + '"');
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if(isNonExistentIndex(index)) {
            list.add(todo);
            System.out.println("Добавлено дело: " + '"' + todo + '"' + " под порядковым номером - " + list.indexOf(todo));
        } else {
            list.add(index, todo);
            System.out.println("Добавлено дело: " + '"' + todo + '"' + " под порядковым номером - " + index);
        }
    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения

        if(isNonExistentIndex(index)) {
            System.out.println("Дело под порядковым " + index + " не существует!");
        } else {
            String oldValue = list.get(index);
            list.set(index, todo);
            System.out.println("Дело: " + '"' + oldValue + '"' + " заменено на " + '"' + todo + '"');
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if(isNonExistentIndex(index)) {
            System.out.println("Дело с таким номером не существует!");
        } else {
            String existingMeaning = list.get(index);
            list.remove(index);
            System.out.println("Дело " + '"' + existingMeaning + '"' + " удалено");
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return new ArrayList<>(list);
    }

}