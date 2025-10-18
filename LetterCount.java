import java.lang.String;
import java.util.Scanner;
public class LetterCount
{
   public static void main(String[] args)
   {
       System.out.println("Sharmu");
       System.out.println(2024503055);
       String str;
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the string");
       str= sc.nextLine().toLowerCase();
       for(char ch='a';ch<='z';ch++)
       {
           int count=0;
           for(int i=0;i<str.length();i++)
           {
               if(str.charAt(i)==ch)
               {
                   count++;
               }
           }
           if(count>0)
           {
               System.out.println(ch + ":" + count);
           }
       }
   }
}
