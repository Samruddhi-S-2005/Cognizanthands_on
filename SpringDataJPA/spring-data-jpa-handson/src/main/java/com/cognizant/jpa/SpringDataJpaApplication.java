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

        Country country = new Country("BR", "Brazil");

        countryService.addCountry(country);

        System.out.println("Country Added Successfully!");

        System.out.println(countryService.getCountry("BR"));
    }
}