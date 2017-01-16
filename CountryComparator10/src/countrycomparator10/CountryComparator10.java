package countrycomparator10;

import java.util.*;

public class CountryComparator10 {

    public static void main(String[] args) {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 514000));
        countries.add(new Country("Belgium", 30510));

        Collections.sort(countries, Country.createComparatorByName(true));

        // Now the array list is sorted by name
        for (Country c : countries) {
            System.out.println(c.getName() + " " + c.getArea());
        }
        System.out.println();
        
        Collections.sort(countries, Country.createComparatorByName(false));

        // Now the array list is sorted by name
        for (Country c : countries) {
            System.out.println(c.getName() + " " + c.getArea());
        }
        System.out.println();
        
        Collections.sort(countries, Country.createComparatorByArea(true));

        // Now the array list is sorted by name
        for (Country c : countries) {
            System.out.println(c.getName() + " " + c.getArea());
        }
        System.out.println();
        
        Collections.sort(countries, Country.createComparatorByArea(false));

        // Now the array list is sorted by name
        for (Country c : countries) {
            System.out.println(c.getName() + " " + c.getArea());
        }
        System.out.println();
    }
}
