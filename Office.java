public class Office extends Property{
    public Office(String address, Double price, Double area) {
        super(address, price, area);
    }
    @Override
    public void taxIt() {
        System.out.println("Office Tax: " + (int)(getPrice() * 0.05) + "$");
    }

    @Override
    public String toString() {
        return "Office:" + " " + super.toString();
    }
}
