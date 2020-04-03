package com.scoop.springcloud.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaApplication start
 *
 * @author scoop
 */
@EnableEurekaServer
@SpringBootApplication
@Slf4j
public class EurekaApplication {

	public static void main(String[] args) {
		log.info("EurekaApplication start");
		SpringApplication.run(EurekaApplication.class, args);
	}
}
