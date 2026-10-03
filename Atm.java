import java.util.Scanner;

public class Atm {
      public void work(Account account) {
             Logn logn = new Logn();
             Scanner input = new Scanner(System.in);
             System.out.println("Welcome to our bank...");
             System.out.println("*****************");
             System.out.println("User Login");
             System.out.println("*****************");
             for(int entery=3; entery>0; ){
                   if (logn.login(account)) {
                         System.out.println("Login successful...");
                         break;
                   }
                   else {
                         System.out.println("Login failed...");
                         entery -= 1;
                         System.out.println("Remaining right of entery :"+entery);
                   }
                   if(entery == 0) {
                         System.out.println("Your access rights have expired...");
                         return;
                   }
             }
             System.out.println("*******************");
             String operations = "1. View Balance\n"
                          +"2. Deposit Money\n"
                          +"3. Withdraw money\n"
                          +"4. Deposit money for interest\n"
                          +"5. Change the password\n"
                          +"To quit press q";
             System.out.println(operations);
             System.out.println("********************");
             boolean a = true;
             while (a) {
                   System.out.println("Select the operation");
                   input.nextLine();
                   String operation = input.nextLine();
                   switch(operation) {
                         case "q":
                                a = false;
                                break;
                         case "1":
                                System.out.println("Balance: " + account.getBalance());
                                break;
                         case "2":
                                System.out.println("The amount you want to deposit: ");
                                int amount = input.nextInt();
                                input.nextLine();
                                account.deposit_money(amount);
                                break;
                         case "3":
                                System.out.println("The amount you want to withdraw: ");
                                int amount1 = input.nextInt();
                                input.nextLine();
                                account.withdraw_money(amount1);
                                break;
                         case "4":
                                System.out.println("How much do you want to deposit: ");
                                int money = input.nextInt();
                                System.out.println("How many months do you want to deposit: ");
                                int month = input.nextInt();
                                account.interestDetermination(money, month);
                                break;
                         case "5":
                                account.NewPassword();
                                break;
                         default:
                                System.out.println("Invalid operation....");
                                break;
                   }
             }
      }
}
