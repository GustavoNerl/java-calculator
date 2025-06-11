# 📐 Simple Calculator with TDD

This is a basic Java calculator project developed using **Test-Driven Development (TDD)** and tested with **JUnit 5**.

## ✅ Features

The calculator supports the following operations:

- ➕ Sum (`sum`)
- ➖ Subtraction (`subtract`)
- ✖️ Multiplication (`multiply`)
- ➗ Division (`divide`) — supports decimal results

All methods were implemented following the TDD approach:
1. Write the test
2. Run and fail
3. Write the implementation
4. Refactor if needed

## 🧪 Tests

All tests are written using JUnit 5.  
They are located in the `CalculatorTest` class and cover all calculator operations.

Example test:
```java
@Test
public void mustDivide() {
    Calculator calc = new Calculator();
    double result = calc.divide(2, 3);
    Assertions.assertEquals(0.666, result, 0.001);
}
```
## 💻 How to Run
1. Clone the repository

2. Open the project in your favorite IDE (IntelliJ, Eclipse, etc.)

3. Run the test class: CalculatorTest.java

4. All tests should pass ✅

## 🛠️ Technologies
Java 17+

JUnit 5

## 👨‍💻 Author
Created by Gustavo Neri — as a TDD learning exercise.

