// 1.Create a class to represent the ATM machine.
// 2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
// checking the balance.
// 3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
// checkBalance().
// 4. Create a class to represent the user's bank account, which stores the account balance.
// 5. Connect the ATM class with the user's bank account class to access and modify the account
// balance.
// 6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
// 7. Display appropriate messages to the user based on their chosen options and the success or failure
// of their transactions
package CODSOFT;
import java.util.*;


interface atm1{
        public void Withdraw();
        public void Deposit();
        public void CheckBalance();

        
    }  
public class atm implements atm1   {

        Scanner sc = new Scanner(System.in); 
        double balance = 0;     
        public void Withdraw(){
            System.out.println("withdrawl amount:");
            double wa = sc.nextDouble();
            if (balance > 0 && wa<=balance){  
                balance = balance-wa;
            }
            else{
                System.out.println("insufficent balance");
            }
        }
        public void Deposit(){
            System.out.println("deposit amount:");
            double da = sc.nextDouble();
            balance = balance + da;
        }
        public void CheckBalance(){
            System.out.println("your available balance is :" + balance);
        }
              
}
class account{
    
    Random r = new Random(1000000);
    double ac = r.nextDouble();
    
    public static void main(String[] args) {
        atm user = new atm();
        Scanner sc = new Scanner(System.in); 
        char b = 'y';
        while( b == 'y'){
        System.out.println("press 1 to withdraw");
        System.out.println("press 2 to deposit");
        System.out.println("press 3 to check balance");
        System.out.println("enter your choice:");
        int a = sc.nextInt();
        
        switch (a) {
            case 1:
            user.Withdraw();

                
                break;
            case 2:
            user.Deposit();
            break;

            case 3:
            user.CheckBalance();
            break;
        
            default:
            System.out.println("invalid");
                break;
        }
        System.out.println("do u want to continue:");
        b = sc.next().charAt(0);
    }
        sc.close();
    }

}
