package com.project.streamsql.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "JobTable")
public class Job {

    @Id
    @Column(length = 50)
    private String guid;

    private Long job_id;

    private Long application_id;

    @Column(length = 50)
    private String job_name;

    @Column(length = 300)
    private String job_description;

    private String job_state;

    private String job_pattern;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Queue queue;

    @ManyToOne
    private User duty_user;

    @ManyToOne
    private User update_user;

    private Date create_time;

    private Date update_time;

    @Override
    public String toString() {
        return "Job{" +
                "guid='" + guid + '\'' +
                ", job_id=" + job_id +
                ", application_id=" + application_id +
                ", job_name='" + job_name + '\'' +
                ", job_description='" + job_description + '\'' +
                ", job_state='" + job_state + '\'' +
                ", job_pattern='" + job_pattern + '\'' +
                ", category=" + category +
                ", queue=" + queue +
                ", duty_user=" + duty_user +
                ", update_user=" + update_user +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Long getJob_id() {
        return job_id;
    }

    public void setJob_id(Long job_id) {
        this.job_id = job_id;
    }

    public Long getApplication_id() {
        return application_id;
    }

    public void setApplication_id(Long application_id) {
        this.application_id = application_id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public String getJob_state() {
        return job_state;
    }

    public void setJob_state(String job_state) {
        this.job_state = job_state;
    }

    public String getJob_pattern() {
        return job_pattern;
    }

    public void setJob_pattern(String job_pattern) {
        this.job_pattern = job_pattern;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public User getDuty_user() {
        return duty_user;
    }

    public void setDuty_user(User duty_user) {
        this.duty_user = duty_user;
    }

    public User getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(User update_user) {
        this.update_user = update_user;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
