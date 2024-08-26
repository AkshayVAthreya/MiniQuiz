import java.util.Scanner;
    public class SimpleQuiz {
     public static void main(String[] args) {
        String[][] quizData = {
         {"What is the capital of France?", "Paris"},
         {"Which programming language is this quiz written in?", "Java"},
        {"What is the largest mammal?", "Blue Whale"},
         {"What is the boiling point of water in Celsius?", "100"},
         {"Who wrote 'To Kill a Mockingbird'?", "Harper Lee"},
         {"What is the smallest prime number?", "2"},
         {"In which year did the Titanic sink?", "1912"},
         {"What is the chemical symbol for gold?", "Au"},
         {"Which planet is known as the Red Planet?", "Mars"},
         {"Who painted the Mona Lisa?", "Leonardo da Vinci"},
         {"What is the square root of 64?", "8"},
         {"What is the largest continent?", "Asia"},
         {"Who was the first President of the United States?", "George Washington"},
        {"What is the hardest natural substance on Earth?", "Diamond"},
         {"Which element has the atomic number 1?", "Hydrogen"},
        {"What is the longest river in the world?", "Nile"},
        {"In which year did World War II end?", "1945"},
        {"Who discovered penicillin?", "Alexander Fleming"},
         {"What is the main ingredient in guacamole?", "Avocado"},
         {"Which planet is closest to the Sun?", "Mercury"}
         };
     Scanner scanner = new Scanner(System.in);
    int score = 0;
    for (int i = 0; i < quizData.length; i++) {
    // Display the question
        System.out.println(quizData[i][0]);
        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine();
        if (userAnswer.equalsIgnoreCase(quizData[i][1])) {
            System.out.println("Correct!\n");
            score++;
            }
         else {
            System.out.println("Incorrect. The correct answer is: " + quizData[i][1] + "\n");
            }
        }
    System.out.println("Quiz completed! Your score: " + score + "/" + quizData.length);
     scanner.close();
 }
}
