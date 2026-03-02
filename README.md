# PalindroneCheckerApp
PalindromeCheckerApp
A lightweight Java-based command-line utility designed to validate whether a given string—be it a word, number, or full sentence—is a palindrome.

🚀 Running Procedure
To run this application on your local machine, follow these steps:

Prerequisites: Ensure you have the Java Development Kit (JDK) installed.

Compilation: Open your terminal or command prompt and navigate to the project folder. Run:
javac PalindroneCheckerApp.java

Execution: Run the compiled class using:
java PalindroneCheckerApp

Interaction: Follow the on-screen prompts to enter text for validation.

🔄 Flow of Project
The application follows a linear logic path to ensure high accuracy:

Input Collection: Receives a string from the user via Scanner.

Normalization: The app strips all non-alphanumeric characters (punctuation, spaces) and converts the text to lowercase.

Reversal: Utilizing the StringBuilder class, the cleaned string is reversed.

Comparison: The app compares the normalized original with the reversed version.

Output: Returns a boolean result ("Yes" or "No") to the console.

🎯 Objective
The primary goal of this project is to provide a robust validation tool that handles real-world text. Unlike basic checkers, this objective includes handling complex palindromic sentences (like "Madam, I'm Adam") by ignoring formatting and casing.

📚 Topics Covered
This project serves as a practical implementation of several core Java concepts:

String Manipulation: Using replaceAll() with Regular Expressions (Regex).

Input/Output (I/O): Working with the java.util.Scanner class.

Object Methods: Leveraging StringBuilder for efficient memory management.

Conditional Logic: Implementing if-else structures for result reporting.

Methods: Modularizing code into reusable static functions.

💡 Use Case
Educational Tool: A classic example for computer science students learning about strings and algorithms.

Data Cleaning: Demonstrates how to sanitize user input before processing.

Coding Challenges: A foundational template for competitive programming problems involving string symmetry.