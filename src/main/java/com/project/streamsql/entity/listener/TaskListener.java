package com.project.streamsql.entity.listener;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

public class TaskListener {

    @PrePersist
    public void prePersist(Object source) {

        System.out.println("@PrePersist : " + source);

    }

    @PostPersist
    public void postPersist(Object source) {

        System.out.println("@PostPersist : " + source);

    }

}
