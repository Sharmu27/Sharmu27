import java.util.Arrays;
import java.util.Scanner;
class Anagram
{
  public static void main(String[] args)
  {
    System.out.println("Sharmu");
    System.out.println(2024503055);
    String str1,str2;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string 1");
    System.out.println("enter the string 2");
    str1=sc.nextLine();
    str2=sc.nextLine();
    str1=str1.toLowerCase().replaceAll("\\s"," ");
    str2=str2.toLowerCase().replaceAll("\\s"," ");
    if(str1.length()!=str2.length())
    {
      System.out.println("Not an Anagram");
    }
    else
    {
          char[] arr1=str1.toCharArray();
          char[] arr2=str2.toCharArray();
          // sort both arrays
          Arrays.sort(arr1);
          Arrays.sort(arr2);
          if(Arrays.equals(arr1,arr2))
          {
            System.out.println("Anagram");
          }
          else
          {
            System.out.println("Not an Anagram");
          }
     }
    }
}
          
    
    