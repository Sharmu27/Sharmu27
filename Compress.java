import java.lang.String;
import java.util.Scanner;
class Compress
{
  public static String compressString(String input)
  {
    if(input==null||input.length()<=1)
    {
       return input;
    }
    StringBuilder sb=new StringBuilder();
    int i=0;
    while(i<input.length())
    {
      char currentchar=input.charAt(i);
      int count=0;
      while(i<input.length()&& input.charAt(i)==currentchar)
      {
         count++;
         i++;
      }
      sb.append(currentchar).append(count);
    }
    return sb.length()<input.length() ? sb.toString():input;
}
public static void main(String[] args)
{
   System.out.println("Sharmu");
   System.out.println(2024503055);
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the string");
   String input=sc.nextLine();
   System.out.println("Compressed String"+compressString(input));
 }
}