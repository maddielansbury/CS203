/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countrycomparator10;

import java.util.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author malansbury
 */
public class CountryTest {
    
    public CountryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Country.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Country country = new Country("Narnia", 8);
        String expResult = "Narnia";
        String result = country.getName();
        // Checks if country.getName() returns the name of the country.
        assertEquals(expResult, result);
    }

    /**
     * Test of getArea method, of class Country.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Country country = new Country("Narnia", 8);
        double expResult = 8;
        double result = country.getArea();
        // Checks if country.getArea() returns the area of the country.
        assertEquals(expResult, result, .5);
    }

    /**
     * Test of compareTo method, of class Country.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Country country = new Country("Narnia", 8);
        Country other = new Country("Hoth", 342937840);
        // Tests for <
        int expResult = -1;
        int result = country.compareTo(other);
        assertEquals(expResult, result);
        // Tests for >
        expResult = 1;
        result = other.compareTo(country);
        assertEquals(expResult, result);
        // Tests for =
        expResult = 0;
        result = country.compareTo(country);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createComparatorByName method, of class Country.
     */
    @Test
    public void testCreateComparatorByName() {
        System.out.println("createComparatorByName");
        
        // An ArrayList of countries of varying size.
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 514000));
        countries.add(new Country("Belgium", 30510));
        countries.add(new Country("Narnia", 8));
        countries.add(new Country("Hoth", 342937840));
        
        // An ArrayList of the items in countries in increasing name order.
        ArrayList<Country> incnamecountries = new ArrayList<>();
        incnamecountries.add(new Country("Belgium", 30510));
        incnamecountries.add(new Country("Hoth", 342937840));
        incnamecountries.add(new Country("Narnia", 8));
        incnamecountries.add(new Country("Thailand", 514000));
        incnamecountries.add(new Country("Uruguay", 176220));
        
        // Sorts ArrayList countries in increasing name order.
        Collections.sort(countries, Country.createComparatorByName(true));
        
        // Checks that items in countries are in the same order as items in
        // incnamecountries.
        assertTrue(countries.get(0).getName().equals(
                incnamecountries.get(0).getName()));
        assertTrue(countries.get(1).getName().equals(
                incnamecountries.get(1).getName()));
        assertTrue(countries.get(2).getName().equals(
                incnamecountries.get(2).getName()));
        assertTrue(countries.get(3).getName().equals(
                incnamecountries.get(3).getName()));
        assertTrue(countries.get(4).getName().equals(
                incnamecountries.get(4).getName()));
        
        // An ArrayList of the items in countries in decreasing name order.
        ArrayList<Country> decnamecountries = new ArrayList<>();
        decnamecountries.add(new Country("Uruguay", 176220));
        decnamecountries.add(new Country("Thailand", 514000));
        decnamecountries.add(new Country("Narnia", 8));
        decnamecountries.add(new Country("Hoth", 342937840));
        decnamecountries.add(new Country("Belgium", 30510));
        
        // Sorts ArrayList countries in decreasing name order.
        Collections.sort(countries, Country.createComparatorByName(false));
        
        // Checks that items in countries are in the same order as items in
        // decnamecountries.
        assertTrue(countries.get(0).getName().equals(
                decnamecountries.get(0).getName()));
        assertTrue(countries.get(1).getName().equals(
                decnamecountries.get(1).getName()));
        assertTrue(countries.get(2).getName().equals(
                decnamecountries.get(2).getName()));
        assertTrue(countries.get(3).getName().equals(
                decnamecountries.get(3).getName()));
        assertTrue(countries.get(4).getName().equals(
                decnamecountries.get(4).getName()));
    }

    /**
     * Test of createComparatorByArea method, of class Country.
     */
    @Test
    public void testCreateComparatorByArea() {
        System.out.println("createComparatorByArea");
        
        // An ArrayList of countries of varying size.
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 514000));
        countries.add(new Country("Belgium", 30510));
        countries.add(new Country("Narnia", 8));
        countries.add(new Country("Hoth", 342937840));
        
        // An ArrayList of the items in countries in increasing area order.
        ArrayList<Country> incareacountries = new ArrayList<>();
        incareacountries.add(new Country("Narnia", 8));
        incareacountries.add(new Country("Belgium", 30510));
        incareacountries.add(new Country("Uruguay", 176220));
        incareacountries.add(new Country("Thailand", 514000));
        incareacountries.add(new Country("Hoth", 342937840));
        
        // Sorts ArrayList countries in increasing area order.
        Collections.sort(countries, Country.createComparatorByArea(true));
        
        // Checks that items in countries are in the same order as items in
        // incareacountries.
        assertTrue(countries.get(0).getName().equals(
                incareacountries.get(0).getName()));
        assertTrue(countries.get(1).getName().equals(
                incareacountries.get(1).getName()));
        assertTrue(countries.get(2).getName().equals(
                incareacountries.get(2).getName()));
        assertTrue(countries.get(3).getName().equals(
                incareacountries.get(3).getName()));
        assertTrue(countries.get(4).getName().equals(
                incareacountries.get(4).getName()));
        
        // An ArrayList of the items in countries in decreasing area order.
        ArrayList<Country> decareacountries = new ArrayList<>();
        decareacountries.add(new Country("Hoth", 342937840));
        decareacountries.add(new Country("Thailand", 514000));
        decareacountries.add(new Country("Uruguay", 176220));
        decareacountries.add(new Country("Belgium", 30510));
        decareacountries.add(new Country("Narnia", 8));
        
        // Sorts ArrayList countries in decreasing area order.
        Collections.sort(countries, Country.createComparatorByArea(false));
        
        // Checks that items in countries are in the same order as items in
        // decareacountries.
        assertTrue(countries.get(0).getName().equals(
                decareacountries.get(0).getName()));
        assertTrue(countries.get(1).getName().equals(
                decareacountries.get(1).getName()));
        assertTrue(countries.get(2).getName().equals(
                decareacountries.get(2).getName()));
        assertTrue(countries.get(3).getName().equals(
                decareacountries.get(3).getName()));
        assertTrue(countries.get(4).getName().equals(
                decareacountries.get(4).getName()));
    }
    
}
