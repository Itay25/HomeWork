import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static RealEstateManager realEstateManager = new RealEstateManager("itay");
    static int input;


    public static void main(String[] args) throws RealEstateManager.PriceException {
        realEstateManager.setProperties(DataManager.init_properties());// init realEstateManager ArrayList
        start();
        System.out.println("bye");
    }

    public static void start() throws RealEstateManager.PriceException {
        while(true){
            menu();
            if(input == -1)
                return;
            switch (input){
                case 1:
                    System.out.println("Enter price for cities search");
                    Double price = scanner.nextDouble();
                    Property_search(price);
                    break;
                case 2:
                    financialReport();
                    break;
                case 3:
                    commercialYield();
                    break;
                case 4:
                    System.out.println("Enter city for properties search");
                    String city = scanner.next();
                    PropertiesByCity(city);
                    break;
                case 5:
                    NumberOfCities();
                    break;
            }
            scanner.nextLine();
        }
    }
    public static void menu(){
        System.out.println("\nEnter number");
        System.out.println("1 > Property search (by price)");
        System.out.println("2 > Financial report");
        System.out.println("3 > Commercial real estate yield");
        System.out.println("4 > Properties by city");
        System.out.println("5 > number of cities");
        System.out.println("-1 > Exit the program");

        input = scanner.nextInt();
    }
    public static void Property_search(Double price) throws RealEstateManager.PriceException {
        ArrayList<Property> up_to_price = new ArrayList<>();
        up_to_price = realEstateManager.properties_up_to_price(price);

        for(Property property: up_to_price)
            System.out.println(property);
    }

    public static void financialReport(){
        for(Property property: realEstateManager.getProperties()){
            property.taxIt();
        }
    }

    public static void commercialYield(){
        Double sum_yield = 0.0;
        for(Property property: realEstateManager.getProperties()){
            if(property instanceof Commercial){
                Commercial commercial = (Commercial)property;
                sum_yield += commercial.getYield();;
            }
        }
        System.out.println("Sum yield = " + sum_yield);
    }

    public static void PropertiesByCity(String city){
        String lowercase_city = city.toLowerCase();
        if(lowercase_city.contains("-")){
            lowercase_city.replace("-", " ");
        }

        for(Property property: realEstateManager.getProperties()){
            String property_address = property.getAddress().toLowerCase();
            if(property_address.contains("-")){
                property_address.replace("-", " ");
            }
            if(property_address.contains( lowercase_city)){
                System.out.println(property);
            }
        }
    }

    public static void NumberOfCities(){
        HashMap<String,Integer> cities = new HashMap<>();
        for(Property property: realEstateManager.getProperties()){
            String city = property.getAddress().substring(0,property.getAddress().indexOf(" -")).toLowerCase();
            if(!cities.containsKey(city)){
                cities.put(city,1);
            }
            else{
                int value = cities.get(city);
                cities.put(city,value+ 1);
            }
        }
        for(Map.Entry<String,Integer> entry: cities.entrySet()){
            System.out.println(entry.getKey() +": " + entry.getValue());
        }
    }
}