package com.techninja.RestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootRestApiApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootRestApiApplication.class, args);
	}

}
