package dev.Mathew.Runnerz.user;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

@Component //to put an instsance in the application context
public class UserRestClient {

    private final RestClient restClient;

    public UserRestClient(RestClient.Builder builder) {
        //JdkClientHttpRequestFactory jdkClientHttpRequestFactory = new JdkClientHttpRequestFactory();
        //jdkClientHttpRequestFactory.setReadTimeout(10000);
        this.restClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com/")
                //.requestFactory(jdkClientHttpRequestFactory)
                .build();
                //defaultheader
                //requestintercepter
    }

    public List<User> findAll() {
        return restClient.get()
                .uri("/users")
                .retrieve() //or exchange but more complicated but more control
                .body(new ParameterizedTypeReference<>() {}); //to get a list of users
    }

    public User findById(Integer id) {
        return restClient.get()
                .uri("/users/{id}", id)
                .retrieve()
                .body(User.class);
    }
}
