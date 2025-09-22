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


- **Project14PowerOf4And5**  
  A Java program that prints the powers of **4** and **5** up to a user-defined number.
    - The program asks the user to enter a number (n).
    - It prints all powers of 4 less than or equal to n.
    - It prints all powers of 5 less than or equal to n.
    - Results are displayed in separate sections for clarity.


- **Project15CombinationCalc**  
  A Java program that calculates the combination **C(n, r)** using factorials.
    - The program asks the user to enter two numbers: **n** (total elements) and **r** (selected elements).
    - It calculates factorials of n, r, and (n-r) using loops.
    - Then it applies the formula: C(n, r) = n! / (r! * (n-r)!).
    - The result (an integer) is printed on the screen.


- **Project16PowerCalculator**  
  A Java program that calculates the result of raising a base number to an exponent using a **for loop**.
    - The program asks the user to enter two integers: **base** and **exponent**.
    - It initializes the result as 1.
    - A for loop multiplies the base by itself exponent times.
    - Finally, the program prints the result of base^exponent on the screen.


- **Project17DigitSumCalculator**  
  A Java program that calculates the **sum of digits** of a given number.
    - The program asks the user to enter an integer.
    - It extracts each digit using the modulo operator (%) inside a while loop.
    - Each digit is added to the total sum.
    - Finally, the program prints the result (the sum of all digits).


- **Project18ArmstrongNum**  
  A Java program that checks whether a given number is an **Armstrong number**.
    - The program asks the user to enter an integer.
    - It calculates the number of digits in the input.
    - Each digit is raised to the power of the total number of digits.
    - The program sums these powered values.
    - If the sum is equal to the original number, it prints that the number is an Armstrong number; otherwise, it is not.


- **Project19HarmonicSeries**  
  A Java program that calculates the **harmonic series** up to a given number.
    - The program asks the user to enter an integer **n**.
    - It computes the sum of the series: 1 + 1/2 + 1/3 + ... + 1/n.
    - A for loop is used to add the reciprocal of each number up to n.
    - The result (a double value) is printed on the screen.


- **Project20ATMSystem**  
  A Java program that simulates basic **ATM operations** using a `switch-case` structure.
    - The user has **3 login attempts** (username and password).
    - If the login is successful, the user can:
        1. Deposit money
        2. Withdraw money (only if sufficient balance is available)
        3. Check account balance
        4. Exit the system
    - If the login fails three times, the account is blocked.
    - The program uses `switch-case` to manage the ATM menu options.


- **Project21GCDLCMCalculator**  
  A Java program that calculates the **Greatest Common Divisor (GCD)** and the **Least Common Multiple (LCM)** of two numbers.
    - The program asks the user to enter two integers (n1 and n2).
    - A for loop checks all possible divisors to find the GCD.
    - The LCM is calculated using the formula: LCM = (n1 * n2) / GCD.
    - Finally, both the GCD and LCM are printed on the screen.


- **Project22MinMaxFinder**  
  A Java program that finds the **minimum** and **maximum** values from a set of numbers entered by the user.
    - The program first asks how many numbers will be entered.
    - The user enters the numbers one by one.
    - The program compares each input to keep track of the smallest and largest values.
    - Finally, it prints the maximum and minimum numbers on the screen.


- **Project23PerfectNumberChecker**  
  A Java program that checks whether a given number is a **Perfect Number**.
    - The user enters an integer.
    - The program finds all positive divisors of the number (excluding the number itself).
    - If the sum of these divisors equals the number, it is identified as a Perfect Number.
    - Otherwise, it is not a Perfect Number.

  Example:
    - 28 → 1 + 2 + 4 + 7 + 14 = 28 → Perfect Number ✅
    - 12 → 1 + 2 + 3 + 4 + 6 = 16 → Not Perfect ❌


- **Project24ReversePyramid**  
  A Java program that prints an **inverted triangle star pattern** using nested loops.
    - The program asks the user to enter the number of rows.
    - It starts with the maximum number of stars in the first row.
    - Each following row prints one fewer star until only one star remains.


- **Project25Fibonacci**  
  A Java program that generates the **Fibonacci series** up to a user-defined number of terms.
    - The program asks the user to enter an integer `n`.
    - It starts with the first two numbers of the series (0 and 1).
    - Each subsequent number is calculated as the sum of the previous two numbers.
    - The series is printed on the screen in order.

  Example:  
  Input: `9`  
  Output: `0 1 1 2 3 5 8 13 21`


- **Project26PalindromNumber**  
  A Java program that checks whether a given number is a **palindrome** using a method.
    - A palindrome number is the same when read forwards or backwards (e.g., 121, 242).
    - The program defines a method `isPalindrom(int number)` which:
        - Reverses the digits of the given number.
        - Compares the reversed number with the original.
        - Returns `true` if they are equal, otherwise `false`.
    - The result is printed in the `main` method.

  Example:  
  Input: `242`  
  Output: `true`

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/emircantasciogluu/java101.git
