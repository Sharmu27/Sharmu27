import java.util.Scanner;
 class TrafficLight
 {
    public static void main(String[] args) 
    {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the color of the traffic light (red, yellow, green): ");
        String color = sc.nextLine().toLowerCase(); 
        switch (color) 
       {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Ready to move");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color");
        }
    }
}
