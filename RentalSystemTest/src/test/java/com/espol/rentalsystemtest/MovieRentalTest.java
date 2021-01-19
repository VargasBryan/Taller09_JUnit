/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author Bryan
 */

public class MovieRentalTest extends junit.framework.TestCase {

    Movie theManWhoKnewTooMuch, mulan, slumdogMillionaire;
    @Before
    public void setUp() {
        theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        slumdogMillionaire = new Movie("Slumdog Millionaire", Movie.NEW_RELEASE);
    }

    /**
     * Test of getDaysRented method, of class MovieRental.
     */
    
    @Test
    public void testGetTitle() {
        assertEquals("The Man Who Knew Too Much", theManWhoKnewTooMuch._title);
    }

    @Test
    public void testSetPriceCode() {
        theManWhoKnewTooMuch.setPriceCode(Movie.NEW_RELEASE);
        assertEquals(Movie.NEW_RELEASE, theManWhoKnewTooMuch.getPriceCode());
        theManWhoKnewTooMuch.setPriceCode(Movie.REGULAR);
        assertEquals(Movie.REGULAR, theManWhoKnewTooMuch.getPriceCode());
    }

    @Test
    public void testGetDaysRented() {
        assertEquals(2, new MovieRental(theManWhoKnewTooMuch, 2).getDaysRented());
    }

    @Test
    public void testGetMovie() {
        assertEquals(theManWhoKnewTooMuch, new MovieRental(theManWhoKnewTooMuch, 2).getMovie());
    }
    
//    @org.junit.Test
//    public void testGetDaysRented() {
//        System.out.println("getDaysRented");
//        MovieRental instance = null;
//        int expResult = 0;
//        int result = instance.getDaysRented();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMovie method, of class MovieRental.
//     */
//    @org.junit.Test
//    public void testGetMovie() {
//        System.out.println("getMovie");
//        MovieRental instance = null;
//        Movie expResult = null;
//        Movie result = instance.getMovie();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
