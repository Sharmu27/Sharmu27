import java.util.Scanner;
class Compare
{
   public static void main(String[] args)
   {
      System.out.println("Sharmu");
      System.out.println(2024503055);
      String first,second;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first string(format: xx.xx.xx)");
      first= sc.nextLine();
      System.out.println("enter the second string(format: xx.xx.xx)");
      second=sc.nextLine();
      String[] firstParts=first.split("\\.");
      String[] secondParts=second.split("\\.");
      Boolean areEqual=true;
      for(int i=0;i<3;i++)
      {
           int a=Integer.parseInt(firstParts[i]);
           int b=Integer.parseInt(secondParts[i]);
           
          if(a>b)
          {
            System.out.println(first+"is greater than"+second);
            areEqual=false;
            break;
          }
           if(b>a)
          {
            System.out.println(second+"is greater than"+first);
            areEqual=false;
            break;
           }
           if(areEqual)
          {
            System.out.println(first+"is equal to"+second);
           }
      }
  }
}


