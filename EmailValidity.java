import java.util.Scanner;
class Emailvalidity
{
   public static void main(String[] args)
   {
       System.out.println("Sharmu");
       System.out.println(2024503055);
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the mail ID");
       String email=sc.nextLine();
       if(isValidEmail(email))
       {
       String[]parts=email.split("@");
       String Username=parts[0];
       String Domain=parts[1];
       System.out.println("Valid Email");
       System.out.println("Username:"+Username);
       System.out.println("Domain:"+Domain);
       }
       else
       {
         System.out.println("Invalid Email");
       }
    }
       public static boolean isValidEmail(String email)
       {
         if(email.chars().filter(ch -> ch == '@').count()!=1)
           return false;
          String[]parts=email.split("@");       
          if(parts.length!=2)
           return false;
         String Username=parts[0];
         String Domain=parts[1];
         if(Username.length()>25)
         {
           return false;
         }
         if(!Username.matches("[a-zA-Z0-9_+\\-]+"))
         {
           return false;
          }
         if(!(Domain.endsWith(".com") || Domain.endsWith(".in") || Domain.endsWith(".edu")))
         {
            return false;
         }
         return true;
     }
}