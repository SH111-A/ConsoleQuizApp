package com.quiz.model;

import java.util.List;

public class QuizTopic {
    private String topicName;
    private List<String> questions;
    private List<String> answers;

    public QuizTopic(String topicName, List<String> questions, List<String> answers) {
        this.topicName = topicName;
        this.questions = questions;
        this.answers = answers;
    }

    public String getTopicName() {
        return topicName;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public List<String> getAnswers() {
        return answers;
    }
}
