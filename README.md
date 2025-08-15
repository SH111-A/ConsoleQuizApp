# Console Quiz App

A simple Java console-based quiz application that allows users to select a topic and answer multiple-choice questions. This project helps beginners understand Java concepts like classes, objects, packages, input/output, and modular code design.

## 🚀 Features

- Choose from multiple quiz topics (Java Basics, SQL, etc.)
- Colored console UI using ANSI escape codes
- Score calculation and feedback
- Easy to add new topics and questions
# Console Quiz App

A simple Java-based console quiz application that allows users to select a topic and answer multiple-choice or descriptive questions. It displays the score at the end of the quiz.

## 🗂️ Project Structure

ConsoleQuizApp/
│
├── src/

│ └── com/

│ └── quiz/

│ ├── Main.java

│ ├── ConsoleColors.java

│ ├── model/

│ │ └── QuizTopic.java

│ ├── service/

│ │ └── QuizEngine.java

│ └── ui/

│ └── ConsoleUI.java

│
├── out/ # Compiled .class files go here

├── README.md

bash
Copy
Edit

## ▶️ How to Compile and Run

```bash
# Navigate to the project directory
cd ConsoleQuizApp

# Compile all Java files
javac -d out src/com/quiz/**/*.java

# Run the application
java -cp out com.quiz.Main
🧪 Sample Output
markdown
Copy
Edit
===== Welcome to the Quiz App =====
Choose a topic:
1. Java Basics
2. SQL
3. Operating System

Enter your choice: 1

1. What is JVM?
Your answer: Java Virtual Machine
Correct!

2. What is inheritance?
Your answer: Reuse of code
Correct!

3. What is polymorphism?
Your answer: Many forms
Correct!

You scored 3/3
If you answer incorrectly:

yaml
Copy
Edit
2. What is inheritance?
Your answer: Inheriting
Wrong! Correct answer: Reuse of code                 # Git ignore rules (optional)

## 🛠 How to Run

1. **Compile the source:**

```bash
javac -d out src/com/quiz/**/*.java
Run the application:
java -cp out com.quiz.Main

📚 Topics Included
1.Java Basics
2.SQL
(You can add more topics in ConsoleUI.java)

🤝 Contributing
Feel free to fork and add more topics or features! Pull requests are welcome.

📝 License
This project is open source and free to use.

privew:
<img width="639" height="903" alt="Screenshot 2025-08-15 120734" src="https://github.com/user-attachments/assets/b93061a5-33b6-4bb7-bb6e-a4bfed54b694" />



