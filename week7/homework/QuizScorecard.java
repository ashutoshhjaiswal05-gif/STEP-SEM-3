class Scorecard {
    private boolean[] results;
    private int count;

    public Scorecard(int maxQuestions) {
        results = new boolean[maxQuestions];
        count = 0;
    }

    public void addResult(boolean isCorrect) {
        if (count < results.length) {
            results[count++] = isCorrect;
        }
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < count; i++) {
            if (results[i]) score++;
        }
        return score;
    }
}

public class QuizScorecard {
    public static void main(String[] args) {
        Scorecard card = new Scorecard(10);
        card.addResult(true);
        card.addResult(true);
        card.addResult(false);
        card.addResult(true);
        System.out.println("Score: " + card.getScore());
    }
}
