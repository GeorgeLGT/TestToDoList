import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        int choice;
        while (true) {
            System.out.println("\nВыберите операцию:");
            System.out.println("0. Выход из программы");
            System.out.println("1. Добавить дело");
            System.out.println("2. Показать дела");
            System.out.println("3. Удалить дело по номеру");
            System.out.println("4. Удалить дело по названию");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Программа завершена.");
                    scanner.close();
                    return;

                case 1:
                    System.out.print("Введите название задачи: ");
                    String taskToAdd = scanner.nextLine();
                    toDoList.addTask(taskToAdd);
                    toDoList.showTasks();
                    break;

                case 2:
                    toDoList.showTasks();
                    break;

                case 3:
                    System.out.print("Введите номер для удаления: ");
                    int numberToDelete = scanner.nextInt();
                    scanner.nextLine();
                    toDoList.deleteTaskByNumber(numberToDelete);
                    toDoList.showTasks();
                    break;

                case 4:
                    System.out.print("Введите задачу для удаления: ");
                    String taskToDelete = scanner.nextLine();
                    toDoList.deleteTaskByText(taskToDelete);
                    toDoList.showTasks();
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
