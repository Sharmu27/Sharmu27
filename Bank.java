import java.util.Scanner;
class Bank {
    static int TotalAccount = 0;
    int accountNumber;
    float balance;


    Bank(int accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        TotalAccount++;
    }

    void deposit(int amount) {
        int depositAmount=amount;
        float updatedBalance;
        updatedBalance = balance + depositAmount;
        System.out.println("Account number:" + accountNumber);
        System.out.println("deposited amount=" + depositAmount);
        System.out.println("updatedBalance=" + updatedBalance);
    }

    void display()
 {
                System.out.println("total accounts created:"+Bank.TotalAccount);
    }

    public static void main(String[] args) {

        System.out.println("Sharmu");
        System.out.println(2024503055);
        Scanner sc = new Scanner(System.in);
        Bank[] accounts=new Bank[3];
        for(int i=0;i<3;i++)
        {
         System.out.println("enter the account number");
         int accountNumber = sc.nextInt();
        System.out.println("enter the amount");
        int depositAmount=sc.nextInt();
        System.out.println("enter the balance");
        float balance=sc.nextFloat();
        accounts[i]=new Bank(accountNumber,balance);
        accounts[i].deposit(depositAmount);
        }
        accounts[0].display();
    }
}


