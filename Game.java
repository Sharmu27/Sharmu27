import java.util.Scanner;
public class Game {
            public static void main(String[] args)
            {
                System.out.println("Sharmu");
                System.out.println(2024503055);
                int secretNumber = 45;
                int guess = 0;
                int attempt = 0;
                int avgGuess = 0;
                int choice;
                Scanner sc = new Scanner(System.in);
                System.out.println("---Menu---");
                System.out.println("1.Play Game");
                System.out.println("2.View status");
                System.out.println("3.Quit");
                System.out.println("enter your choice");
                choice = sc.nextInt();
                while (choice != -1) {
                    switch (choice) {
                        case 1:
                            attempt++;
                            for (int i = 0; i < 10; i++) {
                                System.out.println("enter the input(1-100)");
                                int input = sc.nextInt();
                                if (input <= -2 || input >= 100) {
                                    System.out.println("the input is out of range");
                                    continue;
                                } else if (input > 45&& input<100) {
                                    System.out.println("the input is too high");
                                    guess++;
                                    continue;
                                } else if (input < 45&& input>0) {
                                    System.out.println("the input is too low");
                                    guess++;
                                    continue;
                                } else if (input == -1) {
                                    System.out.println("QUIT");
                                    break;
                                } else if (input == 45) {
                                    System.out.println("the input is correct");
                                    break;
                                }
                            }
                        case 2:
                            System.out.println("total games played" + attempt);
                            System.out.println("total guesses:" + guess);
                            System.out.println("avg guess:" + (guess / attempt));
                    }
                    System.out.println("Do you want to play game?(0/1)");
                    choice = sc.nextInt();
                    if (choice == 0) {
                        System.out.println("enter -1 to exit");
                        int input = sc.nextInt();
                        System.out.println("no games played");
                        break;
                    }
                }


            }
        }