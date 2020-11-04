/*
 * Evan Kreutzwiser & Lukas Krampiz ProjectManagementProject
 * November 4, 2020
 * A Question class which contains a question, 4 multiple choice answers, which 
 * answer is correct, and which answer the user chose.
 * Provides methods for manipulating the question's properties and checking if 
 * the user was correct
 */
package krampitzkreutzwiserics4u;

/**
 * 
 * @author Evan
 */
public class Question {
  
    // Attributes
    // The question and 4 multiple choice answers
    private String question, choice1, choice2, choice3, choice4;
    // Integers representing the correct answer and the user's answer
    // Answer values range from 1 to 4, with 0 representing no answer
    int correctAnswer, userAnswer;
    
    /**
     * Constructor to create a blank question object
     */
    public Question() {
        // Initialize all of the question's attributes
        
        // Set the question and answers to empty strings
        question = "";
        choice1 = "";
        choice2 = "";
        choice3 = "";
        choice4 = "";
        
        // Set the answer variables to 0, since there is no correct answer
        correctAnswer = 0;
        userAnswer = 0;
    }
    
    /**
     * Constructor to create a Question with a question but no answers
     * @param question A String containing the question
     */
    public Question(String question) {
        this(); // Chain constructors to initialize the question
        
        // Set the question to the given string
        this.question = question;
    }
    
    /**
     * Constructor to create a Question with 4 multiple choice answers
     * @param question A String containing the question 
     * @param choice1 The first multiple choice answer
     * @param choice2 The second multiple choice answer
     * @param choice3 The third multiple choice answer
     * @param choice4 The forth multiple choice answer
     */
    public Question(String question, String choice1, String choice2, String choice3, String choice4) {
        this(question); // Chain constructors to set the question string and initialize the object
        
        // Set the multiple choice answers
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
    }
    
    /**
     * Constructor to create a question with 4 multiple choice answers where 1 of the answers is marked as correct
     * @param question A String containing the question 
     * @param choice1 The first multiple choice answer
     * @param choice2 The second multiple choice answer
     * @param choice3 The third multiple choice answer
     * @param choice4 The forth multiple choice answer
     * @param correctAnswer An integer from 1 to 4 representing the correct answer
     */
    public Question(String question, String choice1, String choice2, String choice3, String choice4, int correctAnswer) {
        this(question, choice1, choice2, choice3, choice4); // Chain constructors to create the multiple choice question
        
        // Set which answer is the correct answer
        this.correctAnswer = correctAnswer;
    }
    
    
    /**
     * Get the String containing the question
     * @return The question
     */
    public String getQuestion() {
        return question;
    }
    
    /**
     * Set the question
     * @param newQuestion The new question as a String 
     */
    public void setQuestion(String newQuestion) {
        question = newQuestion;
    }

    /**
     * Get one of the question's 4 multiple choice answers as a String
     * @param choice An integer between 1 and 4 representing which answer to get
     * @return The multiple choice answer as a String
     */
    public String getChoice(int choice) {
        // Return the multiple choice answer that the caller requesed
        switch (choice) {
            case 4:  // Answer 4
                return choice4;
                
            case 3:  // Answer 3
                return choice3;
                
            case 2:  // Answer 2
                return choice2;
                
            default: // Answer 1
                return choice1;
        }
        // If the caller requests an asnwer outside of the 1-4 range, answer 1 is returned
    }
    
    /**
     * Set one of the question's 4 multiple choice answers
     * @param choice An integer between 1 and 4 representing which answer to set
     * @param newChoice The new answer
     */
    public void setChoice(int choice, String newChoice) {
        
        // Set the answer that the caller requested to change
        switch (choice) {
            case 1:  // Set answer 1
                choice1 = newChoice;
                break;
                
            case 2:  // Set answer 2
                choice2 = newChoice;
                break;
                
            case 3:  // Set answer 3
                choice3 = newChoice;
                break;
                
            case 4:  // Set answer 4
                choice4 = newChoice;
                break;
        }
        // If the caller requested to change an answer outside of the 1 to 4 range,
        // nothing is changed
    }
    
    /**
     * Get an integer representing which multiple choice answer is correct
     * @return An integer from 1 to 4 representing which answer is correct
     */
    public int getCorrectAnswer() {
        return correctAnswer;
    }
    
    /**
     * Set which multiple choice answer is correct
     * @param newAnswer An integer between 1 and 4 representing the correct answer
     */
    public void setCorrectAnswer(int newAnswer) {
        correctAnswer = newAnswer;
    }
    
    /**
     * Get the user's answer as an integer representing which answer they picked
     * @return The user's answer represented by an integer between 1 and 4
     */
    public int getUserAnswer() {
        return userAnswer;
    }
    
    /**
     * Set the answer that the user picked
     * @param newAnswer An integer from 1 to 4 representing answer selected by the user 
     */
    public void setUserAnswer(int newAnswer) {
        userAnswer = newAnswer;
    }
    
    
    /**
     * Create an identical Question object
     * @return The new question object
     */
    @Override
    public Question clone() {
        // Create a new Question object with the same question, answers, and correct answer 
        Question copy = new Question(question, choice1, choice2, choice3, choice4, correctAnswer);
        
        // Set the new question's user answer
        copy.userAnswer = userAnswer;
        
        // Return the new copy of the question
        return copy;
    }
    
    /**
     * Check is a Question object is equal to another
     * @param other The Question to compare to
     * @return Whether or not they are the same
     */
    public boolean equals(Question other) {
    
        // Compare every attribute of the 2 Questions at onces
        // Return true if all of the attributes of both Questions are the same
        return question.equals(other.question)
                && choice1.equals(other.choice1)
                && choice2.equals(other.choice2)
                && choice3.equals(other.choice3)
                && choice4.equals(other.choice4)
                && correctAnswer == other.correctAnswer
                && userAnswer == other.userAnswer;
    }
    
    /**
     * Create a String representing the question and it's answers
     * @return The Question object as a string
     */
    @Override
    public String toString() {
        // Create and return a string maade of the question, the answers, and the user's answer
        return "Question: " + question + "\n"
                + "Answer 1: " + choice1 + "\n"
                + "Answer 2: " + choice2 + "\n"
                + "Answer 3: " + choice3 + "\n"
                + "Answer 4: " + choice4 + "\n"
                + "Correct Answer: " + correctAnswer + "\n"
                + "User's Answer: " + userAnswer + "\n";
    }
    
    
    /**
     * Get whether the user's answer is correct or not
     * @return A boolean representing is the user answered correctly
     */
    public boolean isCorrect() {
        // Return wether or not the user's answer matches the correct answer
        return userAnswer == correctAnswer;
    }

}
