package com.aegisflow;

import org.springframework.boot.SpringApplication;

public class TestAegisflowApplication {

	public static void main(String[] args) {
		SpringApplication.from(AegisflowApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
