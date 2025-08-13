import java.util.Scanner;
class Team
{
   public static void main(String[] args)
   {
      System.out.println("Sharmu");
      System.out.println(2024503055);
      int runs;
      short fouls;
      boolean win_status;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the runs:");
      runs=sc.nextInt();
      System.out.println("enter the fouls:");
      fouls=sc.nextShort();
      if(runs>=50&&fouls<=5)
      {
         win_status=true;
      }
      else
      {
         win_status=false;
      }
      System.out.println("runs="+runs);
      System.out.println("fouls="+fouls);
      System.out.println("win_status="+win_status);
    }
}