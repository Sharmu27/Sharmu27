import java.util.Scanner;
 class Counter 
{
    public static void main(String[] args) 
   {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        Scanner sc = new Scanner(System.in);
        int failCount = 0;
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Enter username: ");
            String username = sc.nextLine();
            System.out.println("Enter password: ");
            String password = sc.nextLine();
            if (!username.equals("admin") && !password.equals("1234"))
            {
                failCount++;
                System.out.println("Login failed. Fail count: " + failCount);
            }
            else 
            {
                System.out.println("Login successful.");
            }
        }
    }
}
