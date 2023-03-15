public class CreditDebit {
    private double accountBalance;
    public CreditDebit(double accountBalance) {
        this.accountBalance = accountBalance;
    }
     synchronized void  deposite(double amount)  {
        if(amount>=0)
        {
            accountBalance+=amount;
            System.out.println("Amount Successfully deposited available balance :"+ accountBalance);
        }
        else
        {
            System.out.println("Amount cant be negative");
        }

    }
     synchronized void withdraw(double amount) {

        if(amount>=0)
        {
            if(accountBalance>=amount)
            {
                accountBalance-=amount;
                System.out.println("Amount Successfully withdrawn available balance :"+ accountBalance);
            }
            else
            {
                System.out.println("Insufficient balance!! available balance :"+ accountBalance);
            }
        }
        else
        {
            System.out.println("Amount cant be negative");
        }
    }
}
