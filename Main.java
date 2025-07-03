import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDAO dao = new UserDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add User\n2. View Users\n3. Update User\n4. Delete User\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    dao.addUser(new User(0, name, email));
                    break;
                case 2:
                    List<User> users = dao.getAllUsers();
                    users.forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = sc.nextLine();
                    dao.updateUser(new User(uid, newName, newEmail));
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt(); sc.nextLine();
                    dao.deleteUser(did);
                    break;
                case 5:
                    sc.close();
                    return;
            }
        }
    }
}