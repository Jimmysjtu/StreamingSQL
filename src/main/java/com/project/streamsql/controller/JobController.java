package com.project.streamsql.controller;

import com.project.streamsql.entity.Job;
import com.project.streamsql.repository.JobRepository;
import com.project.streamsql.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @Autowired
    private JobRepository jobRepository;

    @RequestMapping("all")
    public List<Job> loadCustomers() {
        return jobRepository.findAll();
    }

    @RequestMapping("get/{id}")
    public Job getJob(@PathVariable("id") Long id) {
        return jobRepository.findById(id).get();
    }


    public static String evaluate() {
        String s = UUID.randomUUID().toString();
        return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
    }

    /**
     * @param job
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @Transactional
    public Job addJob(@RequestBody Job job) {

        job.setGuid(evaluate());

        System.out.println(job.getGuid());

        jobService.addJob(job);

        String id = job.getGuid();

        return jobService.getJobById(id);

    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
//    @Transactional
    public Job updateJob(@RequestBody Job job) {

        jobService.updateJobById(job);

        String id = job.getGuid();

        return jobService.getJobById(id);

    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
//    @Transactional
    public Job deleteJob(@RequestBody Job job) {

        String id = job.getGuid();
        jobService.deleteJobById(id);
        return job;
    }

}
