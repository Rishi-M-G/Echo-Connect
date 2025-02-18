// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package EchoConnect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

    public class Customer extends EchoConnect.Person {
        public int CustomerID;
        public List<Services> MyServices; // Updated to use List<String>
        public List<String> MyDevices; // Updated to use List<String>
        public int FamilyID;

        public void Register() {
            this.UserName = UserName;
            this.Password = Password;
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.EMail = EMail;
            this.City = City;
            this.Country = Country;
            // Initialize lists
            this.MyServices = new ArrayList<>(); // Initialize as ArrayList
            this.MyDevices = new ArrayList<>(); // Initialize as ArrayList

            System.out.println("Customer registration successful!");
        }

        public void ViewProfile() {
            System.out.println("Customer Profile Information:");
            System.out.println("Username: " + this.UserName);
            System.out.println("First Name: " + this.FirstName);
            System.out.println("Last Name: " + this.LastName);
            System.out.println("Email: " + this.EMail);
            System.out.println("City: " + this.City);
            System.out.println("Country: " + this.Country);
            System.out.println("CustomerID: " + this.CustomerID);
            System.out.println("FamilyID: " + this.FamilyID);

            // Display services
            if (this.MyServices != null && !this.MyServices.isEmpty()) {
                System.out.println("My Services:");
                for (Services service : this.MyServices) {
                    System.out.println("- " + service);
                }
            }

            // Display devices
            if (this.MyDevices != null && !this.MyDevices.isEmpty()) {
                System.out.println("My Devices:");
                for (String device : this.MyDevices) {
                    System.out.println("- " + device);
                }
            }
        }

		public int getCustomerId() {
			// TODO Auto-generated method stub
			return CustomerID;
		}

		public List<Services> getMyServices() {
			// TODO Auto-generated method stub
			return MyServices;
		}
    }

    public class Employee extends EchoConnect.Person {
        public int EmployeeID;
        public String EmployeeRole;
        public String Department;
        public String ReportingManager;

        public void ViewEmployeeProfile() {
            System.out.println("Employee Profile Information:");
            System.out.println("Username: " + this.UserName);
            System.out.println("First Name: " + this.FirstName);
            System.out.println("Last Name: " + this.LastName);
            System.out.println("Email: " + this.EMail);
            System.out.println("City: " + this.City);
            System.out.println("Country: " + this.Country);
            System.out.println("EmployeeID: " + this.EmployeeID);
            System.out.println("EmployeeRole: " + this.EmployeeRole);
            System.out.println("Department: " + this.Department);
            System.out.println("Reporting Manager: " + this.ReportingManager);
        }
    }
    

    public String UserName;
    public String FirstName;
    public String LastName;
    public String Password;
    public String EMail;
    public String City;
    public String Country;

    public boolean LogOff(String username) {
        if (this.UserName.equals(username)) {
            System.out.println("Successfully Logged Off!");
            return true;
        } else {
            System.out.println("Invalid username.User logoff failed.");
            return false;
        }}

    public boolean LogIn(String username, String password) {
        if (this.UserName.equals(username)) {
            if (this.Password.equals(password)) {
                System.out.println("Successfully Logged On!");
                System.out.println("Welcome " + this.UserName);
                return true;
            } else {
                System.out.println("Invalid password. User login failed.");
                return false;
            }
        } else {
            System.out.println("Invalid username. User login failed.");
            return false;
        }}
    public void ChangePassword(String username, String currentPassword, String newPassword) {
        if (this.UserName.equals(username) && this.Password.equals(currentPassword)) {
            this.Password = newPassword;
            System.out.println("User password changed successfully!");
        } else {
            System.out.println("Invalid username or current password for password change.");
        }
    }

    public void UpdateProfile() {
        if (this.UserName.equals(UserName)) {
            System.out.println("Current Profile Information:");
            System.out.println("Username: " + this.UserName);
            System.out.println("First Name: " + this.FirstName);
            System.out.println("Last Name: " + this.LastName);
            System.out.println("Email: " + this.EMail);
            System.out.println("City: " + this.City);
            System.out.println("Country: " + this.Country);

            // Get updated information
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter new first name:");
            this.FirstName = scanner.next();
            System.out.println("Enter new last name:");
            this.LastName = scanner.next();
            System.out.println("Enter new email:");
            this.EMail = scanner.next();
            System.out.println("Enter new city:");
            this.City = scanner.next();
            System.out.println("Enter new country:");
            this.Country = scanner.next();

            System.out.println("Profile updated successfully!");
        } else {
            System.out.println("Invalid username for profile update.");
        }
    }
}