import java.util.Scanner;

public class Account {
      
      private String password;
      private int balance;
      private String user_name;
      private int id_no;
      private String account_no;
      private int numberOfAccount = 1000; 
      private int PasswordLength = 4;
      private double InterestRate = 3.5;
      
      public Account() {
             Scanner input = new Scanner(System.in);
             System.out.println("Enter the balance: ");
             this.balance = input.nextInt();
             
             input.nextLine();
             System.out.println("Enter the user name: ");
             this.user_name = input.nextLine();
             
             System.out.println("Enter the identification number: ");
             this.id_no = input.nextInt();
             
             this.password = DefaultPassword(PasswordLength);
             System.out.println("Your password is: "+this.password);
             
             set_Accountno();
      }
      private void set_Accountno() {
             String id = Integer.toString(id_no);
             String nOA = Integer.toString(numberOfAccount);
             this.account_no = id.substring(0,3) + nOA.substring(0,2);
      }
      private String DefaultPassword(int length) {
             String Set = "0123456789";
             char[] password = new char[length];
             boolean a = true;
             while(a) {
                   for(int i=0; i<length; i++) {
                         int rand = (int) (Math.random()*Set.length());
                         password[i] = Set.charAt(rand);
                         if(password[0]!='0') {
                          if(password[0]!=password[1]&&password[1]!=password[2]&&password[2]!=password[3]) {
                                        a = false;
                                }
                         }
                   }
             }
             return new String(password);
      }         
      public void NewPassword() {
             System.out.println("The password must consist of numbers 0-9.");
             System.out.println("The same number cannot appear consecutively.");
             System.out.println("The first number cannot be zero.");
             Scanner input = new Scanner(System.in);
             char[] password = new char[4];
             boolean a = true;
             while (a) {
                   for(int i=0;i<4;i++) {
                         password[i] = input.next().charAt(0);
                   }
                   if(password[0]!='0') {
                    if(password[0]!=password[1]&&password[1]!=password[2]&&password[2]!=password[3]) {
                                        a = false;
                         }
                   }
             }
             
             this.password = new String(password);
             System.out.println("New password: "+this.password );
      }
      public void interestDetermination(int amount, int month) {
             double net_money = amount;
             for(int i=0;i<month;i++) {
                   net_money = net_money + net_money*(3.5/100);
             }
             System.out.println("The net money you will get after "+month+" is "+net_money);
      }
      public String getUser_name() {
             return user_name;
      }
      public int getBalance() {
             return balance;
      }
      public String getPassword() {
             return password;
      }
      public void deposit_money(int amount) {
             balance += amount;
             System.out.println("New balance: "+ balance);
      }
      public void withdraw_money(int amount) {
             if (balance - amount < 0) {
                   System.out.println("You do not have enough money");
             }
             else {
                   balance -= amount;
                   System.out.println("New Balance: "+balance);
             }
      }
      public String toString() {
             return "User name: "+user_name+
                          " Password: "+password+
                          " Balance: "+balance+
                          " İdentification number: "+id_no+
                          " Account number: "+account_no;
      }
}
