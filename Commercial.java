public class Commercial extends Property{
    private boolean storeroom = false;
    private Double yield = 0.0;

    public Commercial(String address, Double price, Double area, Double yield) {
        super(address, price, area);
        setYield(yield);
    }

    public Commercial(String address, Double price, Double area, Double yield,boolean storeroom) {
        super(address, price, area);
        setYield(yield);
        this.storeroom = storeroom;
    }

    public boolean isStoreroom() {
        return storeroom;
    }

    public void setStoreroom(boolean storeroom) {
        this.storeroom = storeroom;
    }

    public Double getYield() {
        return yield;
    }

    public void setYield(Double yield) {
        if(yield < 0.0)
            return;
        this.yield = yield;
    }

    public void monthly_profit(){
        System.out.println(getPrice() *(yield / 100) / 12);
    }

    @Override
    public void taxIt() {
        System.out.println("Commercial Tax: " + (int)(getPrice() * 0.05) + "$");
    }

    @Override
    public String toString() {
        return "Commercial: " +
                "storeroom=" + storeroom +
                ", yield=" + yield + " " +
                super.toString();
    }
}
