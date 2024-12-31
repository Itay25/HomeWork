public class Villa extends Residential{
    private int levels = 1;

    public Villa(String address, Double price, Double area, int parkingLots, int levels) {
        super(address, price, area, parkingLots);
        setLevels(levels);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if(levels < 1)
            return;
        this.levels = levels;
    }

    @Override
    public void taxIt() {
        System.out.println("Villa Tax: " + (int)(getPrice() * 0.08) + "$");
    }

    @Override
    public String toString() {
        return "Villa: " +
                "levels=" + levels + " " +
                super.toString();
    }
}
