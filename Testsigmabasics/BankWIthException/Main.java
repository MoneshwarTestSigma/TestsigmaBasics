import java.util.*;
public class Main {
     Scanner scanner =new Scanner(System.in);
     HashMap<Integer,Bank> bankHashMap =new HashMap<>();
     ArrayList<Bank> list=new ArrayList<>();
     void createAccount()
    {
        System.out.println("Enter AccountNumber");
        Integer accountNumber= scanner.nextInt();
        if(bankHashMap.containsKey(accountNumber))
        {
            System.out.println("Account Number already exist try again");
            createAccount();
            return;
        }
        else
        {
            System.out.println("Enter Account Name:");
            scanner.nextLine();
            String name= scanner.nextLine();
            System.out.println("Enter Account Type:\n" +
                    "1.Savings\n" +
                    "2.Current");
            int accountType= scanner.nextInt();
            double accountBalance;
            while(true)
            {
                System.out.println("Enter Initial account Balance:");
                accountBalance= scanner.nextDouble();
                if(accountBalance>=0) {
                    break;
                }
                else{
                    System.out.println("Balance cant be negative Please Enter again");
                }
            }
            Bank obj=new Bank(accountNumber,accountType,name,accountBalance);
            bankHashMap.put(accountNumber,obj);
        }

    }
     void useAccount()
    {
        System.out.println("Enter Account Number");
        int accountNumber= scanner.nextInt();
        if(bankHashMap.containsKey(accountNumber))
        {
            Bank currentBank= bankHashMap.get(accountNumber);
            System.out.println("Welcome "+currentBank.accountHolderName);
            while(true)
            {
                System.out.println("Enter Option:\n" +
                        "1.Display  Balance:\n" +
                        "2.Display Account Details\n" +
                        "3.Deposite\n" +
                        "4.Withdraw\n" +
                        "5.Exit");
                int selectedOption = scanner.nextInt();
                switch (selectedOption)
                {
                    case 1:
                        currentBank.getAccountBalance();
                        break;
                    case 2:
                        currentBank.getAccountDetails();
                        break;
                    case 3:
                        System.out.println("Enter Amount to deposite");
                        double depositeAmount= scanner.nextDouble();
                        try
                        {
                            currentBank.deposite(depositeAmount);
                        }
                        catch (MoneyCannotBeNegative e)
                        {
                            System.out.println("Error Occured: "+e);
                        }

                        break;
                    case 4:
                        System.out.println("Enter Amount to withdraw");
                        double withdrawAmount= scanner.nextDouble();
                        try
                        {
                            currentBank.withdraw(withdrawAmount);
                        }
                        catch (LowBalanceException e)
                        {
                            System.out.println("Error Occured:"+e);
                        }

                        break;
                    default:
                        return;
                }
            }

        }

        else
        {
            System.out.println("Account Doesn't exist");
        }
    }
    public static void main(String[] args) {
         Main obj=new Main();
        while(true)
        {
            System.out.println("Welcome!!\n" +
                    "1.Create account\n" +
                    "2.Use account\n" +
                    "3.Exit");
            int selectedOption= obj.scanner.nextInt();
            switch (selectedOption) {
                case 1:
                    obj.createAccount();
                    break;
                case 2:
                    obj.useAccount();
                    break;
                default:
                    System.out.println("Exiting Thank you!!");
                    return;
            }
        }
    }
}