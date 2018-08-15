package nl.zeemeijer.tools.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Boot application which implements a Spring Cloud Config Server
 *
 * @author Bjorn Zeemeijer
 */
@EnableConfigServer
@SpringBootApplication
public class Application {

    /**
     * Main entrypoint of the application.
     *
     * @param args arguments passed to the application
     */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
