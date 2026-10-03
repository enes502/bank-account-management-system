# 🏧 Java ATM & Bank Account Simulation

A fully-featured command-line banking application built with **Java**, implementing **Object-Oriented Programming (OOP)** principles. This system allows users to create multiple bank accounts, authenticate securely with login limits, manage funds, calculate interests, and customize 4-digit passwords following strict validation rules.

---

## 🚀 Features

*   **Multi-Account Management:** Initialize and manage multiple user accounts dynamically using arrays.
*   **Secure Authentication:** Login system with a 3-attempt restriction per session.
*   **Smart Password Generation & Validation:** 
    *   Generates secure 4-digit default passwords.
    *   Ensures passwords do not start with `0` and contain no consecutive identical digits.
    *   Allows users to manually update their passwords adhering to the same safety constraints.
*   **Financial Operations:**
    *   View real-time account balances.
    *   Deposit and withdraw funds with balance validation checks.
    *   Calculate net interest earnings over custom months.
*   **Detailed Account Summary:** Custom `toString` implementation to display user information, identification numbers, and generated unique account numbers.

---

## 📂 Project Structure

```text
├── Account.java      # Manages user details, balances, secure password algorithms, and transactions
├── Atm.java          # Handles the interactive menu and banking operations logic
├── Logn.java         # Handles user authentication and credential verification
└── Main.java         # Entry point for multi-account creation and session control
└── README.md         # Project documentation

javac Main.java Account.java Atm.java Logn.java
java Main
