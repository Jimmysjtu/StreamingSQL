package com.project.streamsql.entity;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "UserTable")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String job_name;

//    @OneToMany(mappedBy = "duty_user")
//    private Collection<Job> duty_jobs;
//
//    @OneToMany(mappedBy = "update_user")
//    private Collection<Job> update_jobs;
//
//    @OneToMany(mappedBy = "cty_duty_user")
//    private Collection<Category> duty_categories;
//
//    @OneToMany(mappedBy = "cty_create_user")
//    private Collection<Category> create_categories;
//
//    @OneToMany(mappedBy = "cty_update_user")
//    private Collection<Category> update_categories;


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

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }
}