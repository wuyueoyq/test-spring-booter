package com.example.demo;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerITest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getHello() throws Exception {
    	URL base = new URL("http://localhost:" + port + "/");
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        assertThat(response.getBody(), equalTo("Greetings from Spring Boot!"));
    }
    @Test
    public void getHello2() throws Exception {
       	URL base = new URL("http://localhost:" + port + "/bbc");
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        assertThat(response.getBody(), equalTo("Greetings from Spring Boot!---bbc"));
    }
    
    
    @Test
    public void getHello3() throws Exception {
       	URL base = new URL("http://localhost:" + port + "/bbc");
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        assertThat(response.getBody(), equalTo("Greetings from Spring Boot!---bbc"));
    }
    
    
    @Test
    public void getHello4() throws Exception {
       	URL base = new URL("http://localhost:" + port + "/bbc");
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        assertThat(response.getBody(), equalTo("Greetings from Spring Boot!---bbc"));
    }
    
    
}
