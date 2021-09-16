package com.Hackathon.hackathonteam14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EntityScan("com.Hackathon.hackathonteam14.models.Location")
//@ComponentScan(basePackages = {"com.Hackathon.hackathonteam14.*"})
public class HackathonTeam14Application {

	public static void main(String[] args) {
		SpringApplication.run(HackathonTeam14Application.class, args);
	}

}
