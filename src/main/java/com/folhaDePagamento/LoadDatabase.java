package com.folhaDePagamento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {
        return args -> {
            log.info("Preloading" + employeeRepository.save(new Employee("Pablo", "Zalem", "Archi")));
            log.info("Preloading" + employeeRepository.save(new Employee("Cris", "Melo", "Engenieer")));

            employeeRepository.findAll().forEach(employee -> log.info("Preloading " + employee));

            orderRepository.save(new Order("Macbook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloading " + order);
            });
        };
    }
}
