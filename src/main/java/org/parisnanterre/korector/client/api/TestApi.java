package org.parisnanterre.korector.client.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@CrossOrigin("*")
public class TestApi {

    private final RestTemplate restTemplate;
    @Autowired
    private TeamsClient teamsClient;

    private static final Logger LOG = LoggerFactory.getLogger(TestApi.class);

    public TestApi(@Qualifier("ribbon-template") RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping("/test")
    public String test(){
        return "OK";
    }

    @RequestMapping(path = "/services", method = RequestMethod.GET)
    public ResponseEntity<String> getGroupesViaIntegration(){
        String test = teamsClient.test();
        return new ResponseEntity<>(test, HttpStatus.OK);

    }


}
