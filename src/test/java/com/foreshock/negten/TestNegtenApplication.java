package com.foreshock.negten;

import org.springframework.boot.SpringApplication;

public class TestNegtenApplication {

	public static void main(String[] args) {
		SpringApplication.from(NegtenApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
