package com.cognizant.jpa;

import com.cognizant.jpa.model.Country;
import com.cognizant.jpa.service.CountryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDataJpaApplication {

    private static final ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

    private static final CountryService countryService =
            context.getBean(CountryService.class);

    public static void main(String[] args) {

        /*
         * Uncomment ONLY ONE exercise at a time.
         */

        // exercise1QuickExample();
        // exercise2FindCountryByCode();
        // exercise3AddCountry();
        //exercise4UpdateCountry();
        // handsOn9DeleteCountry();

        // Future Hands-ons
        exercise5QueryMethods();
        // exercise6Mapping();
        // exercise7HQL();
        // exercise8NativeQueries();

        //handsOn9DeleteCountry();
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
    // Exercise 2 - Find Country by Code
    // =========================================================
    public static void exercise2FindCountryByCode() {

        System.out.println("\n===== Exercise 2 : Find Country By Code =====\n");

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
    // Hands-on 9 - Delete Country
    // =========================================================
    public static void handsOn9DeleteCountry() {

        System.out.println("\n===== Hands-on 9 : Delete Country =====\n");

        Country existing = countryService.getCountry("BR");

        if (existing == null) {

            System.out.println("Country BR does not exist.");
            return;
        }

        System.out.println("Before Delete:");
        System.out.println(existing);

        countryService.deleteCountry("BR");

        Country deletedCountry = countryService.getCountry("BR");

        if (deletedCountry == null) {

            System.out.println("\nCountry deleted successfully.");

        } else {

            System.out.println("\nDelete failed.");
        }
    }

    // =========================================================
    // =========================================================
    // Exercise 5 - Query Methods
    // =========================================================
    public static void exercise5QueryMethods() {

        System.out.println("\n===== Exercise 5 : Query Methods =====");

        System.out.println("\nCountries containing 'ou':");

        countryService.searchCountries("ou")
                .forEach(System.out::println);

        System.out.println("\nCountries containing 'ou' (Sorted):");

        countryService.searchCountriesSorted("ou")
                .forEach(System.out::println);

        System.out.println("\nCountries starting with 'Z':");

        countryService.getCountriesStartingWith("Z")
                .forEach(System.out::println);
    }

    // =========================================================
    // Exercise 6 - Mapping
    // =========================================================
    public static void exercise6Mapping() {

        System.out.println("\n===== Exercise 6 : Mapping =====\n");

        // To be implemented
    }

    // =========================================================
    // Exercise 7 - HQL
    // =========================================================
    public static void exercise7HQL() {

        System.out.println("\n===== Exercise 7 : Hibernate Query Language =====\n");

        // To be implemented
    }

    // =========================================================
    // Exercise 8 - Native Queries
    // =========================================================
    public static void exercise8NativeQueries() {

        System.out.println("\n===== Exercise 8 : Native Queries =====\n");

        // To be implemented
    }
}