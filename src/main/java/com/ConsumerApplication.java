package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:spring-dubbo-consumer.xml"})
public class ConsumerApplication {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("*******************  系统开始启动  *******************");
		SpringApplication.run(ConsumerApplication.class, args);
		System.out.println("*******************  系统启动完成  *******************");
	}

}
