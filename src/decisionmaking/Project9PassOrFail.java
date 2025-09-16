package decisionmaking;

import java.util.Scanner;

public class Project9PassOrFail {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int math, physics, chemistry, biology, geography;

        System.out.print("Math grade: ");
        math = inp.nextInt();

        System.out.print("Physics grade: ");
        physics = inp.nextInt();

        System.out.print("Chemistry grade: ");
        chemistry = inp.nextInt();

        System.out.print("Biology grade: ");
        biology = inp.nextInt();

        System.out.print("Geography grade: ");
        geography = inp.nextInt();

        double average = (math + physics + chemistry + biology + geography) / 5.0;

        if (math >= 0 && math <= 100 &&
                physics >= 0 && physics <= 100 &&
                chemistry >= 0 && chemistry <= 100 &&
                biology >= 0 && biology <= 100 &&
                geography >= 0 && geography <= 100) {

            if (average >= 55) {
                System.out.println("Your average is " + average + ". You passed the class!");
            } else {
                System.out.println("Your average is " + average + ". You failed the class.");
            }

        } else {
            System.out.println("Please enter grades between 0 and 100.");
        }
    }
}
