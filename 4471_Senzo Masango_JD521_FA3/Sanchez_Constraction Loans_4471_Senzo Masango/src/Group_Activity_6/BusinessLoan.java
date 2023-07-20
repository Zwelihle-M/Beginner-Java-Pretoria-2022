package Group_Activity_6;

public class BusinessLoan extends Loan { //constructor that sets the interest rate to 1% more than current prime interest rate
    BusinessLoan(
            String loanNum, 
            String lastName,
            double loanAmt, 
            int term, 
            double primeIntRate) 
    {
            super(loanNum, lastName, loanAmt, term);
            super.interestRate = 0.01 / (primeIntRate / 100);
    }
}

