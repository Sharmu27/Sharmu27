import java.util.Scanner;
class WordCount
{
   public static void main(String[] args)
  {
   System.out.println("Sharmu");
   System.out.println(2024503055);
   String str;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the string");
   str=sc.nextLine();
   String[] words=str.split(" ");
   int wordcount=0;
   for(String word:words)
   {
      if(!word.equals(""))
      {
         wordcount++;
      }
   }
     System.out.println("Number of words:"+wordcount);

  }
}
      
   
   
   