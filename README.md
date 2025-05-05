# S1.04.Testing.Lv1.Ex1
# 📚📖 Library Management System - Sorting by Title

## Exercise Description  
The goal of this exercise is to create a simple Java system to manage a collection of books within a library. You will create three classes: `Book`, `Library`, and `LibraryManagerTest`. The system allows adding, retrieving, inserting, and removing books while keeping the list alphabetically ordered by title.

### Requirements:
- Create a `Book` class with a title attribute.
- Create a `Library` class that manages a list of books.
- Ensure that:
  - Books can be added to the collection.
  - The entire book list can be retrieved.
  - A book title can be retrieved by its position.
  - A book can be inserted at a specific position.
  - A book can be removed by title.
  - The list remains alphabetically sorted.
  - Duplicated book titles are not allowed.
- Create a `LibraryManagerTest` class using JUnit to verify all functionalities.

### Methods Implemented:
- `addBook(Book book)`
- `getBooks()`
- `getBookTitleAt(int index)`
- `addBookAt(Book book, int index)`
- `removeBookByTitle(String title)`

## 💻 Technologies Used
- Java 17  
- IntelliJ IDEA (Community Edition)  
- JUnit 5  
- Maven or Gradle (optional, based on setup)

## 📋 Prerequisites
- Java JDK 17 installed  
- IntelliJ IDEA Community Edition  
- Git (optional, for version control)  
- Maven or Gradle configured (if using dependency management)

## 🛠️ Installation and Setup

### 1. Install Required Tools
- **Java JDK 17**: [Download Java](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)  
- **IntelliJ IDEA Community Edition**: [Download IntelliJ](https://www.jetbrains.com/idea/download)  
- **Maven or Gradle** (optional): Install your preferred build tool if required.

### 2. Clone the Repository (Optional)
If you are using version control:

```bash
git clone https://github.com/ArnauAsole/S1.04.Testing.Lv1.git
cd ArnauAsole/S1.04.Testing.Lv1/
```

3. Open the Project
Open the project folder in IntelliJ IDEA by going to File → Open and selecting the root directory of your project.

▶️ Running the Project
To run the application:

Open the LibraryManagerTest.java file.

Right-click and select Run or use the green arrow to execute the JUnit tests.

All test cases should pass, verifying the correct behavior of the system.

You will see JUnit test results such as:

java

✓ testBookListIsNotNull
✓ testBookListSizeAfterAdding
✓ testBookAtSpecificPosition
✓ testNoDuplicateTitles
✓ testGetBookTitleAtSpecificPosition
✓ testAddBookAtSpecificPosition
✓ testRemoveBookReducesSize
✓ testBooksRemainAlphabeticallySorted
🌐 Deployment
This is a console-based Java project intended for local execution in your IDE. No deployment is required.

🤝 Acknowledgements
Special thanks to all contributors who helped with the development of this project: Arnau, Adrià, Ignasi, Ana, Alejandro.

# S1.04.Testing.Lv1.Ex2

# 🆔🔠 DNI Letter Calculator - Parametrized JUnit Testing

## Exercise Description  
The goal of this exercise is to create a Java class `DniCalculator` that calculates the letter corresponding to a Spanish DNI number. The system receives a numeric DNI (integer from 0 to 99,999,999) and returns the correct letter based on the official algorithm. Additionally, a JUnit test class verifies that the letter is calculated correctly using a wide range of test cases with parameterized data.

### Requirements:
- Create a `DniCalculator` class that:
  - Receives an integer DNI number.
  - Returns the correct letter using the standard formula (`dni % 23`).
  - Throws an exception if the number is out of the valid range (0–99,999,999).
- Create a `DniCalculatorTest` class using JUnit 5.
  - Parameterize the test to validate the output for 10 predefined DNI numbers.
  - Ensure all results match the expected letter.

### Methods Implemented:
- `calculateLetter(int dniNumber)` – Returns the corresponding letter of the DNI number.

## 💻 Technologies Used
- Java 17  
- IntelliJ IDEA (Community Edition)  
- JUnit 5  
- Maven or Gradle (optional, based on setup)

## 📋 Prerequisites
- Java JDK 17 installed  
- IntelliJ IDEA Community Edition  
- Git (optional, for version control)  
- Maven or Gradle configured (if using dependency management)

## 🛠️ Installation and Setup

### 1. Install Required Tools
- **Java JDK 17**: [Download Java](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)  
- **IntelliJ IDEA Community Edition**: [Download IntelliJ](https://www.jetbrains.com/idea/download)  
- **Maven or Gradle** (optional): Use your preferred build tool.

### 2. Clone the Repository (Optional)
If you're using version control:

```bash
git clone https://github.com/ArnauAsole/S1.04.Testing.Lv1.git
cd S1.04.Testing.Lv1/
```

3. Open the Project
Open the project folder in IntelliJ IDEA by going to File → Open and selecting the root directory of your project.

▶️ Running the Project
Option 1: Run JUnit Tests
Open the DniCalculatorTest.java file.

Right-click and choose Run, or use the green arrow to execute the tests.

You should see output similar to:

java

✓ testDniLetterCalculation[12345678, Z]
✓ testDniLetterCalculation[87654321, X]
✓ testDniLetterCalculation[11111111, H]
✓ testDniLetterCalculation[22222222, J]
✓ testDniLetterCalculation[33333333, T]
✓ testDniLetterCalculation[44444444, M]
✓ testDniLetterCalculation[55555555, C]
✓ testDniLetterCalculation[66666666, Y]
✓ testDniLetterCalculation[77777777, B]
✓ testDniLetterCalculation[88888888, F]
Option 2: Run from Main.java (optional)
If included, you can also run Main.java to input a DNI number manually and see the result in the console.

🌐 Deployment
This is a simple Java console-based project meant for local testing in your IDE. No deployment is required.

🤝 Acknowledgements
Special thanks to all contributors who helped with the development of this project: Arnau, Adrià, Ignasi, Ana, Alejandro.
