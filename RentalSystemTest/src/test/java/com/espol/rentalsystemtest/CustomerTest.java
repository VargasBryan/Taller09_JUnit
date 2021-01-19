/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bryan
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addMovieRental method, of class Customer.
     */
    
    //---------------------------------Joel-------------------------------------
    @Test  
    public void testGetName() {
        String name = "John Doe"; 
        assertEquals(name, new Customer(name)._name);
    }
    
    //------------------------------Eddy----------------------------------------
       @Test
    public void testStatementRegularMovieOnly() {
        // regular movies cost $2.00 for the first 2 days, and $1.50/day thereafter
        // a rental earns 1 frequent-renter point no matter how many days
        Customer johnDoe = new Customer("John Doe");
        johnDoe.addMovieRental(new MovieRental(new Movie("Slum Dog Millionare",Movie.REGULAR),1));
                assertEquals("Rental Record for John Doe\n" + "\tSlum Dog Millionare\t2.0\n"
                + "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points",
                johnDoe.statement() );
        johnDoe.addMovieRental(new MovieRental(new Movie("Slum Dog Millionare",Movie.REGULAR),3));
                assertEquals("Rental Record for John Doe\n" + "\tSlum Dog Millionare\t2.0\n" + "\tSlum Dog Millionare\t3.5\n"
                + "Amount owed is 5.5\n" +
                "You earned 2 frequent renter points",
                johnDoe.statement() );
    }
    //--------------------------------Maria-------------------------------------
        @Test
    public void testStatementChildrensMovieOnly() {
        // childrens' movies cost $1.50 for the first 3 days, and $1.25/day thereafter
        // a rental earns 1 frequent-renter point no matter how many days
        Customer johnDoeJr = new Customer("Johnny Doe, Jr.");
        johnDoeJr.addMovieRental(new MovieRental(new Movie("Mulan",Movie.CHILDRENS),1));
                assertEquals("Rental Record for Johnny Doe, Jr.\n" + "\tMulan\t1.5\n"
                + "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points",
                johnDoeJr.statement() );
        johnDoeJr.addMovieRental(new MovieRental(new Movie("Mulan",Movie.CHILDRENS),4));
                assertEquals("Rental Record for Johnny Doe, Jr.\n" + "\tMulan\t1.5\n" + "\tMulan\t2.75\n"
                + "Amount owed is 4.25\n" +
                "You earned 2 frequent renter points",
                johnDoeJr.statement() );
        
    }
    
    //------------------------------David---------------------------------------
   @Test
    public void testStatementNewReleaseOnly() {
        // new releases cost $3.00/day
        // a rental earns 1 frequent-renter point 1 day; 2 points for 2 or more days
        Customer janeDoe = new Customer("Jane Doe");
        janeDoe.addMovieRental(new MovieRental(new Movie("The Man Who Knew Too Much",Movie.NEW_RELEASE),1));
        assertEquals("Rental Record for Jane Doe\n" + "\tThe Man Who Knew Too Much\t3.0\n"
                + "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points",
                janeDoe.statement() );
        janeDoe.addMovieRental(new MovieRental(new Movie("The Man Who Knew Too Much",Movie.NEW_RELEASE),2));
        assertEquals("Rental Record for Jane Doe\n" + "\tThe Man Who Knew Too Much\t3.0\n" + "\tThe Man Who Knew Too Much\t6.0\n"
                + "Amount owed is 9.0\n" +
                "You earned 3 frequent renter points",
                janeDoe.statement() );
        janeDoe.addMovieRental(new MovieRental(new Movie("The Man Who Knew Too Much",Movie.NEW_RELEASE),4));
        assertEquals("Rental Record for Jane Doe\n" + "\tThe Man Who Knew Too Much\t3.0\n" + "\tThe Man Who Knew Too Much\t6.0\n"
                + "\tThe Man Who Knew Too Much\t12.0\n"
                + "Amount owed is 21.0\n" +
                "You earned 5 frequent renter points",
                janeDoe.statement() );
    }
    
//    @org.junit.Test
//    public void testAddMovieRental() {
//        System.out.println("addMovieRental");
//        MovieRental arg = null;
//        Customer instance = null;
//        instance.addMovieRental(arg);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addVideoGameRental method, of class Customer.
//     */
//    @org.junit.Test
//    public void testAddVideoGameRental() {
//        System.out.println("addVideoGameRental");
//        VideoGameRental arg = null;
//        Customer instance = null;
//        instance.addVideoGameRental(arg);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of statement method, of class Customer.
//     */
//    @org.junit.Test
//    public void testStatement() {
//        System.out.println("statement");
//        Customer instance = null;
//        String expResult = "";
//        String result = instance.statement();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    

    
}
