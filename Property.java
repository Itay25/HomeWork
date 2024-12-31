public abstract class Property {
    private String address = "Na";
    private Double area = 0.0;
    private Double price = 0.0;

    public Property(){}

    public Property(String address, Double price, Double area) {
        setAddress(address);
        setPrice(price);
        setArea(area);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address == null || address.equals(""))
            return;
        if(address.length() >=2 && address.contains(" "))
            this.address = address;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        if(area < 0.0)
            return;
        this.area = area;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if(price < 0.0)
            return;
        this.price = price;
    }

    public abstract void taxIt();

    @Override
    public String toString() {
        return "{Property: " +
                "address='" + address + '\'' +
                ", area=" + area +
                ", price=" + price + "}";
    }
}
