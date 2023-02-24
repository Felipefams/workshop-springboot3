package com.felipe.webservice.config;

import com.felipe.webservice.entities.User;
import com.felipe.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired //auto dependency injection
   private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456", null);
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456", null);

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
