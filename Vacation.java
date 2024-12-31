public class Vacation extends Residential{
    private int guests = 1;

    public Vacation(String address, Double price, Double area, int parkingLots, int guests) {
        super(address, price, area, parkingLots);
        setGuests(guests);
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        if(guests < 1)
            return;
        this.guests = guests;
    }

    @Override
    public void taxIt() {
        System.out.println("Vacation Tax: " + (int)(getPrice() * 0.25) + "$");
    }

    @Override
    public String toString() {
        return "Vacation: " +
                "guests=" + guests + " " +
                super.toString();
    }
}
