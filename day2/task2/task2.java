// task2 icecream call banakar new object bana hai use constructor

package day2.task2;

class IceCream {
    private String flavor;
    private double price;
    
    public IceCream(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }
    
    public void display() {
        System.out.println("Flavor: " + flavor + ", Price: " + price);
    }
}

public class task2 {
    public static void main(String[] args) {
        IceCream icecream = new IceCream("Vanilla", 50.0);
        icecream.display();
    }
}
