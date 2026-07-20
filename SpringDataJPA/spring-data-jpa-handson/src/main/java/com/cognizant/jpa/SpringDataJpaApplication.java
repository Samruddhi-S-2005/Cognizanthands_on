package com.cognizant.jpa;

import com.cognizant.jpa.model.Country;
import com.cognizant.jpa.service.CountryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDataJpaApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CountryService countryService =
                context.getBean(CountryService.class);

        System.out.println("Before Update:");
        System.out.println(countryService.getCountry("IN"));

        countryService.updateCountry("IN", "Bharat");

        System.out.println();

        System.out.println("After Update:");
        System.out.println(countryService.getCountry("IN"));
    }
}