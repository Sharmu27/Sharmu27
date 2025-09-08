import java.util.Random;
class GameAthlete
{
   private  String name;
   private int energy;
   private int skillPower;
   private int maxEnergy;
   private Boolean isActive;
   private static int totalAthletes=0;
   public GameAthlete()
   {
      this("Player",100,10);    
    }
    public GameAthlete(String name,int energy,int skillPower)
    {
       this.name=name;
       this.energy=energy;
       this.skillPower=skillPower;
       this.maxEnergy=energy;
       this. isActive=true;
       totalAthletes++;
     }
     public void compete(GameAthlete Opponent)
     {
        if(!this.isActive||!Opponent.isActive)
        {
           System.out.println("Either one of the athlete is not active");
           return;
         }
          Opponent.energy-=this.skillPower;
           if(Opponent.energy<=0)
           {
              Opponent.energy=0;
              Opponent.isActive= false;
              System.out.println(Opponent.name+" is knocked out");
            }
           else
            {
              System.out.println(Opponent.name+" energy is reduced by"+ this.name+ Opponent.energy);
               }
       }
       public void rest(int amount)
       {
         if(!isActive)
          {
            System.out.println(name+" cannot rested and recovered");
             return;
           }
          energy+=amount;
          if(energy>maxEnergy)
          {
            energy=maxEnergy;
          }
          System.out.println( name+" is rested and recovered to"+ energy+" energy");
        }
        public void train()
        {
          if(!isActive)
          {
              System.out.println(name+" is not active and cannot be trained");
              return;
           }
          Random random=new Random();
          int gained=random.nextInt(11);
          skillPower+=gained;
          System.out.println(name+" trained and gained"+ gained +" skillPower. Total: "+ skillPower);
         }
        public void displaystats()
        {
           System.out.println("Name:"+name);
           System.out.println("Energy:"+energy+"/"+maxEnergy);
           System.out.println("Skill Power:"+skillPower);
           System.out.println("Active:"+isActive);
         }
         public static void main(String[] args)
         {
           System.out.println("Sharmu");
           System.out.println(2024503055);
           GameAthlete a1=new GameAthlete("Sheela",120,15);
           GameAthlete a2=new GameAthlete("Rani",100,12);
           GameAthlete a3=new GameAthlete();
           a1.displaystats();
           a2.displaystats();
           a3.displaystats();
           a1.compete(a2);
           a2.compete(a3);
           a3.compete(a1);
           a2.rest(20);
           a3.rest(30);
           a1.train();
           a2.train();
           a3.train();
           a1.displaystats();
           a2.displaystats();
           a3.displaystats();
           System.out.println("TotalAthletes created:"+GameAthlete.totalAthletes);

          }
}

           

        
          
              
            
            
             
        

