# Banking Application Assignment
## Description
This is a console-based banking application that allows users to manage multiple types of accounts for different customers. Users can deposit, withdraw, view balances, and calculate interest through an interactive menu-driven interface.

## Features
- Create Customers and Accounts
- Show account balances
- Deposit money into accounts
- Withdraw money from accounts
- Calculate interest for eligible accounts (SavingsAccount and InvestmentAccount)
- Interactive menu-driven user interface

## Compilation
1. Open a terminal in the repository root.
2. Create the `out` folder if it doesn't exist:
  
mkdir -p out

Compile all Java files:

javac -d out src/app/Main.java src/model/*.java

Running the Program
After compilation, run the program with:

java -cp out app.Main

The menu will appear.
Follow the prompts to:
Show accounts and balances
Deposit money
Withdraw money
Calculate interest
Exit the program

Notes
Withdrawals are not allowed from SavingsAccount.
ChequeAccount does not earn interest.
InvestmentAccount requires a minimum initial deposit of BWP500.
All monetary inputs must be positive numbers.