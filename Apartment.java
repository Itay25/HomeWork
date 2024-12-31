public class Apartment extends Residential{
    private int rooms = 1;

    public Apartment(String address, Double price, Double area, int parkingLots, int rooms) {
        super(address, price, area, parkingLots);
        setRooms(rooms);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if(rooms < 2)
            return;
        this.rooms = rooms;
    }
    @Override
    public void taxIt() {
        System.out.println("Apartment Tax: " + (int)(getPrice() * 0.08) + "$");
    }

    @Override
    public String toString() {
        return "Apartment: " +
                "rooms=" + rooms + " " +
                super.toString();
    }
}
