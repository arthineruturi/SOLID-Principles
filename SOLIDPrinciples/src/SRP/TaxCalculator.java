package SRP;

class TaxCalculator {
    private double taxRate;

    public TaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    public double calculateTax(double salary) {
        return salary * taxRate;
    }
}