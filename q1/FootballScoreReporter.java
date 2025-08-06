package q1;

import java.util.Scanner;

public class FootballScoreReporter {
    public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();

        LiveScoreSubscriber subscriber1 = new LiveScoreSubscriber("Live Display 1");
        ScoreDisplaySubscriber subscriber2 = new ScoreDisplaySubscriber("Score Board 2");

        scoreSource.registerListener(subscriber1);
        scoreSource.registerListener(subscriber2);

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("=== Football Score Reporter ===");
        System.out.println("Enter football scores (Press Enter without input to exit)");
        System.out.println("Example: Thai 1-0 UAE");
        System.out.println();

        while (true) {
            System.out.print("Enter Score: ");
            input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Program terminated. Goodbye!");
                break;
            }

            scoreSource.setScoreLine(input);
        }

        scanner.close();
    }
}
