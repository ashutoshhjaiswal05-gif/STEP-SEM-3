abstract class StreamingPlan {
    String planName;
    int daysRemaining;
    public StreamingPlan(String planName, int daysRemaining) {
        this.planName = planName;
        this.daysRemaining = daysRemaining;
    }
    public abstract String getReminderMessage();
}

class MonthlyPlan extends StreamingPlan {
    public MonthlyPlan(int daysRemaining) { super("Monthly", daysRemaining); }
    @Override
    public String getReminderMessage() {
        return "Monthly Plan: Renew within " + daysRemaining + " days.";
    }
}

class AnnualPlan extends StreamingPlan {
    public AnnualPlan(int daysRemaining) { super("Annual", daysRemaining); }
    @Override
    public String getReminderMessage() {
        return "Annual Plan: Renew within " + daysRemaining + " days.";
    }
}

public class StreamingPlanReminder {
    public static void main(String[] args) {
        StreamingPlan p1 = new MonthlyPlan(3);
        StreamingPlan p2 = new AnnualPlan(15);
        System.out.println(p1.getReminderMessage());
        System.out.println(p2.getReminderMessage());
    }
}
