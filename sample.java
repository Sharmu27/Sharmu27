import java.util.Scanner;
public class sample {
    int AccNo;
    float balance;
    float Updated_balance;
    sample()
    {
       AccNo=0;
       balance=0;
    }
   sample(int x)
    {
        AccNo=x;
        balance=0;
    }
    sample(int x,float y)
    {
        AccNo=x;
        balance=y;
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
        sample obj=new sample(AccNo,balance);
        obj.deposit();
        obj.display();
    }
}
