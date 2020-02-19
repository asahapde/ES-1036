/* A class that holds information about an employee
 * Author: Abdullah Sahapdeen
 * Date: 10/25/2018
 * Section: 004-3C2415
 */
package asahapde_lab03;

public class Employee {

	public String m_firstName; // Holds the employee's first name
	public String m_lastName; // Holds the employee's last name
	public int m_salary; // Holds the employee's salary

	// The class constructor
	public Employee(String fName, String lName, int salary) {
		this.m_firstName = fName; // Set the first name
		this.m_lastName = lName; // Set the last name
		this.m_salary = salary; // Set the salary
	}

	// Output the employee's info
	public void printInfo() {
		System.out.println("\nFirst Name: " + this.m_firstName + ",");
		System.out.println("Last Name: " + this.m_lastName + ",");
		System.out.println("Salary: " + this.m_salary);
	}
}
