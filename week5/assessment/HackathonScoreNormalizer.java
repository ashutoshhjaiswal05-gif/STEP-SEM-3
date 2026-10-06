import java.util.Arrays;

public class HackathonScoreNormalizer {
    public static void normalizeScores(double[] scores, double maxScore) {
        if (maxScore <= 0) return;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = (scores[i] / maxScore) * 100.0;
        }
    }

    public static void main(String[] args) {
        double[] scores = {70.0, 85.0, 60.0};
        normalizeScores(scores, 100.0);
        System.out.println(Arrays.toString(scores));
    }
}
