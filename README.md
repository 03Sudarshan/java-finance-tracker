# 💰 Java Finance Tracker

A simple command-line application written in Java to help users track income and expenses and view their current balance.

---

## 🚀 Features

- Add income entries with descriptions and amounts.
- Add expense entries with descriptions and amounts.
- View current balance.
- Exit the application anytime.

---

## 🧠 How It Works

Users interact with a simple text menu:
1. Enter income
2. Enter expense
3. View balance
4. Exit

Each transaction is stored in memory during runtime and updates the overall balance accordingly.

---

## 🛠️ Technologies Used

- Java 8+
- VS Code (or any Java IDE)
- Git for version control

---

## 🧪 Running the Application

### ✅ Prerequisites
Make sure you have:
- Java installed (`javac` and `java` should be available in your terminal)
- Git installed (optional)

### ⚙️ Compile the Code

In the terminal:

```bash
javac src/*.java
▶️ Run the App
bash
Copy code
java -cp src Main
📁 Project Structure
bash
Copy code
java-finance-tracker/
│
├── src/
│   ├── Main.java              # Main class with the user menu
│   ├── FinanceManager.java    # Logic for handling balance and transactions
│   └── Transaction.java       # Data structure to represent a transaction
│
└── README.md
📌 Example Interaction
plaintext
Copy code
Welcome to the Java Finance Tracker!
1. Add income
2. Add expense
3. View balance
4. Exit
Enter your choice: 1

Enter income description: Freelance
Enter income amount: 500

Transaction added!

Enter your choice: 3
Current balance: $500.0
📝 License
This project is open source and free to use under the MIT License.

🙋‍♂️ Author
Created by @03Sudarshan — contributions welcome!

yaml
Copy code

---

Let me know if you'd like badges, GIFs, or screenshots added!
