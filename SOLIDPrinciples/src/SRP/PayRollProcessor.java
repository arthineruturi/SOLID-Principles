package SRP;

class PayrollProcessor {
    private TaxCalculator taxCalculator;

    public PayrollProcessor(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public PayrollDetails processPayroll(Employee employee) {
        double tax = taxCalculator.calculateTax(employee.getSalary());
        double netSalary = employee.getSalary() - tax;
        return new PayrollDetails(employee.getEmployeeId(), employee.getName(), employee.getSalary(), tax, netSalary);
    }
}
