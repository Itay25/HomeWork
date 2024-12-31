import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Property> init_properties() {// I used chatgpt with no shame
        ArrayList<Property> properties = new ArrayList<>();

        properties.add(new Plot("Ramat Gan - Hayarkon Street", 800000.0, 500.0, Plot.TYPE.URBAN));
        properties.add(new Plot("Negev - Agricultural Land", 150000.0, 1000.0, Plot.TYPE.AGRICULTURAL));

        // Adding 2 Residential Apartments
        properties.add(new Apartment("Tel Aviv - Rothschild Blvd 10", 2200000.0, 85.0, 2, 4));
        properties.add(new Apartment("Haifa - Hanassi Avenue 25", 1600000.0, 100.0, 1, 3));

        // Adding 2 Villas
        properties.add(new Villa("Caesarea - Golf Street 5", 5500000.0, 700.0, 3, 2));
        properties.add(new Villa("Rishon Lezion - Narkis Street 12", 4800000.0, 600.0, 2, 1));

        // Adding 2 Vacation Apartments
        properties.add(new Vacation("Eilat - Red Sea View 2", 1200000.0, 75.0, 1, 6));
        properties.add(new Vacation("Tiberias - Sea of Galilee 3", 1400000.0, 80.0, 2, 5));

        // Adding 2 Commercial Properties
        properties.add(new Commercial("Tel Aviv - Azrieli Tower 1", 15000000.0, 2000.0, 5.5));
        properties.add(new Commercial("Petah Tikva - Industrial Zone 22", 7000000.0, 1500.0, 3.2, true));

        // Adding 2 Offices
        properties.add(new Office("Ramat Gan - Bursa District", 3000000.0, 150.0));
        properties.add(new Office("Jerusalem - Malha Mall", 2500000.0, 120.0));


        return properties;
    }

}
