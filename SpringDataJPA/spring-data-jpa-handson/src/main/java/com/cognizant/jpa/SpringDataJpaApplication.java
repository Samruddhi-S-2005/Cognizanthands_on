package com.cognizant.jpa;

import com.cognizant.jpa.model.Country;
import com.cognizant.jpa.model.Department;
import com.cognizant.jpa.model.Employee;
import com.cognizant.jpa.service.CountryService;
import com.cognizant.jpa.service.DepartmentService;
import com.cognizant.jpa.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDataJpaApplication {

    private static final ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

    private static final CountryService countryService =
            context.getBean(CountryService.class);

    private static final EmployeeService employeeService =
            context.getBean(EmployeeService.class);

    private static final DepartmentService departmentService =
            context.getBean(DepartmentService.class);

    public static void main(String[] args) {

        /*
         * Uncomment ONLY ONE exercise at a time.
         */

        // exercise1QuickExample();
        // exercise2FindCountryByCode();
        // exercise3AddCountry();
        // exercise4UpdateCountry();
        // handsOn9DeleteCountry();

        // Document 2
        // exercise5QueryMethods();
        exercise6Mapping();

        // exercise7HQL();
        // exercise8NativeQueries();
    }

    // =========================================================
    // Exercise 1 - Quick Example
    // =========================================================
    public static void exercise1QuickExample() {

        System.out.println("\n===== Exercise 1 : Quick Example =====\n");

        countryService.getAllCountries()
                .forEach(System.out::println);
    }

    // =========================================================
    // Exercise 2 - Find Country
    // =========================================================
    public static void exercise2FindCountryByCode() {

        System.out.println("\n===== Exercise 2 : Find Country =====\n");

        System.out.println(countryService.getCountry("IN"));
    }

    // =========================================================
    // Exercise 3 - Add Country
    // =========================================================
    public static void exercise3AddCountry() {

        System.out.println("\n===== Exercise 3 : Add Country =====\n");

        Country existing = countryService.getCountry("BR");

        if (existing == null) {

            Country country = new Country("BR", "Brazil");
            countryService.addCountry(country);

            System.out.println("Country added successfully.");

        } else {

            System.out.println("Country already exists.");
        }

        System.out.println(countryService.getCountry("BR"));
    }

    // =========================================================
    // Exercise 4 - Update Country
    // =========================================================
    public static void exercise4UpdateCountry() {

        System.out.println("\n===== Exercise 4 : Update Country =====\n");

        System.out.println("Before Update:");
        System.out.println(countryService.getCountry("IN"));

        countryService.updateCountry("IN", "Bharat");

        System.out.println();

        System.out.println("After Update:");
        System.out.println(countryService.getCountry("IN"));
    }

    // =========================================================
    // Delete Country
    // =========================================================
    public static void handsOn9DeleteCountry() {

        System.out.println("\n===== Delete Country =====\n");

        Country existing = countryService.getCountry("BR");

        if (existing == null) {
            System.out.println("Country BR does not exist.");
            return;
        }

        System.out.println("Before Delete:");
        System.out.println(existing);

        countryService.deleteCountry("BR");

        Country deleted = countryService.getCountry("BR");

        if (deleted == null)
            System.out.println("Country deleted successfully.");
        else
            System.out.println("Delete failed.");
    }

    // =========================================================
    // Exercise 5 - Query Methods
    // =========================================================
    public static void exercise5QueryMethods() {

        System.out.println("\n===== Exercise 5 : Query Methods =====");

        System.out.println("\nCountries containing 'ou'");

        countryService.searchCountries("ou")
                .forEach(System.out::println);

        System.out.println("\nCountries containing 'ou' (Sorted)");

        countryService.searchCountriesSorted("ou")
                .forEach(System.out::println);

        System.out.println("\nCountries starting with 'Z'");

        countryService.getCountriesStartingWith("Z")
                .forEach(System.out::println);
    }

    // =========================================================
    // Exercise 6 - O/R Mapping
    // =========================================================
    public static void exercise6Mapping() {

        System.out.println("\n===== Exercise 6 : O/R Mapping =====\n");

        System.out.println("----- Many-To-One Mapping -----");
        testGetEmployee();

        System.out.println("\n--------------------------------------\n");

        System.out.println("----- One-To-Many Mapping -----");
        testGetDepartment();
    }

    public static void testGetEmployee() {

        Employee employee = employeeService.get(1);

        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.println("Employee Details");
        System.out.println(employee);

        if (employee.getDepartment() != null) {

            System.out.println("\nDepartment Details");
            System.out.println(employee.getDepartment());

        } else {

            System.out.println("\nDepartment not assigned.");
        }
    }

    public static void testGetDepartment() {

        Department department = departmentService.get(1);

        if (department == null) {

            System.out.println("Department not found.");
            return;
        }

        System.out.println("Department Details");
        System.out.println(department);

        System.out.println("\nEmployees");

        department.getEmployeeList()
                .forEach(System.out::println);
    }

    // =========================================================
    // Exercise 7 - HQL
    // =========================================================
    public static void exercise7HQL() {

        System.out.println("\n===== Exercise 7 : HQL =====\n");

        // To be implemented
    }

    // =========================================================
    // Exercise 8 - Native Query
    // =========================================================
    public static void exercise8NativeQueries() {

        System.out.println("\n===== Exercise 8 : Native Query =====\n");

        // To be implemented
    }
}