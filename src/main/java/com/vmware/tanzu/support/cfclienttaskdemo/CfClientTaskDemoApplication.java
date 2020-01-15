package com.vmware.tanzu.support.cfclienttaskdemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.cloudfoundry.client.CloudFoundryClient;
import org.cloudfoundry.client.v2.info.GetInfoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@EnableTask
@SpringBootApplication
public class CfClientTaskDemoApplication implements CommandLineRunner {

	private static final Log LOG = LogFactory.getLog(CfClientTaskDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CfClientTaskDemoApplication.class, args);
	}

	@Autowired
	private CloudFoundryClient client;

	@Override
	public void run(String... args) {

		//Shows information similar to `cf curl /` and `cf curl /info`
		LOG.info( client.info().get(GetInfoRequest.builder().build()).block() );

	}

}
