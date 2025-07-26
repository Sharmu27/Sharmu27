import java.util.Scanner;
class Calculator
{
   public static void main(String[] args)
   {
      System.out.println("Sharmu");
      System.out.println(2024503055);
      int a,b;
      char operator;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the integers:");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("enter the operator:");
      operator=sc.next().charAt(0);
      if(operator=='+')
      {
        int sum=0;
        sum=a+b;
        System.out.println("Sum="+sum);
      }
      if(operator=='-')
      {
        int diff=0;
        diff=a-b;
        System.out.println("diff="+diff);
      }
      if(operator=='*')
      {
        int prod=0;
        prod=a*b;
        System.out.println("product="+prod);
      }
      if(operator=='/')
      {
        int division=0;
        division=a/b;
        System.out.println("division="+division);
      }
   }
}