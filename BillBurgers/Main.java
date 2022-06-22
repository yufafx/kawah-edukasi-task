package BillBurgers;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Regular Hamburger", "Chicken", "Single Knot Rolls", 10.0);
        hamburger.addHamburgerAddition1("Hot Sauce", 5.0);
        hamburger.addHamburgerAddition2("Selada", 1.0);
        double totalReg = hamburger.itemizeHamburger();
        System.out.println("Total pesanan anda = " + totalReg);

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Keju", 3.0);
        double totalDeluxe = deluxeBurger.itemizeHamburger();
        System.out.println("Total pesanan anda = " + totalDeluxe);

        HealthyBurger healthyBurger = new HealthyBurger("Lamb", 20.0);
        healthyBurger.addHealthyAddition1("Cheese", 7.0);
        healthyBurger.addHealthyAddition2("Mayonaise", 3.0);
        double totalHealthy = healthyBurger.itemizeHamburger();
        System.out.println("Total pesanan anda = " + totalHealthy);
    }
}
