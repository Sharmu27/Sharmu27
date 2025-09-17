public class constructor {
    int x=6;
    constructor()
    {
        this.x=x;
    }
    public void display()
    {
        System.out.println("x="+x);
    }
    public static void main(String[] args) {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        constructor c = new constructor();
        c.display();
    }
}