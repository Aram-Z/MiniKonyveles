public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();


        employee.name = "Szandi";
        employee.grossSalary = 500000;

        System.out.println("Név: " + employee.name);
        System.out.println("Bruttó bér: " + employee.grossSalary);

        System.out.println("SZJA: " + employee.calculateSzja());
        System.out.println("TB: " + employee.calculateTb());
        System.out.println("Szocho: " + employee.calculateSzocho());

        System.out.println("Összes levonás: " + employee.totalEmployeeDeductions());

        System.out.println("Nettó bér: " + employee.calculateNetSalary());

        System.out.println("Teljes munkáltatói költség: " + employee.totalEmployerCost());

        System.out.println();

        Company company = new Company();

        company.name = "Niki Kft";
        company.revenue = 50000000;
        company.employeeCount = 1;


        company.printData();

    }
}