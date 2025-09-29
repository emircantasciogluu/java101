# 📘 Java101 - Learning Repository

This repository contains my notes and small projects created during my **Java learning journey**.  
All exercises are written in **Java** using **IntelliJ IDEA**.

---

## 📂 Projects

### **Project1GradeAverage**

A simple program that:

- Takes 5 course grades (Math, Geography, Physics, Chemistry, Biology) as input
- Calculates the average (GPA)
- Prints whether the student passed or failed

---

### **Project2TaxCalculator**

Calculates the **price including VAT (KDV)** and the **tax amount**.

- If amount is **0–1000 TL**, VAT = **18%**
- If amount is **>1000 TL**, VAT = **8%**

---

### **Project3TriangleAreaCalc**

Calculates the **perimeter** and **area** of a triangle using **Heron’s Formula**:

- Semi-perimeter: `u = (a + b + c) / 2`
- Perimeter: `2 * u`
- Area: `√(u * (u - a) * (u - b) * (u - c))`

---

### **Project4TaxiMeter**

Taxi fare calculator:

- Opening fee = 10 TL
- Cost per km = 2.20 TL
- Minimum fare = 20 TL

---

### **Project5AreaOfCircle**

Calculates the **area of a circle sector**:

- Formula: `(π * r² * angle) / 360`
- π = **3.14**

---

### **Project6BMICalculator**

Body Mass Index (BMI) calculator:

- Formula: `BMI = weight / height²`
- Prints the calculated BMI

---

### **Project7CalculatorMach**

A **basic calculator** using `switch-case`.  
Operations: Addition, Subtraction, Multiplication, Division.

---

### **Project8ResetPassword**

Simulates a **login system with password reset**:

- Checks username + password
- If password is wrong, allows reset (new password ≠ old password)

---

### **Project9PassOrFail**

- Calculates the average of 5 courses
- Checks if average ≥ 55 → Pass, otherwise Fail

---

### **Project10WeatherActivity**

Suggests an activity based on temperature:

- ≤ 0 → Skiing
- 0–15 → Cinema
- 15–25 → Picnic
- > 25 → Swimming

---

### **Project11HoroscopeFinder**

Finds zodiac sign from **birth date** using `if-else`.

---

### **Project12DivisibleAverage**

Finds the **average** of numbers divisible by 3 and 4 up to a given number.

---

### **Project13UntilOddBreaker**

Takes numbers until an **odd number** is entered.  
Sums even numbers that are multiples of 4.

---

### **Project14PowerOf4And5**

Prints all powers of **4** and **5** up to a user-defined number.

---

### **Project15CombinationCalc**

Calculates combination **C(n, r)**:

- Formula: `C(n, r) = n! / (r! * (n-r)!)`

---

### **Project16PowerCalculator**

Calculates **base^exponent** using a loop.

---

### **Project17DigitSumCalculator**

Finds the **sum of digits** of a number.

---

### **Project18ArmstrongNum**

Checks if a number is an **Armstrong number**:

- Example: `153 = 1³ + 5³ + 3³` ✅

---

### **Project19HarmonicSeries**

Calculates the harmonic series up to n:  
`1 + 1/2 + 1/3 + … + 1/n`

---

### **Project20ATMSystem**

ATM simulation with:

1. Deposit
2. Withdraw (balance check)
3. Balance inquiry
4. Exit

User has **3 login attempts**.

---

### **Project21GCDLCMCalculator**

Finds:

- **GCD (Greatest Common Divisor)**
- **LCM (Least Common Multiple)** → `LCM = (n1 * n2) / GCD`

---

### **Project22MinMaxFinder**

Reads multiple numbers and prints the **minimum** and **maximum**.

---

### **Project23PerfectNumberChecker**

Checks if a number is **Perfect**:

- 28 → 1 + 2 + 4 + 7 + 14 = 28 ✅
- 12 → 1 + 2 + 3 + 4 + 6 = 16 ❌

---

### **Project24ReversePyramid**

Prints a **reverse triangle star pattern** using nested loops.

---

### **Project25Fibonacci**

Prints the **Fibonacci sequence** up to n.  
Example: Input = 9 → Output = `0 1 1 2 3 5 8 13 21`

---

### **Project26PalindromNumber**

Checks if a number is **palindrome** (same forward & backward).  
Example: `121`, `242` ✅

---

### **Project27CalculatorMachine**

An **advanced calculator** with:

- Addition
- Subtraction
- Multiplication
- Division (zero check)
- Exponentiation
- Factorial
- Modulus
- Rectangle area & perimeter

---

### **Project28RecursivePower**

Calculates exponentiation **recursively**.

---

### **Project29OOPStudentSystem**

OOP demo with **Teacher, Course, Student** classes:

- Teacher → name, phoneNo, branch
- Course → code, prefix, assigned teacher
- Student → courses, grades, average, pass/fail check

---

### **Project30BoxMatch**

Boxing simulation using OOP:

- **Fighter** → attributes: name, damage, health, dodge chance
- **Ring** → simulates match, checks weight class, prints scores
- **MainBoxMatch** → runs a fight between two fighters

---

### **Project31HarmonicMean**

Calculates the **harmonic mean** of an array.  
Formula: `HM = n / (1/a1 + 1/a2 + … + 1/an)`

---

### **Project32ClosestNumberInArray**

Finds the **closest smaller and greater numbers** relative to a given input in an array.

---

### **Project33LetterAWithStars**

A Java program that prints the letter **A** using a **2D array** and stars (`*`).

- Creates a 6x4 matrix of strings.
- Fills the first row, middle row, and the first/last columns with `*` to form the shape of the letter A.
- Uses nested loops to build the pattern and prints the result row by row.

---

### **Project34DuplicateEvenNumbers**

A Java program that finds **duplicate even numbers** in an array.  
The program:

- Iterates over all elements of the array.
- Checks if the number is both **even** and **repeated**.
- Stores duplicates only once using a helper method (`isFind`).
- Prints the list of duplicate even numbers.

**Example Input:**  
`{1, 2, 12, 12, 2, 4, 6, 11, 13, 4, 8, 4, 1, 3, 3}`

**Output:**  
`[2, 12, 4]`

---

### **Project35ArraySorter**

A Java program that sorts the elements of an array in **ascending order**.
- User first enters the **size** of the array.
- Then provides each element one by one.
- The program uses `Arrays.sort()` to sort the elements.
- Finally, it prints the sorted array.

**Example Run:**

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/emircantasciogluu/java101.git
