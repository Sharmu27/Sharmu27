
class Parent {
    
    public Number getValue() {
        return 10; 
    }

       public void show() {
        System.out.println("Parent: show()");
    }

    
    public void display() {
        System.out.println("Parent: display()");
    }

    
    public void wrongOverload(int x) {
        System.out.println("Parent: wrongOverload(int)");
    }

        public void greet() {
        System.out.println("Hello!");
    }

    public void greet(String name) {
        System.out.println("Hello, " + name);
    }

    
    public static void staticMethod() {
        System.out.println("Parent: staticMethod()");
    }

    public static void staticMethod(int x) {
        System.out.println("Parent: staticMethod(int)");
    }
}

class Child extends Parent {
       @Override
    public Integer getValue() { 
        return 20;
    }

        public void display(int x) {
        System.out.println("Child: display(int) [NOT override]");
    }

        public void greet(int times) {
        System.out.println("Hello x" + times);
    }

       public static void staticMethod(String msg) {
        System.out.println("Child: staticMethod(String) " + msg);
    }
}

     public class OverridingOverloadingDemo {
      public static void main(String[] args) {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

        System.out.println("Parent getValue(): " + p.getValue());
        System.out.println("Child getValue(): " + c.getValue());
        System.out.println("Parent ref Child obj getValue(): " + pc.getValue());

         p.display();
        c.display(5); 
        p.greet();
        p.greet("Alice");
        c.greet(3);

        
        Parent.staticMethod();
        Parent.staticMethod(10);
        Child.staticMethod("Hello");

        Parent upcast = new Child(); 
        upcast.show();

        Parent onlyParent = new Parent();
        try {
            Child wrongDowncast = (Child) onlyParent;
            wrongDowncast.show();
        } 
        catch (ClassCastException e) 
       {
            System.out.println("Wrong Downcasting: " + e);
        }

         Parent parentRef = new Child();
        if (parentRef instanceof Child) {
            Child safeChild = (Child) parentRef;
            safeChild.show();        
        }
    }
}
