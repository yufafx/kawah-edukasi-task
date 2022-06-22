package BillBurgers;

public class Hamburger {
    private String name, meat, breadRollType;
    private double price;
    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = price;
        System.out.printf("Anda memesan: %s isi daging %s dengan roti %s untuk harga $ %.2f\n", name, meat, breadRollType, price);
        if (addition1Name != null){
            System.out.printf("Tambahan: %s untuk harga $ %.2f\n", addition1Name, addition1Price);
            totalPrice += addition1Price;
        }
        if (addition2Name != null){
            System.out.printf("Tambahan: %s untuk harga $ %.2f\n", addition2Name, addition2Price);
            totalPrice += addition2Price;
        }
        if (addition3Name != null){
            System.out.printf("Tambahan: %s untuk harga $ %.2f\n", addition3Name, addition3Price);
            totalPrice += addition3Price;
        }
        if (addition4Name != null){
            System.out.printf("Tambahan: %s untuk harga $ %.2f\n", addition4Name, addition4Price);
            totalPrice += addition4Price;
        }
        return totalPrice;
    }

}
