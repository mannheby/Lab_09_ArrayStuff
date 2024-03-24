import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int ARRAY_SIZE = 100;
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int [ARRAY_SIZE];
        double sum = 0;
        double average = 0;
        int num = 0;
        int found = 0;


        for(int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }

        for(int x = 0; x < dataPoints.length; x++)
        {
            System.out.print(dataPoints[x] + " | ");
        }

        for(int x = 0; x < dataPoints.length; x++)
        {
            sum += dataPoints[x];
        }
        average = sum / dataPoints.length;
        System.out.println("\nThe sum of the random data set is " + sum);
        System.out.println("The average of the random data set is " + average);

        num = SafeInput.getRangedInt(in, "Input a number", 1, 100);
        for(int x = 0; x < dataPoints.length; x++)
        {
            if(dataPoints[x] == num)
            {
                found++;
            }
        }
        System.out.println("You input the number " + num + ".\n" + num + " was found " + found + " times.");

        num = SafeInput.getRangedInt(in, "Input a number", 1, 100);
        for(int x = 0; x < dataPoints.length; x++)
        {
            if(dataPoints[x] == num)
            {
                System.out.println("The input value " + num + " was found at array index " + x);
                break;
            }
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int x = 0; x < dataPoints.length; x++)
        {
            if(min> dataPoints[x])
            {
                min = dataPoints[x];
            }
            if(max< dataPoints[x])
            {
                max = dataPoints[x];
            }
        }
        System.out.println("The minimum of the random data set is " + min);
        System.out.println("The maximum of the random data set is " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));





    }
    public static double getAverage(int values[])
    {
        double retAverage = 0;
        double sum = 0;

        for(int x = 0; x < values.length; x++)
        {
            sum += values[x];
        }
        retAverage = sum / values.length;
        return retAverage;
    }

}