import java.util.Scanner;
import java.math.RoundingMode;

public class Healthy_Hearts {
    public static void main(String[] args) {
        int age;
        int maxHeartRate;
        int targetHeartRateMin;
        int targetHeartRateMax;

        // declare and initialise a scanner
        Scanner myScanner = new Scanner(System.in);

        // get the user to enter their age
        System.out.println("What is your age?");
        age = myScanner.nextInt();

        // calculate maximum heart rate
        maxHeartRate = 220 - age;

        // calculate target heart rate minimum and maximum
        targetHeartRateMin = Math.round(0.5f * maxHeartRate);
        targetHeartRateMax = Math.round(0.85f * maxHeartRate);


        // display maximum heart and target HR zone
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR zone is " + targetHeartRateMin + " - " + targetHeartRateMax + " beats per minute");



    }
}
