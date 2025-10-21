 class Animals{

    void move()
    {
        System.out.println("Animal moves..");
    }

    void move(String direction)
    {
        System.out.println("Animal moves in"+direction+"direction");
    }
    void move(int distance)
    {
        System.out.println("Animal moves "+distance+"meters");
    }
    void move(String direction,int distance)
    {
        System.out.println("Animal moves in"+direction+"direction"+"and"+"Animal moves "+distance+"meters");
    }
}
class Dogs extends Animals {
    @Override
    void move() {
        System.out.println("Dog moves..");
    }

    @Override
    void move(String direction) {
        System.out.println("Dog moves in" + direction + "direction");
    }

    @Override
    void move(int distance) {
        System.out.println("Dog moves" + distance + "meters");
    }

    @Override
    void move(String direction, int distance) {
        System.out.println("Dog moves in" + direction + "direction" + "and" + "Dog moves " + distance + "meters");
    }
}
class Cats extends Animals
{
    @Override
    void move() {
        System.out.println("Cat moves..");
    }
    @Override
    void move(String direction) {
        System.out.println("Cat moves in" + direction + "direction");
    }
    @Override
    void move(int distance) {
        System.out.println("Cat moves" + distance + "meters");
    }
    @Override
    void move(String direction, int distance) {
        System.out.println("Cat moves in" + direction + "direction" + "and" + "Cat moves " + distance + "meters");
    }
}
class Bird extends Animals
{
    @Override
    void move() {
        System.out.println("Bird flies..");
    }
    @Override
    void move(String direction) {
        System.out.println("Bird flies in" + direction + "direction");
    }
    @Override
    void move(int distance) {
        System.out.println("Bird flies" + distance + "meters");
    }
    @Override
    void move(String direction, int distance) {
        System.out.println("Bird flies in" + direction + "direction" + "and" + "Bird flies " + distance + "meters");
    }
}
public class Main2
{
    public static void main(String[] args)
    {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        Animals[] objA={new Dogs(),new Cats(),new Bird()};
        Dogs d= new Dogs();
        for(Animals a: objA)
        {
            a.move("North",600);
        }
        d.move();
        d.move("East");
        d.move(200);
        d.move("East",200);
        Cats c=new Cats();
        c.move();
        c.move("West");
        c.move(250);
        c.move("West",250);
        Bird b=new Bird();
        b.move();
        b.move("South");
        b.move(500);
        b.move("South",500);

    }
}