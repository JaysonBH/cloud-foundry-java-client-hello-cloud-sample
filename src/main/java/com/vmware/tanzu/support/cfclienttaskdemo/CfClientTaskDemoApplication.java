package com.vmware.tanzu.support.cfclienttaskdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@EnableTask
@SpringBootApplication
public class CfClientTaskDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CfClientTaskDemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Hello, World!");
	}

}
