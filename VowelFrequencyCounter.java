import java.util.Scanner;
 class VowelFrequencyCounter {
    public static void main(String[] args) 
    {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        char[] chars = input.toCharArray();
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
        for (char c : chars) {
            switch (c) {
                case 'a':
                    countA++;
                    break;
                case 'e':
                    countE++;
                    break;
                case 'i':
                    countI++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'u':
                    countU++;
                    break;
            }
        }
        System.out.println("Vowel frequencies:");
        System.out.println("a: " + countA);
        System.out.println("e: " + countE);
        System.out.println("i: " + countI);
        System.out.println("o: " + countO);
        System.out.println("u: " + countU);
    }
}
