package com.example.springwebdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringwebdemoApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringwebdemoApplication.class);

    public static void main(String[] args) {
        //LOGGER.debug("Inside main()");
    	System.out.println("Inside main()");
        displayCountry();
    }

    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        //LOGGER.debug("Country : {}", country.toString());
        System.out.println("Country: " + country.toString());
    }
}
