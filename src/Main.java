import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Main
{
    public static void main(String[] args)
    {
        int ARRAY_SIZE = 100;
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int [ARRAY_SIZE]; // creates an array with the index of the variable ARRAY_SIZE
        double sum = 0;
        double average = 0;
        int num = 0;
        int found = 0;
        boolean foundTarget = false;


        for(int x = 0; x < dataPoints.length; x++) //fills the array with random integers between 1 and 100
        {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }

        for(int x = 0; x < dataPoints.length; x++)
        {
            System.out.print(dataPoints[x] + " | "); // prints the array on one line with " | " separating each value
        }

        for(int x = 0; x < dataPoints.length; x++)
        {
            sum += dataPoints[x]; // adds up all the values of the array
        }
        average = sum / dataPoints.length; // sum / length of list = mean
        System.out.println("\nThe sum of the random data set is " + sum);
        System.out.println("The average of the random data set is " + average);

        num = SafeInput.getRangedInt(in, "Input a number", 1, 100); // input a ranged int between 1 and 100
        for(int x = 0; x < dataPoints.length; x++)
        {
            if(dataPoints[x] == num)
            {
                found++; // determines how many times the input int occurs in the array
            }
        }
        System.out.println("You input the number " + num + ".\n" + num + " was found " + found + " times.");

        num = SafeInput.getRangedInt(in, "Input a number", 1, 100);
        for(int x = 0; x < dataPoints.length; x++)
        {
            if(dataPoints[x] == num)
            {
                System.out.println("The input value " + num + " was found at array index " + x); // prints the index at which the input int first appears
                foundTarget = true; // set boolean to true if the input is in the array
                break; // stops the loop if the input value is found
            }
        }
        if(!foundTarget)
        {
            System.out.println("The input value " + num + " is not in the array"); // prints this message if the number was not in the array
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

        /**
         * The outputs for all the methods below
         * They match the above results.
         */

        System.out.println("\n\nThe average of dataPoints is: " + getAverage(dataPoints));
        System.out.println("The minimum of dataPoints is: " + min(dataPoints));
        System.out.println("The maximum of dataPoints is: " + max(dataPoints));
        System.out.println("The input number occurs " + occurrenceScan(dataPoints, SafeInput.getRangedInt(in, "Input a number", 1, 100)) + " times.");
        System.out.println("The sum of the dataPoints is: " + sum(dataPoints));
        System.out.println("The input number is in dataPoints is " + contains(dataPoints, SafeInput.getRangedInt(in, "Input a number", 1, 100)));

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

    public static int min(int values[])
    {
        int retMin = values[0];

        for(int x = 0; x < values.length; x++)
        {
            if(retMin> values[x])
            {
                retMin = values[x];
            }
        }
        return retMin;
    }
    public static int max(int values[])
    {
        int retMax = values[0];
        for(int x = 0; x < values.length; x++)
        {
            if(retMax< values[x])
            {
                retMax = values[x];
            }
        }
        return retMax;
    }
    public static int occurrenceScan(int values[], int target)
    {
        Scanner in = new Scanner(System.in);
        int retOccur = 0;
        for(int x = 0; x < values.length; x++)
        {
            if(values[x] == target)
            {
                retOccur++;
            }
        }
        return retOccur;
    }

    public static int sum(int values[])
    {
        int retSum = 0;
        for(int x = 0; x < values.length; x++)
        {
            retSum += values[x];
        }
        return retSum;
    }

    public static boolean contains(int values[], int target)
    {
        boolean retContains = false;
        for (int x = 0; x < values.length; x++)
        {
            if (values[x] == target)
            {
                retContains = true;
            }
        }
        return retContains;
    }
}