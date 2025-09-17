import java.util.Scanner;

public class A
{
    int AccNo;

    float balance;
    float Updated_balance;
    A(int AccNo,float balance)
    {
        this.AccNo=AccNo;
        this.balance=balance;
    }
    void deposit(int amount)
    {
        Updated_balance=amount+balance;
    }
    A passing_to_obj2()
    {
        return this;
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
        A obj1=new A(AccNo,balance);
        A obj2=obj1.passing_to_obj2();
        obj2.deposit(7000);
        obj2.display();
    }
}
