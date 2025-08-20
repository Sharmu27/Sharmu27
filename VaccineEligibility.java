import java.util.Scanner;
 class VaccineEligibility 
 {
    public static void main(String[] args) 
    {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter patient's age: ");
        int age = sc.nextInt();
        if (age >= 18 && age <= 65) 
        {
            System.out.println("Eligible for vaccine.");
            System.out.println("Enter 3-digit appointment number: ");
            int appointmentNumber = sc.nextInt();
            if (appointmentNumber >= 100 && appointmentNumber <= 999)
            {
                if (appointmentNumber % 2 == 0) 
                 {
                    System.out.println("Slot: Priority");
                } 
                else 
                {
                    System.out.println("Slot: Regular");
                }
                int lastDigit = appointmentNumber % 10;

                switch (lastDigit) {
                    case 1:
                        System.out.println("Gift: Pen");
                        break;
                    case 2:
                        System.out.println("Gift: Mask");
                        break;
                    case 3:
                        System.out.println("Gift: Sanitizer");
                        break;
                    default:
                        System.out.println("No special gift.");
                }
            } 
            else 
           {
                System.out.println("Invalid appointment number. Must be a 3-digit number.");
            }
        } 
        else 
        {
            System.out.println("Not eligible for vaccine.");
        }
    }
}
