import java.util.Scanner;
class Temperature
{
   public static void main(String[] args)
   {
     System.out.println("Sharmu");
     System.out.println(2024503055);
     short celcius;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the temp(in celcius):");
     celcius=sc.nextShort();
     System.out.println("celcius= "+celcius);
     double fahrenheit;
     fahrenheit=(celcius*9/5)+32;
     System.out.println("fahrenheit="+fahrenheit);
     Boolean temp_status;
     if(fahrenheit>100)
     {
       temp_status=true;
     }
     else
     {
       temp_status=false;
     }
     System.out.println("temp_status="+temp_status);
     if(temp_status==true)
     {
       System.out.println("temperature is hot");
     }
     else
     {
       System.out.println("temperature is normal");
     }
  }
}