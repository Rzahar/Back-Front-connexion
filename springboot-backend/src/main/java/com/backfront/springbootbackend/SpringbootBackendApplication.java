package com.backfront.springbootbackend;

import com.backfront.springbootbackend.model.User;
import com.backfront.springbootbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("toto","momo","email@toto.fr"));
		this.userRepository.save(new User("titi","mama","email@toto.fr"));
		this.userRepository.save(new User("tutu","mumu","email@toto.fr"));
	}
}
