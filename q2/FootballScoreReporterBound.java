package q2;

import java.util.Scanner;

public class FootballScoreReporterBound {
    public static void main(String[] args) {
        LiveScoreBean scoreBean = new LiveScoreBean();

        ScoreDisplaySubscriber subscriber1 = new ScoreDisplaySubscriber("Score Display 1");
        LiveResultSubscriber subscriber2 = new LiveResultSubscriber("Live Result Display 2");

        scoreBean.addPropertyChangeListener("scoreLine", subscriber1);
        scoreBean.addPropertyChangeListener("scoreLine", subscriber2);

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("=== Football Score Reporter (Bound Properties) ===");
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

            scoreBean.setScoreLine(input);
        }

        scanner.close();
    }
}
