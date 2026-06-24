public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Niki",500000);


        Employee e2 = new Employee("Géza",650000);


        Company company = new Company();

        company.name = "Niki Kft";
        company.revenue = 5000000;

        company.employees.add(e1);
        company.employees.add(e2);

        System.out.println(company);

        System.out.println("\nDolgozók:");

        for (int i = 0; i < company.employees.size(); i++) {

            Employee employee = company.employees.get(i);

            System.out.println(employee);

            System.out.println();
        }
        }
        }

