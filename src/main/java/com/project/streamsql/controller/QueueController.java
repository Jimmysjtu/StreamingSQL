package com.project.streamsql.controller;

import com.project.streamsql.entity.Queue;
import com.project.streamsql.repository.QueueRepository;
import com.project.streamsql.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping("queues")
public class QueueController {

    @Autowired
    private QueueService queueService;

    @Autowired
    private QueueRepository queueRepository;

    @RequestMapping("all")
    public List<Queue> loadCustomers() {
        return queueRepository.findAll();
    }

    @RequestMapping("get/{id}")
    public Queue getQueue(@PathVariable("id") Long id) {
        return queueRepository.findById(id).get();
    }

    /**
     * @param queue
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @Transactional
    public Queue addQueue(@RequestBody Queue queue) {

        queueService.addQueue(queue);

        Long id = queue.getId();

        return queueService.getQueueById(id);

    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
//    @Transactional
    public Queue updateQueue(@RequestBody Queue queue) {

        queueService.updateQueueById(queue);

        Long id = queue.getId();

        return queueService.getQueueById(id);

    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
//    @Transactional
    public Queue deleteQueue(@RequestBody Queue queue) {

        Long id = queue.getId();
        queue = getQueue(id);
        queueService.deleteQueueById(id);
        return queue;

    }

}

