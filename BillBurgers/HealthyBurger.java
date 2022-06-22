package BillBurgers;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super("Healthy Burger", meat, "Crescent Rolls", price);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if (healthyExtra1Name != null){
            System.out.printf("Tambahan: %s untuk harga $ %.2f\n", healthyExtra1Name, healthyExtra1Price);
            totalPrice += healthyExtra1Price;
        }
        if (healthyExtra2Name != null){
            System.out.printf("Tambahan: %s untuk harga $ %.2f\n", healthyExtra2Name, healthyExtra2Price);
            totalPrice += healthyExtra2Price;
        }
        return totalPrice;
    }
}
