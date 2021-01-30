package lk.mobitel.esms.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author firnas
 *
 */
//
@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class smsProviderDms {
	public static void main(String[] args) {
		SpringApplication.run(smsProviderDms.class, args);
	}
}
