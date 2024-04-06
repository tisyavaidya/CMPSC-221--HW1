/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author tisyavaidya
 */
//class LoanAccount
public class LoanAccount 
{

    private static double annualInterestRate; 
    private final double principal; //private instance variable principal
    
    //calculating monthly payment
    public double calculateMonthlyPayment(int numberOfPayments)
    {
        double monthlyInterest;
        monthlyInterest= annualInterestRate/12;
        double monthlyPayment= principal*(monthlyInterest/(1-Math.pow(1+monthlyInterest,-numberOfPayments)));
        return monthlyPayment;
    }
    
    //setting initial loan amount(Principal) for a new loan through the constructor
    public LoanAccount(double Principal)
    {
        principal= Principal;
    }
    
    //setting annual interest rate to new value
    public static void setAnnualInterestRate(double AnnualRate)
    {
        annualInterestRate= AnnualRate;
    }
    
       
    public static void main(String[] args) 
    {
        double p1=5000; //principle amount1
        LoanAccount loan1= new LoanAccount(p1); //instantiating LoanAccount object 1
        
        double p2=31000; //principle amount2
        LoanAccount loan2= new LoanAccount(p2); //instantiating LoanAccount object 2
        
        setAnnualInterestRate(0.01);  //setting annual interest rate to 1%
        System.out.printf("\nMonthly payment for loan1 of $%.2f and loan2 $%.2f for 3,5, and 6 year loans at 1%% interest.", p1,p2);
        System.out.println("\nLoan\t3 years\t5 years\t6 years");
        System.out.printf("Loan1\t%.2f\t%.2f\t%.2f", loan1.calculateMonthlyPayment(3*12),loan1.calculateMonthlyPayment(5*12),loan1.calculateMonthlyPayment(6*12));
        System.out.printf("\nLoan2\t%.2f\t%.2f\t%.2f", loan2.calculateMonthlyPayment(3*12),loan2.calculateMonthlyPayment(5*12),loan2.calculateMonthlyPayment(6*12));
     
        setAnnualInterestRate(0.05);  //setting annual interest rate to 5%
        System.out.printf("\nMonthly payment for loan1 of $%.2f and loan2 $%.2f for 3,5, and 6 year loans at 5%% interest.", p1,p2);
        System.out.println("\nLoan\t3 years\t5 years\t6 years");
        System.out.printf("Loan1\t%.2f\t%.2f\t%.2f", loan1.calculateMonthlyPayment(3*12),loan1.calculateMonthlyPayment(5*12),loan1.calculateMonthlyPayment(6*12));
        System.out.printf("\nLoan2\t%.2f\t%.2f\t%.2f", loan2.calculateMonthlyPayment(3*12),loan2.calculateMonthlyPayment(5*12),loan2.calculateMonthlyPayment(6*12));
     
    }
    
    
}
