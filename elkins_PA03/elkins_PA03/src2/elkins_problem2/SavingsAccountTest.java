package elkins_problem2;

public class SavingsAccountTest {

   public static void main(String[] args) {
       //Instantiate two SavingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively.
       SavingsAccount saver1=new SavingsAccount(2000);
       SavingsAccount saver2=new SavingsAccount(3000);
       //Set the variable annualInterestRate to 4%
       saver1.modifyInterestRate(4);
       saver2.modifyInterestRate(4);
       //Print out the monthly balances for both saver1 and saver2
       System.out.println("Month     Saver1Balance     Saver2Balanace");
       System.out.println("-------------------------------------------");
       System.out.printf("%-15d%-15.2f%10.2f\n",1,saver1.getSavingsBalance(),saver2.getSavingsBalance());
       for(int i=2;i<=12;i++) {
           saver1.calculateMonthlyInterest();
           saver2.calculateMonthlyInterest();
           System.out.printf("%-15d%-15.2f%10.2f\n",i,saver1.getSavingsBalance(),saver2.getSavingsBalance());
       }
       //Print the monthly balances for both saver1 and saver2, again.
       saver1.modifyInterestRate(5);
       saver2.modifyInterestRate(5);
       //Print the new balances for both saver1 and saver2
       saver1.calculateMonthlyInterest();
       saver2.calculateMonthlyInterest();
       System.out.printf("\nSaver1 Balance = %.2f and Saver2 Balance = %.2f\n",saver1.getSavingsBalance(),saver2.getSavingsBalance());
   }
}