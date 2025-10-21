class LivingBeing
{
   void Breath()
   {
       System.out.println("Breathing...");
   }
   void Response()
   {
       System.out.println("Woof...Woof...");
   }
}
class Animal extends LivingBeing
{
    void Walk()
    {
        System.out.println("Walking..");
    }
    void NoOfLegs()
    {
        System.out.println("four number of legs");
    }
}
public class Main {
    public static void main(String[] args) 
    {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        Animal obj = new Animal();
        obj.Walk();
        obj.NoOfLegs();
        obj.Breath();
        obj.Response();
    }
}