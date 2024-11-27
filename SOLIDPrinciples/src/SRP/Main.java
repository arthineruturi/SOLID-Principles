package SRP;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John Doe", "123 Main St", 5000.0);
        TaxCalculator taxCalculator = new TaxCalculator(0.2);

        PayrollProcessor payrollProcessor = new PayrollProcessor(taxCalculator);
        PayrollDetails payrollDetails = payrollProcessor.processPayroll(employee);

        System.out.println(payrollDetails);
    }
}