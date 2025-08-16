import java.util.Scanner;
class Attendance
{
    public static void main(String[] args)
    {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        int dailyPercentage,weeklyPercentage;
        int attend;
        int days=5;
        int hours=8;
        int[][]attendance=new int[5][8];
        for(int day=0;day<days;day++)
        {
            System.out.println("day "+(day+1));
            for(int hour=0;hour<hours;hour++)
            {
                System.out.println("hour"+(hour+1));
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the attendance as 1(present) and 0(absent)");
                attend=sc.nextInt();
                attendance[day][hour]=attend;
            }
         }
         int totalPresent=0;
         for(int day=0;day<days;day++)
         {
            int dayPresent=0;
            for(int hour=0;hour<hours;hour++)
            {
               dayPresent+=attendance[day][hour];
            }
          dailyPercentage=(dayPresent*100)/hours;
          totalPresent+=dayPresent;
          System.out.println("day "+(day+1)+"attendance:"+dailyPercentage +"%");
         }
         weeklyPercentage=(totalPresent*100)/(days*hours);
         System.out.println("overall weekly Percentage:"+weeklyPercentage+"%");
      }
}               
                