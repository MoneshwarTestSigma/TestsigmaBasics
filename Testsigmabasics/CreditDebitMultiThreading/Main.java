import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        CreditDebit creditDebit=new CreditDebit(20000);
        System.out.println("Enter amount to Debit:");
        double amountToDebit=s.nextDouble();
        System.out.println("Enter amount to Credit");
        double amountToCredit=s.nextDouble();
        new Thread(()->
        {
            creditDebit.withdraw(amountToDebit);
        }).start();

        new Thread(()->
        {
            creditDebit.deposite(amountToCredit);
        }).start();

    }
}