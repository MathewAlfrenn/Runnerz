package dev.Mathew.Runnerz;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import ch.qos.logback.classic.model.processor.ContextNameModelHandler;
import dev.Mathew.Runnerz.run.*;
import dev.Mathew.Runnerz.user.User;
import dev.Mathew.Runnerz.user.UserHttpClient;
import dev.Mathew.Runnerz.user.UserRestClient;


@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
    	SpringApplication.run(Application.class, args);
		log.info("Application is running");

    }
	@Bean
	UserHttpClient userHttpClient(){
		RestClient restClient = RestClient.create("https://jsonplaceholder.typicode.com/");
		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();
		return factory.createClient(UserHttpClient.class);
		
	}
	@Bean
	CommandLineRunner runner(UserHttpClient client){ //run after app is started and context created
		
		return args -> {
			List<User> users = client.findAll();
			//System.out.println(users);

			User user = client.findById(1);
			System.out.println(user);
			

	};
	}
}
