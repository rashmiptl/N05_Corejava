package assignment1;
import java.util.Scanner;

public class Mary
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int[] inputNumbers = new int[n];
        int[] marySaysNumbers = new int[n];

        System.out.println("Numbers said by Pinky:");

        // Read the input numbers
        for (int i = 0; i < n; i++)
        {
            inputNumbers[i] = scanner.nextInt();
        }

        System.out.println("Enter the numbers as Mary says them:");

        // Read the numbers as Mary says them
        for (int i = 0; i < n; i++)
        {
            marySaysNumbers[i] = scanner.nextInt();
        }

        // Check if the order is correct
        boolean isOrderCorrect = true;

        for (int i = 0; i < n; i++)
        {
            if (inputNumbers[i] != marySaysNumbers[n - 1 - i])
            {
                isOrderCorrect = false;
                break;
            }
        }

        // Output the result
        if (isOrderCorrect) 
        {
            System.out.println("Yes,it is in reverse order");
        }
        else 
        {
            System.out.println("No,it is not in reverse order");
        }
    }
}