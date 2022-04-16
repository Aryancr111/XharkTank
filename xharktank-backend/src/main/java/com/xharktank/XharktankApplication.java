package com.xharktank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*Spring Boot Application annotation keeps the server running, unlike usual java programs which will
 get terminated after they are done executing. TomCat http server so we can send http requests. */
@SpringBootApplication
public class XharktankApplication {

	public static void main(String[] args) {
		SpringApplication.run(XharktankApplication.class, args);
	}

}
