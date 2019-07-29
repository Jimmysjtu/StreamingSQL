package com.project.streamsql.entity;


import com.project.streamsql.entity.listener.TaskListener;

import javax.persistence.*;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "tasks")
@EntityListeners(value = {TaskListener.class})
public class Task {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 64)
    private String name;




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




    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }


}
