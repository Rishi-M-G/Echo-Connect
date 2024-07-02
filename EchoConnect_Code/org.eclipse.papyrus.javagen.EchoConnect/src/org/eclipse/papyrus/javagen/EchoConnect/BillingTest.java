/**
 * 
 */
package org.eclipse.papyrus.javagen.EchoConnect;

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import EchoConnect.Billing;
import EchoConnect.Person;
import EchoConnect.Person.Customer;
import EchoConnect.WiFi;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

/**
 * 
 */
class BillingTest {

	private Billing billing;
    private Customer customer;

    @Before
    public void setUp() {
        // Initialize Billing and Customer objects before each test
        billing = new Billing(1, new Date(), new Date(), 100, "Pending", 100, 10, "Monthly");
        customer = new Person().new Customer();
        customer.UserName = "customer1";
        customer.Password = "password";
        customer.FirstName = "John";
        customer.LastName = "Doe";
        customer.EMail = "john.doe@example.com";
        customer.City = "New York";
        customer.Country = "USA";
        
        
    }
    @Test
    public void testCalculateTotalBillAmount() {
    	// Create a Billing object
        Billing billing = new Billing(1, new Date(), new Date(), 0, "Pending", 0, 0, "Monthly");

        // Create a Customer object
        Customer customer = new Person().new Customer();
        customer.MyServices = new ArrayList<>();
        customer.UserName = "customer1";
        customer.Password = "password";
        customer.FirstName = "John";
        customer.LastName = "Doe";
        customer.EMail = "john.doe@example.com";
        customer.City = "New York";
        customer.Country = "USA";

        // Create instances of MobilityPlan and WiFiPlan
        EchoConnect.Mobility mobilityPlan = new EchoConnect.Mobility(1, "Mobile Plan", 50, "Basic Plan", 100, 50, 10);

        // Add MobilityPlan and WiFiPlan to the customer's services
        customer.MyServices.add(mobilityPlan);

        // Calculate total bill amount
        billing.CalculateTotalBillAmount(customer);

        // Check if DueAmount and OutstandingAmount are calculated correctly
        assertEquals(50 + 0, billing.DueAmount); // Assuming MiscCharges is 0
        assertEquals(50 + 0, billing.OutstandingAmount);
    }
    @Test
    public void testCalculateLateCharges() {
    	Billing billing = new Billing(1, new Date(), new Date(), 100, "Pending", 0, 0, "Monthly");
        // Set DueDate to a past date to simulate overdue bill
        billing.DueDate = new Date(System.currentTimeMillis() - (7 * 24 * 60 * 60 * 1000)); // 7 days overdue

        // Calculate late charges
        billing.CalculateLateCharges();

        // Check if OutstandingAmount is updated with late charges
        assertEquals(14, billing.OutstandingAmount);

    }
    
    @Test
    public void testDownloadBill() {
    	Billing billing = new Billing(1, new Date(), new Date(), 100, "Pending", 100, 0, "Monthly");
        // Redirect System.out to capture printed content
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Perform DownloadBill operation
        billing.DownloadBill();

        // Reset System.out
        System.setOut(System.out);

        // Check if the printed content contains the expected information
        assertTrue("Bill ID not found", outputStream.toString().contains("Bill ID: 1"));
        assertTrue("Due Amount not found", outputStream.toString().contains("Due Amount: 100"));
        assertTrue("Outstanding Amount not found", outputStream.toString().contains("Outstanding Amount: 100"));
    }
    
    @Test
    public void testViewBill() {
    	Billing billing = new Billing(1, new Date(), new Date(), 100, "Pending", 100, 0, "Monthly");
        // Redirect System.out to capture printed content
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // Perform ViewBill operation and capture the result
        String billContent = billing.ViewBill();
        System.out.print(billContent);

        // Check if the printed content contains the expected information
        assertTrue("Bill ID not found", outputStream.toString().contains("Bill ID: 1"));
        assertTrue("Due Amount not found", outputStream.toString().contains("Due Amount: 100"));
        assertTrue("Outstanding Amount not found", outputStream.toString().contains("Outstanding Amount: 100"));
    }
    }



