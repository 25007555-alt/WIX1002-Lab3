# WIX1002 Fundamentals of Programming

## Lab 3: Flow of Control (Selection)

This folder contains one Java program for each Lab 3 exercise. Each source file has its own `main` method and can be compiled and run independently.

## Programs

1. `Q1SimpleCalculator.java` - performs integer addition, subtraction, multiplication, division, or remainder based on an operator character.
2. `Q2RandomNumberWord.java` - generates a random integer from 0 to 5 and prints it in words.
3. `Q3SalesCommission.java` - calculates the commission using the sales bands in the lab handout and displays two decimal places.
4. `Q4DiceGame.java` - rolls two dice for each of two players, totals the scores, and reports the winner or a tie.
5. `Q5CramersRule.java` - solves the two linear equations with Cramer's rule, or prints the required no-solution message when the determinant is zero.
6. `Q6PointInCircle.java` - classifies a coordinate point as inside, on, or outside a circle centered at the origin.

## Compile and run

Open a terminal in this folder. Compile and run one exercise at a time:

```text
javac Q1SimpleCalculator.java
java Q1SimpleCalculator
```

Replace `Q1SimpleCalculator` with the class name for the exercise you want to run. For example, compile and run Question 4 with:

```text
javac Q4DiceGame.java
java Q4DiceGame
```

The programs use standard Java classes only (`Scanner`, `Random`, and `Locale`).
