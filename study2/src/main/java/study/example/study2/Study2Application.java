package study.example.study2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
//熔断降级注解
@EnableCircuitBreaker
public class Study2Application {

	public static void main(String[] args) {
		SpringApplication.run(Study2Application.class, args);
	}

}
