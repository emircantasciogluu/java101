package decisionmaking;

import java.util.Scanner;

public class Project11HoroscopeFinder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int month, day;
        String zodiac = "";

        System.out.print("Enter your birth month (1-12): ");
        month = inp.nextInt();

        System.out.print("Enter your birth day: ");
        day = inp.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 21)
                zodiac = "Capricorn";
            else if (day >= 22 && day <= 31)
                zodiac = "Aquarius";
        } else if (month == 2) {
            if (day >= 1 && day <= 19)
                zodiac = "Aquarius";
            else if (day >= 20 && day <= 29)
                zodiac = "Pisces";
        } else if (month == 3) {
            if (day >= 1 && day <= 20)
                zodiac = "Pisces";
            else if (day >= 21 && day <= 31)
                zodiac = "Aries";
        } else if (month == 4) {
            if (day >= 1 && day <= 20)
                zodiac = "Aries";
            else if (day >= 21 && day <= 30)
                zodiac = "Taurus";
        } else if (month == 5) {
            if (day >= 1 && day <= 21)
                zodiac = "Taurus";
            else if (day >= 22 && day <= 31)
                zodiac = "Gemini";
        } else if (month == 6) {
            if (day >= 1 && day <= 22)
                zodiac = "Gemini";
            else if (day >= 23 && day <= 30)
                zodiac = "Cancer";
        } else if (month == 7) {
            if (day >= 1 && day <= 22)
                zodiac = "Cancer";
            else if (day >= 23 && day <= 31)
                zodiac = "Leo";
        } else if (month == 8) {
            if (day >= 1 && day <= 22)
                zodiac = "Leo";
            else if (day >= 23 && day <= 31)
                zodiac = "Virgo";
        } else if (month == 9) {
            if (day >= 1 && day <= 22)
                zodiac = "Virgo";
            else if (day >= 23 && day <= 30)
                zodiac = "Libra";
        } else if (month == 10) {
            if (day >= 1 && day <= 22)
                zodiac = "Libra";
            else if (day >= 23 && day <= 31)
                zodiac = "Scorpio";
        } else if (month == 11) {
            if (day >= 1 && day <= 21)
                zodiac = "Scorpio";
            else if (day >= 22 && day <= 30)
                zodiac = "Sagittarius";
        } else if (month == 12) {
            if (day >= 1 && day <= 21)
                zodiac = "Sagittarius";
            else if (day >= 22 && day <= 31)
                zodiac = "Capricorn";
        } else {
            System.out.println("Invalid month input.");
        }

        if (!zodiac.isEmpty()) {
            System.out.println("Your zodiac sign is: " + zodiac);
        } else {
            System.out.println("Invalid date input.");
        }
    }
}
