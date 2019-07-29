package com.project.streamsql.controller;


import com.project.streamsql.entity.Job;
import com.project.streamsql.repository.JobRepository;
import com.project.streamsql.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import static net.bytebuddy.matcher.ElementMatchers.is;

@RestController
@RequestMapping("execute")
public class RPCController {

    @Autowired
    private JobService jobService;

    @Autowired
    private JobRepository jobRepository;

    @PostMapping("run")
    public void run(@RequestBody String guid) {

        Job job = jobService.getJobById(guid);

        System.out.println("execute!!!");

        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<String> request = new HttpEntity<>("hello!");
        String rst = restTemplate.postForObject("http://172.17.32.32:8080/response", request, String.class);



    }


}
