package com.quiz.ui;

import com.quiz.model.QuizTopic;
import com.quiz.service.QuizEngine;
import com.quiz.ConsoleColors;

import java.util.*;

public class ConsoleUI {
    private final Scanner scanner = new Scanner(System.in);
    private final QuizEngine quizEngine = new QuizEngine();
    private final List<QuizTopic> topics = new ArrayList<>();
//change this to add questions and answers for the quiz
//javac -d out src/com/quiz/Main.java src/com/quiz/ConsoleColors.java src/com/quiz/model/QuizTopic.java src/com/quiz/service/QuizEngine.java src/com/quiz/ui/ConsoleUI.java
//then run: java -cp out com.quiz.Main

//to add topics(choice):
//javac -d out src/com/quiz/*.java src/com/quiz/model/*.java src/com/quiz/service/*.java src/com/quiz/ui/*.java
//java -cp out com.quiz.Main


    public ConsoleUI() {
    topics.add(new QuizTopic("Java Basics",
            Arrays.asList("What is JVM?", "What is inheritance?", "What is polymorphism?"),
            Arrays.asList("Java Virtual Machine", "Reuse of code", "Many forms")));

    topics.add(new QuizTopic("SQL",
            Arrays.asList("What does SQL stand for?", "What is a primary key?", "What is a foreign key?"),
            Arrays.asList("Structured Query Language", "Unique identifier", "Reference key from another table")));

            topics.add(new QuizTopic("OOP Concepts",
            Arrays.asList("What are the 4 pillars of OOP?", "What is encapsulation?", "What is abstraction?"),
            Arrays.asList("Encapsulation, Inheritance, Polymorphism, Abstraction", "Hiding internal details", "Hiding complexity")));
}



    public void start() {
        System.out.println(ConsoleColors.YELLOW + "===== Welcome to the Quiz App =====" + ConsoleColors.RESET);
        System.out.println("Choose a topic:");

        for (int i = 0; i < topics.size(); i++) {
            System.out.println((i + 1) + ". " + topics.get(i).getTopicName());
        }

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (choice > 0 && choice <= topics.size()) {
            quizEngine.runQuiz(topics.get(choice - 1));
        } else {
            System.out.println(ConsoleColors.RED + "Invalid choice." + ConsoleColors.RESET);
        }
    }
}
