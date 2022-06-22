package BillBurgers;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe Burger", "Beef", "Butterfly Rolls", 19.10);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("no additional items can be added to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("no additional items can be added to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("no additional items can be added to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("no additional items can be added to a Deluxe Burger");
    }
}
