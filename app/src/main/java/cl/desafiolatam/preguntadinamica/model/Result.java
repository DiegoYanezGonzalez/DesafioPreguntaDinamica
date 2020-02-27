package cl.desafiolatam.preguntadinamica.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {
    private String category;
    private String type;
    private String difficulty;
    private String question;

    public void setCategory(String category) {
        this.category = category;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setIncorrectAnswer(List<String> incorrectAnswer) {
        this.incorrectAnswer = incorrectAnswer;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public List<String> getIncorrectAnswer() {
        return incorrectAnswer;
    }

    @SerializedName("correct_answer")
    private String correctAnswer;
    @SerializedName("incorrect_answers")
    private List<String> incorrectAnswer;
}
