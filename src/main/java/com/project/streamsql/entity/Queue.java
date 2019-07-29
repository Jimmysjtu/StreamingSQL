package com.project.streamsql.entity;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "QueueTable")
public class Queue {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 50)
    private String name;

//    @OneToMany(mappedBy = "queue")
//    private Collection<Job> jobs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Collection<Job> getJobs() {
//        return jobs;
//    }
//
//    public void setJobs(Collection<Job> jobs) {
//        this.jobs = jobs;
//    }
}


