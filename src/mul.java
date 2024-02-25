interface Car {
    public void start();
}

class ElectricCar implements Car {
    public void start() {
        System.out.println("Electric car starts");
    }
}

class NormalCar implements Car {
    public void start() {
        System.out.println("Normal car starts");
    }
}

public class mul {
    public static void main(String[] args) {
        Car tesla = new ElectricCar(); // Corrected spelling from telsa to tesla
        Car tata = new NormalCar();

        tesla.start();
        tata.start();
    }
}
