package SRP;

class Employee {
    private int employeeId;
    private String name;
    private String address;
    private double salary;

    public Employee(int employeeId, String name, String address, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }
}