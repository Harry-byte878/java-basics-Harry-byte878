import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {

        String dogName;

        // declare and initialize Random object
        Random randomizer = new Random();

        // declare and initialize percentages
        int remaining = 100;
        int percentage1 = randomizer.nextInt(remaining) + 1;
        remaining = remaining - percentage1;
        int percentage2 = randomizer.nextInt(remaining) + 1;
        remaining = remaining - percentage2;
        int percentage3 = randomizer.nextInt(remaining) + 1;
        remaining = remaining - percentage3;
        int percentage4 = randomizer.nextInt(remaining);
        remaining = remaining - percentage4;
        int percentage5 = remaining;


        // create Scanner
        Scanner myScanner = new Scanner(System.in);

        // ask user for input
        System.out.println("What is your dog's name? ");
        dogName = myScanner.next();

        // display results
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:");
        System.out.println("");
        System.out.println(percentage1 + "% Bulldog");
        System.out.println(percentage2 + "% Labrador Retriever");
        System.out.println(percentage3 + "% German Shepard");
        System.out.println(percentage4 + "% Golden Retriever");
        System.out.println(percentage5 + "% Chihuahua");
        System.out.println("");
        System.out.println("Wow, that's QUITE the dog!");


    }
}
