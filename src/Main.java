public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "Szandi";
        e1.grossSalary = 500000;

        Employee e2 = new Employee();
        e2.name = "Pisti";
        e2.grossSalary = 600000;

        Company company = new Company();

        company.name = "Niki Kft";
        company.revenue = 5000000;

        company.employees.add(e1);
        company.employees.add(e2);

        System.out.println(company);

        System.out.println("\nDolgozók:");

        for (int i = 0; i < company.employees.size(); i++) {

            Employee employee = company.employees.get(i);

            System.out.println("Név: " + employee.name);
            System.out.println("Bruttó bér: " + employee.grossSalary);
            System.out.println("SZJA: " + employee.calculateSzja());
            System.out.println("TB: " + employee.calculateTb());
            System.out.println("Szocho: " + employee.calculateSzocho());
            System.out.println("Nettó bér: " + employee.calculateNetSalary());

            System.out.println();
        }
        }
        }

