package com.cognizant.jpa;

import com.cognizant.jpa.model.Country;
import com.cognizant.jpa.model.Department;
import com.cognizant.jpa.model.Employee;
import com.cognizant.jpa.model.Skill;
import com.cognizant.jpa.service.CountryService;
import com.cognizant.jpa.service.DepartmentService;
import com.cognizant.jpa.service.EmployeeService;
import com.cognizant.jpa.service.SkillService;
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

    private static final SkillService skillService =
            context.getBean(SkillService.class);

    public static void main(String[] args) {

        // exercise1QuickExample();
        // exercise2FindCountryByCode();
        // exercise3AddCountry();
        // exercise4UpdateCountry();
        // handsOn9DeleteCountry();
        // exercise5QueryMethods();

        exercise6Mapping();

        // exercise7HQL();
        // exercise8NativeQueries();
    }

    // =========================================================
    // Exercise 6 - O/R Mapping
    // =========================================================

    public static void exercise6Mapping() {

        System.out.println("\n===============================");
        System.out.println("SPRING DATA JPA O/R MAPPING");
        System.out.println("===============================\n");

        System.out.println("========== MANY TO ONE ==========\n");
        testGetEmployee();

        System.out.println("\n=================================\n");

        System.out.println("========== ONE TO MANY ==========\n");
        testGetDepartment();

        System.out.println("\n=================================\n");

        System.out.println("========== MANY TO MANY ==========\n");
        testGetSkill();
    }

    public static void testGetEmployee() {

        Employee employee = employeeService.get(1);

        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.println("Employee");
        System.out.println(employee);

        System.out.println("\nDepartment");
        System.out.println(employee.getDepartment());

        System.out.println("\nSkills");

        employee.getSkillList().forEach(System.out::println);
    }

    public static void testGetDepartment() {

        Department department = departmentService.get(1);

        if (department == null) {
            System.out.println("Department not found.");
            return;
        }

        System.out.println("Department");
        System.out.println(department);

        System.out.println("\nEmployees");

        department.getEmployeeList().forEach(System.out::println);
    }

    public static void testGetSkill() {

        Skill skill = skillService.get(1);

        if (skill == null) {
            System.out.println("Skill not found.");
            return;
        }

        System.out.println("Skill");
        System.out.println(skill);

        System.out.println("\nEmployees");

        skill.getEmployeeList().forEach(System.out::println);
    }

    // =========================================================
    // Other Exercises
    // =========================================================

    public static void exercise1QuickExample() {
        countryService.getAllCountries().forEach(System.out::println);
    }

    public static void exercise2FindCountryByCode() {
        System.out.println(countryService.getCountry("IN"));
    }

    public static void exercise3AddCountry() {
        Country country = new Country("BR", "Brazil");
        countryService.addCountry(country);
    }

    public static void exercise4UpdateCountry() {
        countryService.updateCountry("IN", "Bharat");
    }

    public static void handsOn9DeleteCountry() {
        countryService.deleteCountry("BR");
    }

    public static void exercise5QueryMethods() {

        countryService.searchCountries("ou")
                .forEach(System.out::println);

        countryService.searchCountriesSorted("ou")
                .forEach(System.out::println);

        countryService.getCountriesStartingWith("Z")
                .forEach(System.out::println);
    }

    public static void exercise7HQL() {
    }

    public static void exercise8NativeQueries() {
    }
}