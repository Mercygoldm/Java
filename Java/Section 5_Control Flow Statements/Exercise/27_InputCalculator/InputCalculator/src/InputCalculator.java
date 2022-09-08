import java.util.Scanner;

public class InputCalculator {
    public static void  inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);

        int sum = 0; double count =0;

        boolean hasNextInt = scanner.hasNextInt();
        while(hasNextInt)
        {
            int var = scanner.nextInt();
            scanner.nextLine();
            sum = sum + var;
            count++;
            hasNextInt = scanner.hasNextInt();
        }

        if(count != 0) {
            double div = sum / count;
            int average = (int) Math.round(div);

            System.out.println("SUM = " + sum + " AVG = " + average);
        }
        else {
            System.out.println("SUM = " + 0 + " AVG = " + 0);
        }
    }
}