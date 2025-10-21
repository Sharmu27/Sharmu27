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
class Cat extends Animal
{
    void Meow()
    {
        System.out.println("Sounds Meow Meow");
    }
}
class Dog extends Animal
{
    void Bark()
    {
        System.out.println("Sounds Woof Woof");
    }
}
public class Main1 {
    public static void main(String[] args) {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        Cat obj = new Cat();
        obj.Walk();
        obj.NoOfLegs();
        obj.Breath();
        obj.Meow();
        Dog obj1=new Dog();
        obj1.Walk();
        obj1.NoOfLegs();
        obj1.Breath();
        obj1.Response();
        obj1.Bark();
    }
}