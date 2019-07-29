package com.project.streamsql.entity;


import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "CategoryTable")
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 300)
    private String description;

    @ManyToOne
    private User cty_create_user;

    private Date create_time;

    @ManyToOne
    private User cty_update_user;

    private Date update_time;

    @ManyToOne
    private User cty_duty_user;

//    @OneToMany(mappedBy = "category")
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getCty_create_user() {
        return cty_create_user;
    }

    public void setCty_create_user(User cty_create_user) {
        this.cty_create_user = cty_create_user;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public User getCty_update_user() {
        return cty_update_user;
    }

    public void setCty_update_user(User cty_update_user) {
        this.cty_update_user = cty_update_user;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public User getCty_duty_user() {
        return cty_duty_user;
    }

    public void setCty_duty_user(User cty_duty_user) {
        this.cty_duty_user = cty_duty_user;
    }
}