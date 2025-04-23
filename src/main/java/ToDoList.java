import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        if (!tasks.contains(task)) {
            tasks.add(task);
            System.out.println("Добавлено!");
        } else {
            System.out.println("Это дело уже существует в списке.");
        }
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список дел пуст.");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void deleteTaskByNumber(int index) {
        if (index > 0 && index <= tasks.size()) {
            tasks.remove(index - 1);
            System.out.println("Удалено!");
        } else {
            System.out.println("Нет дела с таким номером.");
        }
    }

    public boolean deleteTaskByText(String task) {
        if (tasks.remove(task)) {
            System.out.println("Удалено!");
        } else {
            System.out.println("Нет дела с таким названием.");
        }
        return false;
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }
}