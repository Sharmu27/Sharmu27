public class constructorschain
{

        int AccNo;

        float balance;
        float Updated_balance;
        constructorschain()
        {
            this(2345,2000);
        }
        constructorschain(int AccNo,int balance)
        {
            this.AccNo=AccNo;
            this.balance=balance;
        }
        void deposit(int amount)
        {
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
            constructorschain obj1=new constructorschain();
            obj1.deposit(800);
            obj1.display();

        }
}
