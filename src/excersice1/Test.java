package excersice1;

import javax.swing.*;
import java.security.SecureRandom;

public class Test {
    private int rightAns = 0;
    private int wrongAns = 0;
    private SecureRandom randomNumber = new SecureRandom();

    private String simulateQuestion(String question) {
        return JOptionPane.showInputDialog(null, question, "Quiz", JOptionPane.QUESTION_MESSAGE);
    }

    public void inputAnswer() {
        String[] mcq = {
                "1. Method arguments may be_\nA)passed by value\nB)passed by reference\nC)both A and B\nD)none of the options",
                "2. Who invented Java?\nA)James Gosling\nB)Bjarne Stroustrup\nC)Rithika Raj Kumar\nD)Dennis Ritchie",
                "3. Which package contains the Random class?\nA)java.util\nB)java.io\nC)java.lang\nD)java.security",
                "4. Which of the following is a reserved keyword in Java?\nA)class\nB)method\nC)int\nD)string",
                "5. Which of these cannot be used for a variable name in Java?\nA)1stVariable\nB)myVariable\nC)@variable\nD)variableName"
        };

        String[] answers = {"A", "A", "A", "A", "C"};
        String input;
        for (int r = 0; r < mcq.length; r++) {
            input = simulateQuestion(mcq[r]);
            checkAnswer(input, answers[r]);
        }

        Results();
    }

    private void checkAnswer(String user, String rightAnswer) {
        if (user != null && user.trim().toUpperCase().equals(rightAnswer)) {
            rightAns++;
            generateMessage(true);
        } else {
            wrongAns++;
            generateMessage(false, rightAnswer);
        }
    }

    private void generateMessage(boolean isCorrect) {
        String message;
        switch (randomNumber.nextInt(4)) {
            case 0:
                message = "Excellent!";
                break;
            case 1:
                message = "Good!";
                break;
            case 2:
                message = "Keep up the good work!";
                break;
            case 3:
                message = "Nice work!";
                break;
            default:
                message = "Great job!";
                break;
        }
        JOptionPane.showMessageDialog(null, message, "Feedback", JOptionPane.INFORMATION_MESSAGE);
    }

    private void generateMessage(boolean isCorrect, String rightAnswer) {
        String message;
        switch (randomNumber.nextInt(4)) {
            case 0:
                message = "No. Please try again. Correct answer: " + rightAnswer;
                break;
            case 1:
                message = "Wrong. Try once more. Correct answer: " + rightAnswer;
                break;
            case 2:
                message = "Don't give up! Correct answer: " + rightAnswer;
                break;
            case 3:
                message = "No. Keep trying. Correct answer: " + rightAnswer;
                break;
            default:
                message = "Try again! Correct answer: " + rightAnswer;
                break;
        }
        JOptionPane.showMessageDialog(null, message, "Feedback", JOptionPane.ERROR_MESSAGE);
    }

    private void Results() {
        int totalQn = rightAns + wrongAns;
        double percentage = ((double) rightAns / totalQn) * 100;
        String resultMessage = String.format("Right Answers: %d \nWrong Answers: %d \nPercentage: %.2f%%", rightAns, wrongAns, percentage);
        JOptionPane.showMessageDialog(null, resultMessage, "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
