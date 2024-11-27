package SRP;

class PayrollDetails {
    private int employeeId;
    private String employeeName;
    private double grossSalary;
    private double tax;
    private double netSalary;

    public PayrollDetails(int employeeId, String employeeName, double grossSalary, double tax, double netSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.grossSalary = grossSalary;
        this.tax = tax;
        this.netSalary = netSalary;
    }

    @Override
    public String toString() {
        return "PayrollDetails{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", grossSalary=" + grossSalary +
                ", tax=" + tax +
                ", netSalary=" + netSalary +
                '}';
    }
}