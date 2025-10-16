public class Demo 
{
   int instanceVar = 100;
   static int staticVar;

    static {
        staticVar = 50;  
        Demo obj = new Demo();
        System.out.println("Sharmu");
        System.out.println(2024503055);
        System.out.println("Accessing instanceVar via object: " + obj.instanceVar);
        obj.instanceMethod();    
     }

        public void instanceMethod() 
    {
        System.out.println("Instance method called.");
    }

    public static void main(String[] args)
   {
        System.out.println("Static var: " + staticVar);
    }
}