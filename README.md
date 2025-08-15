# Console Quiz App

A simple Java console-based quiz application that allows users to select a topic and answer multiple-choice questions. This project helps beginners understand Java concepts like classes, objects, packages, input/output, and modular code design.

## 🚀 Features

- Choose from multiple quiz topics (Java Basics, SQL, etc.)
- Colored console UI using ANSI escape codes
- Score calculation and feedback
- Easy to add new topics and questions

ConsoleQuizApp/
│
├── src/                                # Source code directory
│   └── com/
│       └── quiz/
│           ├── Main.java               # Entry point of the quiz app
│           ├── ConsoleColors.java      # Utility for coloring console output
│
│           ├── model/
│           │   └── QuizTopic.java      # Model for holding topic name, questions, and answers
│
│           ├── service/
│           │   └── QuizEngine.java     # Core logic for running and scoring the quiz
│
│           └── ui/
│               └── ConsoleUI.java      # User interface and topic selection
│
├── out/                                # Compiled class files
│
├── README.md                           # Project overview and setup instructions
└── .gitignore                          # Git ignore rules (optional)

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
