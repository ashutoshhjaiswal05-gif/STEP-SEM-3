abstract class Question {
    String type;
    int maxMarks;
    public Question(String type, int maxMarks) {
        this.type = type;
        this.maxMarks = maxMarks;
    }
    public abstract double grade(double percentageCorrect);
}

class McqQuestion extends Question {
    public McqQuestion(int maxMarks) { super("MCQ", maxMarks); }
    @Override public double grade(double percentageCorrect) { return maxMarks * (percentageCorrect / 100.0); }
}

class CodingQuestion extends Question {
    public CodingQuestion(int maxMarks) { super("CODING", maxMarks); }
    @Override public double grade(double percentageCorrect) { return maxMarks * (percentageCorrect / 100.0); }
}

public class ExaminationQuestionGrader {
    public static void main(String[] args) {
        Question q1 = new McqQuestion(10);
        Question q2 = new CodingQuestion(20);
        System.out.printf("%s: %.2f\n", q1.type, q1.grade(100));
        System.out.printf("%s: %.2f\n", q2.type, q2.grade(85));
    }
}
