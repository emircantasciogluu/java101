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
    - π is taken as **3.14**
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
        - If no → prints *"Password reset canceled."*
    - If the username is incorrect → prints *"Login failed! Invalid username or password."*


- **Project9PassOrFail**  
  A Java program that calculates the average of five courses and checks if the student has passed or failed.
    - All grades must be between **0 and 100**.
    - If valid:
        - Average ≥ 55 → *"You passed the class!"*
        - Average < 55 → *"You failed the class."*


- **Project10WeatherActivity**  
  A Java program that suggests activities based on the temperature entered by the user.
    - ≤ 0 → Skiing
    - 0–15 → Cinema
    - 15–25 → Picnic
    - > 25 → Swimming


- **Project11HoroscopeFinder**  
  A Java program that determines the user's **zodiac sign** based on their birth date using **if-else** statements.


- **Project12DivisibleAverage**  
  Calculates the **average** of numbers between 0 and a user-input number divisible by **3** and **4**.


- **Project13UntilOddBreaker**  
  Repeatedly asks the user to enter numbers until an odd number is entered.  
  Sums only the even numbers divisible by 4 and prints the total.


- **Project14PowerOf4And5**  
  Prints the powers of **4** and **5** up to a user-defined number.


- **Project15CombinationCalc**  
  Calculates the combination **C(n, r)** using factorials.  
  Formula: `C(n, r) = n! / (r! * (n-r)!)`


- **Project16PowerCalculator**  
  Calculates `base^exponent` using a **for loop**.


- **Project17DigitSumCalculator**  
  Calculates the **sum of digits** of a given number.


- **Project18ArmstrongNum**  
  Checks whether a given number is an **Armstrong number**.


- **Project19HarmonicSeries**  
  Calculates the harmonic series up to a given number:  
  `1 + 1/2 + 1/3 + ... + 1/n`


- **Project20ATMSystem**  
  Simulates basic **ATM operations** using a `switch-case`.  
  Features: login attempts, deposit, withdraw, balance check, exit.


- **Project21GCDLCMCalculator**  
  Calculates the **Greatest Common Divisor (GCD)** and **Least Common Multiple (LCM)** of two numbers.


- **Project22MinMaxFinder**  
  Finds the **minimum** and **maximum** values from user-entered numbers.


- **Project23PerfectNumberChecker**  
  Checks whether a given number is a **Perfect Number**.  
  Example: 28 → Perfect ✅, 12 → Not Perfect ❌


- **Project24ReversePyramid**  
  Prints an **inverted triangle star pattern** using nested loops.


- **Project25Fibonacci**  
  Generates the Fibonacci series up to `n` terms.  
  Example: Input `9` → Output `0 1 1 2 3 5 8 13 21`


- **Project26PalindromNumber**  
  Checks whether a given number is a palindrome using a method.


- **Project27CalculatorMachine**  
  An **Advanced Calculator** with operations:  
  Addition, Subtraction, Multiplication, Division, Exponentiation, Factorial, Modulus, Rectangle Area & Perimeter.


- **Project28RecursivePower**  
  Calculates `base^exponent` using **recursion**.


- **Project29OOPStudentSystem**  
  Demonstrates OOP concepts with **Teacher, Course, and Student** classes.
    - **Teacher** → has name, phoneNo, branch, and a `print()` method.
    - **Course** → has name, code, prefix, grade, and courseTeacher; `addTeacher()` assigns a teacher if valid.
    - **Student** → has 3 courses, can add grades, calculate average, and check pass/fail.
    - **MainCourse** → demonstrates the system by creating teachers, courses, and a student.


- **Project30BoxMatch**  
  A boxing match simulation using OOP concepts.
    - **Fighter** → has attributes (name, damage, weight, health, dodge), can attack and dodge.
    - **Ring** → simulates the match, checks weight classes, calculates scores, and determines the winner.
    - **MainBoxMatch** → sets up two fighters, creates a ring, and runs the match.

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/emircantasciogluu/java101.git
