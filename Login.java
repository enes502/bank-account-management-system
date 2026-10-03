import java.util.Scanner;

public class Login {
      public boolean login(Account account) {
             Scanner input = new Scanner(System.in);
             String user_name;
             String password;
             
             System.out.println("User name: ");
             user_name = input.nextLine();
             System.out.println("Password: ");
             password = input.nextLine();
             boolean login = account.getUser_name().equals(user_name) && account.getPassword().equals(password);
             if (login) {
                   return true;
             }
             else {
                   return false;
             }
      }
}
