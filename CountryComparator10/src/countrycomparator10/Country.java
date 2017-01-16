package countrycomparator10;

import java.util.*;

/**
   A country with a name and area.
*/
public class Country implements Comparable<Country>
{
   /**
      Constructs a country.
      @param aName the name of the country
      @param anArea the area of the country
   */
   public Country(String aName, double anArea)
   {
      name = aName;
      area = anArea;
   }

   /**
      Gets the name of the country.
      @return the name
   */
   public String getName()
   {
      return name;
   }

   /**
      Gets the area of the country.
      @return the area
   */
   public double getArea()
   {
      return area;
   }


   /**
      Compares two countries by area.
      @param other the other country
      @return a negative number if this country has a smaller
      area than otherCountry, 0 if the areas are the same,
      a positive number otherwise
   */
   public int compareTo(Country other)
   {
      if (area < other.area) return -1;
      if (area > other.area) return 1;
      return 0;
   }
   
//   Collections.sort(countries, new Comparator<Country>() {
//            public int compare(Country country1, Country country2) {
//                return country1.getName()
//                        .compareTo(country2.getName());
//            }
//        })
   
   public static Comparator<Country> createComparatorByName(
           final boolean increasing) {
       Comparator<Country> comp;
       if(increasing) {
           comp = new Comparator<Country>() {
               public int compare(Country country1, Country country2) {
                   return country1.getName().compareTo(country2.getName());
               }
           };
       } else {
           comp = new Comparator<Country>() {
               public int compare(Country country1, Country country2) {
                   return country2.getName().compareTo(country1.getName());
               }
           };
       }
       return comp;
   }
           
           
   public static Comparator<Country> createComparatorByArea(
        final boolean increasing) {
       Comparator<Country> comp;
       if(increasing) {
           comp = new Comparator<Country>() {
               public int compare(Country country1, Country country2) {
                   return country1.compareTo(country2);
               }
           };
       } else {
           comp = new Comparator<Country>() {
               public int compare(Country country1, Country country2) {
                   return country2.compareTo(country1);
               }
           };
       }
       return comp;
   }

   private String name;
   private double area;
}