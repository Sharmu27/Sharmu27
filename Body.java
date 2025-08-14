import java.util.Scanner;
class Body
{
  public static void main(String[] args)
  {
    System.out.println("Sharmu");
    System.out.println(2024503055);
    double height;
    double weight;
    boolean BMI_status;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the height(in mtrs)");
    height=sc.nextDouble();
    System.out.println("enter the weight(in kg)");
    weight=sc.nextDouble();
    double BMI=weight/(height*height);
    if(BMI>=18.5&&BMI<25)
    {
      BMI_status=true;
    }
    else
    {
      BMI_status=false;
    } 
    System.out.println("height="+height);
    System.out.println("weight="+weight);
    System.out.println("BMI="+BMI);
    if(BMI_status==true)
    {
      System.out.println("BMI_status is normal");
    }
    else
    {
      System.out.println("BMI_status is abnormal");
    }
  }
}



    
    

