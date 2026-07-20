package com.cognizant.jpa;

import com.cognizant.jpa.model.Country;
import com.cognizant.jpa.service.CountryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringDataJpaApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CountryService countryService =
                context.getBean(CountryService.class);

        List<Country> countries = countryService.getAllCountries();

        for (Country country : countries) {
            System.out.println(country);
        }
    }
}