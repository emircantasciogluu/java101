# Java101 - Learning Repository

This repository contains my notes and small projects created during my Java learning journey.  
All exercises are written in **Java** using **IntelliJ IDEA**.

## 📂 Projects

- **Project1GradeAverage**  
  A simple Java program that takes 5 course grades (Math, Geography, Physics, Chemistry, Biology) from the user,  
  calculates the average (GPA), and prints whether the student passed or failed.


- **Project2TaxCalculator**  
  A Java program that calculates the price including VAT (KDV) and the tax amount.
    - If the amount is **0–1000 TL**, VAT rate is **18%**
    - If the amount is **greater than 1000 TL**, VAT rate is **8%**


- **Project3TriangleAreaCalc**  
  A Java program that calculates the **perimeter** and **area** of a triangle using **Heron’s formula**.
    - User inputs three sides of the triangle
    - The program computes the semi-perimeter: `u = (a + b + c) / 2`
    - Perimeter = `2 * u`
    - Area = `√(u * (u - a) * (u - b) * (u - c))`
  

- **Project4TaxiMeter**  
  A Java program that calculates the taxi fare based on distance (in kilometers).
    - Opening fee = 10 TL
    - Cost per km = 2.20 TL
    - Minimum fare = 20 TL (if the calculated amount is less than 20 TL, the total is set to 20 TL)


- **Project5AreaOfCircle**  
  A Java program that calculates the **area of a circle sector** based on the radius and the central angle.
    - Formula: `(π * r² * angle) / 360`
    - π is taken as **3.14** (as required by the assignment)
    - User inputs: radius (r) and angle (α)


- **Project6BMICalculator**  
  A Java program that calculates the **Body Mass Index (BMI)** of the user.
    - Formula: `BMI = weight (kg) / (height (m) * height (m))`
    - User inputs: height in meters and weight in kilograms
    - The program prints the calculated BMI value


- **Project7CalculatorMach**  
  A simple calculator program using **switch-case** in Java.
    - User enters two numbers.
    - The program offers four operations: Addition, Subtraction, Multiplication, Division.
    - Division includes a check to prevent division by zero.
    - Invalid choices are handled with a default case.


- **Project8ResetPassword**  
  A Java program that simulates a simple login and password reset system.
    - User enters a **username** and **password**.
    - If both are correct → login successful.
    - If the password is incorrect:
        - The user is asked if they want to reset their password.
        - If yes → the program checks that the new password is **not the same as the old one**.
            - If the same → prints *"Password creation failed, please enter a different password."*
            - If different → prints *"Password created successfully."*
        - If no → prints *"Password reset canceled."*
    - If the username is incorrect → prints *"Login failed! Invalid username or password."*


- **Project9PassOrFail**  
  A Java program that calculates the average of five courses and checks if the student has passed or failed.
    - The program asks the user to enter grades for Math, Physics, Chemistry, Biology, and Geography.
    - All grades must be between **0 and 100**; otherwise, the program prints an error message.
    - If all grades are valid:
        - Average ≥ 55 → *"You passed the class!"*
        - Average < 55 → *"You failed the class."*


- **Project10WeatherActivity**  
  A Java program that suggests activities based on the temperature entered by the user.
    - Temperature ≤ 0 → *"It’s very cold! You can go skiing."*
    - 0 < Temperature ≤ 15 → *"The weather is chilly, a good time to go to the cinema."*
    - 15 < Temperature ≤ 25 → *"Perfect weather for a picnic in the park."*
    - Temperature > 25 → *"It’s hot! Swimming would be a great idea."*


- **Project11HoroscopeFinder**  
  A Java program that determines the user's **zodiac sign** based on their birth date.
    - Uses **if-else statements** instead of switch-case.
    - Validates month and day inputs.
    - Outputs the correct zodiac sign or an error message if the input is invalid.


- **Project12DivisibleAverage**  
  A Java program that calculates the **average** of numbers between 0 and a user-input number  
  that are divisible by both **3** and **4**.
    - User inputs a number (n).
    - The program checks all numbers from 0 to n.
    - Only numbers divisible by 3 and 4 are included.
    - The program calculates and prints the average of these numbers.


- **Project13UntilOddBreaker**  
  A Java program that repeatedly asks the user to enter numbers until an odd number is entered.  
  It sums up only the numbers that are even and multiples of 4, then prints the result when the loop ends.
    - The program continues as long as the user enters even numbers.
    - Numbers that are divisible by 4 are added to the total.
    - When the user enters an odd number, the loop stops.
    - Finally, the total sum is printed on the screen.

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/emircantasciogluu/java101.git
