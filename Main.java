import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             System.out.println("Enter the number of the new account you want to create: ");
             int account = input.nextInt();
             Account[] accounts = new Account[account];
             for(int i=0; i<account; i++) {
                   accounts[i] = new Account();
                   System.out.println(accounts[i].toString());
             }
             boolean a = true;
             do {
                   System.out.println("There are "+accounts.length+" accounts");
                   System.out.println("Which account do you want to log in from: ");
                   int number = input.nextInt();
                   input.nextLine();
                   Atm atm = new Atm();
                   atm.work(accounts[number-1]);
                   System.out.println("Do you want to continue with another account: ");
                   String word = input.nextLine();
                   if(word.equals("Yes")){
                         a = true;
                   }
                   else {
                         a = false;
                   }
             }
             while(a);
      }
}
