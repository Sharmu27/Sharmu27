import java.util.Scanner;
 class Matrix {
    public static void main(String[] args)
    {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        Scanner sc= new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[] rowSums = new int[3];
        System.out.println("Enter 9 numbers for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                matrix[i][j] = sc.nextInt();
                rowSums[i] += matrix[i][j];
            }
        }
        int maxSum = rowSums[0];
        int maxRow = 1; 
        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Sum of row " + (i + 1) + ": " + rowSums[i]);
            if (rowSums[i] > maxSum) 
            {
                maxSum = rowSums[i];
                maxRow = i + 1;
            }
        }
        System.out.println("Row " + maxRow + " has the highest sum.");
    }
}
