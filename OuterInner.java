 
class OuterInner
 {
    public class PublicInner
 {
        void show() 
        {
            System.out.println("Sharmu");
            System.out.println(2024503055);
            System.out.println("Public Inner Class");
        }
    }

    private class PrivateInner
   {
        void show() 
       {
            System.out.println("Private Inner Class");
        }
    }

    void accessPrivateInner() 
   {
        PrivateInner p = new PrivateInner();
        p.show();
    }

    public static void main(String[] args)
     {
        OuterInner outer = new OuterInner();
        OuterInner.PublicInner pub = outer.new PublicInner();
        pub.show();

        outer.accessPrivateInner();
    }
}
 