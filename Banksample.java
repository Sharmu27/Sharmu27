
public class Banksample
{
    static int totalAccounts=0;
    int AccNo;
    float balance;
    float Updated_balance;
    Banksample(int AccNo,float balance)
    {
        this.AccNo=AccNo;
        this.balance=balance;
        totalAccounts++;
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
    public static void showtotalAccounts()
    {
      System.out.println("total Accounts created:"+totalAccounts);
    }
    public static void main(String[] args)
    {
        System.out.println("Sharmu");
        System.out.println(2024503055);
         Banksample obj1=new Banksample(909324,8000);
         Banksample obj2=new Banksample(237658,9000);
        obj1.deposit();
        obj1.display();
        obj2.deposit();
        obj2.display();
        Banksample.showtotalAccounts();
    }
}
