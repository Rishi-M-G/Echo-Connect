// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package EchoConnect;

import java.util.Scanner;

/************************************************************/
/**
 * 
 */
public class EchoConnectApp {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a new Customer
        Person.Customer customer = new Person().new Customer();

        // Creating a new Employee
        Person.Employee employee = new Person().new Employee();

        // Perform registration based on user input
        System.out.println("Enter 'customer' or 'employee' to register:");
        String userType = scanner.next();
        System.out.println("Enter username:");
        String username = scanner.next();
        System.out.println("Enter password:");
        String password = scanner.next();
        System.out.println("Enter first name:");
        String firstName = scanner.next();
        System.out.println("Enter last name:");
        String lastName = scanner.next();
        System.out.println("Enter email:");
        String email = scanner.next();
        System.out.println("Enter city:");
        String city = scanner.next();
        System.out.println("Enter country:");
        String country = scanner.next();

        if ("customer".equalsIgnoreCase(userType)) {
            customer.Register(username, password, firstName, lastName, email, city, country);
        } else {
            System.out.println("Invalid user type.");
        }
        
        scanner.close();
        
        // Creating a new Customer
        Person.Customer customer1 = new Person().new Customer();
        customer1.UserName = "Echocust1";
        customer1.Password = "Echopwd1";

        // Creating a new Employee
        Person.Employee employee1 = new Person().new Employee();
        employee1.UserName = "Echoemp1";
        employee1.Password = "Emppass1";

        // Perform update profile based on user input
        System.out.println("Enter 'customer' or 'employee' to update profile:");
        String userType1 = scanner.next();
        System.out.println("Enter username:");
        String username1 = scanner.next();

        if ("customer".equalsIgnoreCase(userType1)) {
            customer1.UpdateProfile(username1);
        } else if ("employee".equalsIgnoreCase(userType1)) {
            employee1.UpdateProfile(username1);
        } else {
            System.out.println("Invalid user type.");
        }

        scanner.close();
    }
}