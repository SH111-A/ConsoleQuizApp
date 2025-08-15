# Console Quiz App

A simple Java console-based quiz application that allows users to select a topic and answer multiple-choice questions. This project helps beginners understand Java concepts like classes, objects, packages, input/output, and modular code design.

## 🚀 Features

- Choose from multiple quiz topics (Java Basics, SQL, etc.)
- Colored console UI using ANSI escape codes
- Score calculation and feedback
- Easy to add new topics and questions

## 📂 Project Structure

ConsoleQuizApp/
│
├── src/

│ └── com/quiz/

│ ├── Main.java

│ ├── ConsoleColors.java

│ ├── model/
│ │ └── QuizTopic.java

│ ├── service/
│ │ └── QuizEngine.java

│ └── ui/
│ └── ConsoleUI.java

├── out/ # Compiled classes
└── README.md

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
