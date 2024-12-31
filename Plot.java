public class Plot extends Property {
    public enum TYPE {URBAN, AGRICULTURAL, INDUSTRIAL}
    private TYPE type;

    public Plot(String address, Double price, Double area, TYPE type) {
        super(address, price, area);
        this.type = type;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plot: " +
                "type=" + type + " "
                + super.toString();
    }

    @Override
    public void taxIt() {
        if(type == TYPE.URBAN)
            System.out.println("URBAN Tax: " + (int)(getPrice() * 0.1) + "$");
        else if (type == TYPE.AGRICULTURAL) {
            System.out.println("AGRICULTURAL Tax: " + (int)(getPrice() * 0.02) + "$");
        } else if (type == TYPE.INDUSTRIAL) {
            System.out.println("INDUSTRIAL Tax: " + (int)(getPrice() * 0.05) + "$");
        }
    }
}
