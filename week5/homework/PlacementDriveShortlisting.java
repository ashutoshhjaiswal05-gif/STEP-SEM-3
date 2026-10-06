import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Candidate implements Comparable<Candidate> {
    String name;
    double cgpa;
    int codingScore;

    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    public double getCompositeScore() {
        return (cgpa * 10) + (codingScore * 0.5);
    }

    public static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    public static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 7.5 || (cgpa >= 6.5 && codingScore >= 60);
    }

    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.getCompositeScore(), this.getCompositeScore());
    }
}

public class PlacementDriveShortlisting {
    public static String shortlistAndRank(Candidate[] candidates) {
        List<Candidate> eligibleList = new ArrayList<>();
        for (Candidate c : candidates) {
            if (Candidate.isEligible(c.cgpa, c.codingScore)) {
                eligibleList.add(c);
            }
        }
        Candidate[] eligibleArr = eligibleList.toArray(new Candidate[0]);
        Arrays.sort(eligibleArr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < eligibleArr.length; i++) {
            sb.append(i + 1).append(". ").append(eligibleArr[i].name)
              .append(" (").append(String.format("%.1f", eligibleArr[i].getCompositeScore())).append(")");
            if (i < eligibleArr.length - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };
        System.out.println(shortlistAndRank(candidates));
    }
}
