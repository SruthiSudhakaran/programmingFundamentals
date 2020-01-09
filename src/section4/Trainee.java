package section4;

public class Trainee {
    private static final String COHORT_CODE = "CHNAJ19004";
    int employeeId;
    String name;

    public Trainee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display(Trainee[] t) {
        for (Trainee trainee : t) {
            System.out.println(trainee.employeeId + " " + trainee.name + " " + COHORT_CODE);

        }
    }

}
