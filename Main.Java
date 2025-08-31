import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList list = new ToDoList();
        int choice;

        do {
            System.out.println("\n1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. View all tasks");
            System.out.println("4. Search task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("\nEnter task title: ");
                    String addTitle = scanner.nextLine();
                    list.addTask(addTitle);
                    break;

                case 2:
                    System.out.print("\nEnter task title to delete: ");
                    String deleteTitle = scanner.nextLine();
                    list.deleteTask(deleteTitle);
                    break;

                case 3:
                    list.printTasks();
                    break;

                case 4:
                    System.out.print("\nEnter task title to search: ");
                    String searchTitle = scanner.nextLine();
                    if (list.contains(searchTitle)) {
                        System.out.println("\nTask found.");
                    } else {
                        System.out.println("\nTask not found.");
                    }
                    break;

                case 5:
                    System.out.println("\nExiting...");
                    break;

                default:
                    System.out.println("\nInvalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
