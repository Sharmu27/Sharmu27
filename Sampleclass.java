import java.util.Scanner;
public class Sampleclass{
    int AccNo;
    float balance;
    float Updated_balance;
    Sampleclass()
    {
       this.AccNo=0;
       this.balance=0;
    }
   Sampleclass(int AccNo)
    {
       this.AccNo=AccNo;
       this.balance=0;
    }
    Sampleclass(int AccNo,float balance)
    {
        this.AccNo=AccNo;
        this.balance=balance;
    }
    void deposit()
    {
        int amount=3000;
        Updated_balance=amount+balance;
    }
    void display()
    {
        System.out.println("Account number="+AccNo);
        System.out.println("balance="+balance);
        System.out.println("Updated balance="+Updated_balance);
    }
    public static void main(String[] args)
    {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the account number");
        int AccNo=sc.nextInt();
        System.out.println("enter the balance");
        float balance=sc.nextFloat();
        Sampleclass obj=new Sampleclass(AccNo,balance);
        obj.deposit();
        obj.display();
    }
}
