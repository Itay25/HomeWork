import java.util.ArrayList;

public class RealEstateManager {

    static class PriceException extends Exception{//price exception if price is negative
        public PriceException(String message){
            super(message);
        }
    }

    private String name;
    private ArrayList<Property> properties;

    public RealEstateManager(String name) {
        this.name = name;
        properties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public void add_property(Property property){//insert property into ArrayList
        properties.add(property);
    }

    public ArrayList<Property> properties_up_to_price(Double price) throws PriceException {//returns ArrayList of properties up to given price
        if(price < 0.0)
            throw new PriceException("Illegal serial number - enter positive number");
        ArrayList<Property> properties_up_to_price = new ArrayList<>();
        for(Property property: properties){
            if(property.getPrice() <= price)
                properties_up_to_price.add(property);
        }
        return properties_up_to_price;
    }

    public static Double sum_all_properties(ArrayList<Property> properties){
        double sum = 0;
        for(Property property: properties){
            sum += property.getPrice();
        }
        return sum;
    }
}
