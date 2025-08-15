package com.quiz.service;

import com.quiz.model.QuizTopic;
import com.quiz.ConsoleColors;

import java.util.List;
import java.util.Scanner;

public class QuizEngine {
    public void runQuiz(QuizTopic topic) {
        Scanner sc = new Scanner(System.in);
        List<String> questions = topic.getQuestions();
        List<String> answers = topic.getAnswers();

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            System.out.println(ConsoleColors.CYAN + (i + 1) + ". " + questions.get(i) + ConsoleColors.RESET);
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(answers.get(i))) {
                System.out.println(ConsoleColors.GREEN + "Correct!" + ConsoleColors.RESET);
                score++;
            } else {
                System.out.println(ConsoleColors.RED + "Wrong! Correct answer: " + answers.get(i) + ConsoleColors.RESET);
            }
        }

        System.out.println(ConsoleColors.YELLOW + "You scored " + score + "/" + questions.size() + ConsoleColors.RESET);
    }
}
