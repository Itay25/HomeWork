public abstract class Residential extends Property{
    private int parkingLots = 0;

    public Residential(String address, Double price, Double area, int parkingLots) {
        super(address, price, area);
        setParkingLots(parkingLots);
    }

    public int getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(int parkingLots) {
        if(parkingLots < 0)
            return;
        this.parkingLots = parkingLots;
    }

    @Override
    public String toString() {
        return "{Residential: " +
                "parkingLots=" + parkingLots + " " +
                super.toString() + "}";
    }
}
