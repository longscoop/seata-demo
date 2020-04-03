package com.scoop.mall;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 库存服务
 *
 * @author scoop
 */
@SpringBootApplication
@MapperScan("com.scoop.mall.dao")
@EnableEurekaClient
@EnableDiscoveryClient
@EnableAutoDataSourceProxy
public class StorageServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StorageServerApplication.class, args);
	}

}
