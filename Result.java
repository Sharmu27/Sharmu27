import java.util.Scanner;
class Result
{
   public static void main(String[] args)
   {
     System.out.println("Sharmu");
     System.out.println(2024503055);
     int[] sub=new int[3];
     int total=0;
     int avg;
     char grade;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the marks for 3 subjects");
     boolean pass_status=true;
     for(int i=0;i<3;i++)
     {
       System.out.println("enter mark for subject"+(i+1)+":");
       sub[i]=sc.nextInt();
       total+=sub[i];
       if(sub[i]<50)
       {
          pass_status=false;
       }
     }
     System.out.println("pass status ="+pass_status);
     System.out.println("total="+total);
     avg=total/3;
     System.out.println("average="+avg);
     if(avg>=90&&avg<=100)
     {
       System.out.println("the grade is 'S'");
      }
      else if(avg>=80&&avg<90)
      {
        System.out.println("the grade is 'A'");
      }
      else if(avg>=70&&avg<80)
      {
        System.out.println("the grade is'B'");
      }
      else if(avg>=60&&avg<70)
      {
        System.out.println("the grade is 'C'");
      }
      else if(avg>=50&&avg<60)
      {
        System.out.println("the grade is 'D'");
       }
      else if(avg<50)
      {
        System.out.println("the grade is 'U'");
       }
              
   }
}      
  
       