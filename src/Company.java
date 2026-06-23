public class Company {
Employee employee = new Employee();

    String name;
    double revenue;
    int employeeCount;


    // Áfa 27%
    public double calculateAfa () {
        return revenue * 0.27 ;
    }

    //HIPA 2%
    public double calculateHipa (){
        return revenue * 0.02;
    }
    //TAO 9%
    public double calculateTao(){
        return revenue * 0.09;
    }

    // Összes adó
    public double allTax(){
        return calculateAfa() + calculateHipa() + calculateTao();

    }

    public void printData() {

        System.out.println("Cég neve: " + name);
        System.out.println("Bevétel: " + revenue);
        System.out.println("Dolgozók száma: " + employeeCount);
        System.out.println("Áfa: " + calculateAfa());
        System.out.println("Hipa: " + calculateHipa());
        System.out.println("Tao: " + calculateTao());
        System.out.println("Fizetendö adók összesen: "+ allTax());
        System.out.println("Tiszta haszon: " + (revenue - allTax() - employee.totalEmployerCost() ));

    }
}