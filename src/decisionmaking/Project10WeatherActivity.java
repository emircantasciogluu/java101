package decisionmaking;

import java.util.Scanner;

public class Project10WeatherActivity {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double celsius;

        System.out.print("Enter the temperature in Celsius: ");
        celsius = inp.nextDouble();

        if (celsius <= 0) {
            System.out.println("It’s very cold! You can go skiing.");
        } else if (celsius <= 15) {
            System.out.println("The weather is chilly, a good time to go to the cinema.");
        } else if (celsius <= 25) {
            System.out.println("Perfect weather for a picnic in the park.");
        } else {
            System.out.println("It’s hot! Swimming would be a great idea.");
        }
    }
}
