public class Bank {
    final private Integer accountNumber;

    private AccountTypeEnum.AccountType myAccountType;
    String accountHolderName;
    private double accountBalance;

    public Bank(Integer accountNumber, int accountType, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        if(accountType==1)
        {
            this.myAccountType = AccountTypeEnum.AccountType.Saving;
        }
        else if (accountType==2) {
            this.myAccountType = AccountTypeEnum.AccountType.Current;
        }
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }
    void getAccountBalance()
    {
        System.out.println("Account balance:"+ accountBalance);
    }
    void getAccountDetails()
    {
        System.out.println("Name:"+accountHolderName+ "\nAccount Number:"+ accountNumber +"\nAccount Type:"+myAccountType+ "\nAccount Balance:"+accountBalance );
    }
    void deposite(double amount) throws MoneyCannotBeNegative
    {
        if(amount>=0)
        {
            accountBalance+=amount;
            System.out.println("Amount Successfully deposited available balance :"+ accountBalance);
        }
        else
        {
            throw new MoneyCannotBeNegative();
        }

    }
    void withdraw(double amount) throws LowBalanceException
    {
        if(amount>=0)
        {
            if(accountBalance>=amount)
            {
                accountBalance-=amount;
                System.out.println("Amount Successfully withdrawn available balance :"+ accountBalance);
            }
            else
            {
                throw new LowBalanceException();
            }
        }
        else
        {
            System.out.println("Amount cant be negative");
        }

    }
}

