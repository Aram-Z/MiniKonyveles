import java.util.ArrayList;

public class Company {

    ArrayList<Employee> employees = new ArrayList<>();

    String name;
    double revenue;

    // Áfa 27%
    public double calculateAfa() {
        return revenue * 0.27;
    }

    // HIPA 2%
    public double calculateHipa() {
        return revenue * 0.02;
    }

    // TAO 9%
    public double calculateTao() {
        return revenue * 0.09;
    }

    // Összes adó
    public double allTax() {
        return calculateAfa() + calculateHipa() + calculateTao();
    }

    @Override
    public String toString() {
        return "Cég neve: " + name +
                "\nBevétel: " + revenue +
                "\nDolgozók száma: " + employees.size() +
                "\nÁfa: " + calculateAfa() +
                "\nHipa: " + calculateHipa() +
                "\nTao: " + calculateTao() +
                "\nÖsszes adó: " + allTax();
    }
}