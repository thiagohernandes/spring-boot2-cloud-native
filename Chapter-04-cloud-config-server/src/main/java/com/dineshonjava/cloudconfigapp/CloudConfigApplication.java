package com.dineshonjava.cloudconfigapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/* 
 * Let's run your configuration application by using the command line, type mvn spring-boot:run. The Git-backed configuration API provided by our server can be queried using the following paths:

/{application}/{profile}[/{label}] 
/{application}-{profile}.yml 
/{label}/{application}-{profile}.yml 
/{application}-{profile}.properties 
/{label}/{application}-{profile}.properties 
Let's understand the following variables for parameterized environment resources:

The {application} variable maps to the spring.application.name property's value on the client side
The {profile} variable maps to spring.profiles.active property's value on the client side
The {label} refers to a Git branch name, commit ID, and tag
You can find the configuration by using the preceding URI, let's retrieve some of them.

Suppose our Config client is running under the development profile in the branch master via:

/{application}/{profile}[/{label}] 
Let's see the following example of the preceding pattern:

http://localhost:8888/cloudconfig/dev/master
 * */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigApplication.class, args);
	}
}
