package ATM;

import java.util.Scanner;

public class ATM {
    float Balance;
    int PIN=5674;

    ATM()
    {
        this.Balance=Balance;
        this.PIN=PIN;
    }

    public void checkpin(){
        System.out.println("Enter your pin: ");
        Scanner ip=new Scanner(System.in);
        int enteredpin= ip.nextInt();
        if(enteredpin==PIN)
        {
            menu();
        }
        else
        {
            System.out.println("Enter a valid pin");
        }
    }

    public void menu()
    {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner ip=new Scanner(System.in);
        int opt = ip.nextInt();

        if(opt==1)
        {
            checkBalance();
        }
        else if (opt==2)
        {
            withdrawMoney();
        }
        else if(opt==3)
        {
            depositMoney();
        }
        else if(opt==4)
        {
            return;
        }
        else
        {
            System.out.println("Enter a valid choice");
            menu();
        }

    }

    public void checkBalance()
    {
        System.out.println("Balance: "+ Balance);
        menu();
    }

    public void withdrawMoney()
    {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner ip=new Scanner(System.in);
        float amount= ip.nextFloat();
        if(amount>Balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            Balance=Balance-amount;
            System.out.println("Money Withdrawl Successful");
        }
        menu();
    }
    public void depositMoney()
    {
        System.out.println("Enter the Amount: ");
        Scanner ip=new Scanner(System.in);
        float amount= ip.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}