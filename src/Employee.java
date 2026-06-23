public class Employee {

    String name;
    double grossSalary;

    // SZJA (15%)
    public double calculateSzja() {
        return grossSalary * 0.15;
    }

    // TB járulék (18,5%)
    public double calculateTb() {
        return grossSalary * 0.185;
    }

    // Szocho (13%)
    public double calculateSzocho() {
        return grossSalary * 0.13;
    }

    public double totalEmployeeDeductions() {
        return calculateSzja() + calculateTb();
    }

    public double calculateNetSalary() {
        return grossSalary - totalEmployeeDeductions();
    }

    public double totalEmployerCost() {
        return grossSalary + calculateSzocho();
    }
}