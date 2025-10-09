package com.sebaare.programmingstudent.service;

import com.sebaare.programmingstudent.model.Topic;
import com.sebaare.programmingstudent.repository.TopicRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicRepository topicRepository;
    
    
    @Override
    public List<Topic> getTopics() {
        return topicRepository.findAll();
    }

    @Override
    public void saveTopic(Topic topic) {
        topicRepository.save(topic);
    }

    @Override
    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }

    @Override
    public Topic findTopic(Long id) {
        return topicRepository.findById(id).orElse(null);
    }

    @Override
    public void editTopic(Topic topic) {
        this.saveTopic(topic);
    }
    
    
    
}
