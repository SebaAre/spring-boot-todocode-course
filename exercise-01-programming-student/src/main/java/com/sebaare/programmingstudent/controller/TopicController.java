package com.sebaare.programmingstudent.controller;

import com.sebaare.programmingstudent.model.Topic;
import com.sebaare.programmingstudent.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;
    
    //Create a new topic
    @PostMapping ("/topic/create")
    public String createTopic(@RequestBody Topic topic){
        topicService.saveTopic(topic);
        
        return "Topic created successfully";
    }
  
    //Modifie the data in a topic
    @PutMapping("/topic/edit")
    public String editTopic(@RequestBody Topic topic){
        topicService.editTopic(topic);
        
        return "Topic edited successfully";
    }

    
}
