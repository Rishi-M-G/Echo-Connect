package org.eclipse.papyrus.javagen.EchoConnect;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import EchoConnect.Person;

public class PersonTest {

    private Person.Customer customer;

    @Before
    public void setUp() {
        // Create an instance for testing
        customer = new Person().new Customer();

        // Initialize common fields
        customer.UserName = "customer1";
        customer.Password = "password";
        customer.FirstName = "John";
        customer.LastName = "Doe";
        customer.EMail = "john.doe@example.com";
        customer.City = "New York";
        customer.Country = "USA";
    }

    @Test
    public void testValidCustomerLogIn() {
        assertTrue(customer.LogIn("customer1", "password"));
    }

    @Test
    public void testValidCustomerLogOff() {
        assertTrue(customer.LogOff("customer1"));
    }

    @Test
    public void testValidChangePassword() {
        customer.ChangePassword("customer1", "password", "newpassword");
        assertTrue(customer.LogIn("customer1", "newpassword"));
    }

    @Test
    public void testValidUpdateProfile() {
        // Redirect console output to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Mock user input for updating profile data
        ByteArrayInputStream inputStream = new ByteArrayInputStream("John\nDoe\njohn.doe@example.com\nNew York\nUSA".getBytes());
        System.setIn(inputStream);

        customer.UpdateProfile();
        assertTrue(outputStream.toString().contains("Profile updated successfully!"));

        // Reset System.in and System.out
        System.setIn(System.in);
        System.setOut(System.out);
    }
}
