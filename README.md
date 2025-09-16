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


## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/emircantasciogluu/java101.git
