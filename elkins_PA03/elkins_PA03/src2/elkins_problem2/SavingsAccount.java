package elkins_problem2;

public class SavingsAccount {

   private static double annualInterestRate=0;
   private double savingsBalance;

   public SavingsAccount(double amt) {
       if(amt<0) {
           this.savingsBalance=0;
       }
       else {
           this.savingsBalance=amt;
       }
   }
   //Calculate monthly interest rate
   public void calculateMonthlyInterest() {
       savingsBalance+=savingsBalance*(annualInterestRate/(12*100));
   }
   //Modify the interest rate
   public void modifyInterestRate(double ir) {
       if(ir<0) {
           SavingsAccount.annualInterestRate=0;
       }
       else {
           SavingsAccount.annualInterestRate=ir;
       }
   }

   public double getSavingsBalance() {
       return savingsBalance;
   }
}