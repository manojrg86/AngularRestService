package com.funmeeting.funmeetingprod.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



@EnableMongoRepositories(basePackages= {"com.funmeeting.funmeetingprod.repository"})
@Configuration
public class AppConfig {

	/*@Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
            userRepository.save(new User("Peter", "Development"));
            userRepository.save(new User("Sam", "Operations"));
        };
    }*/
}
