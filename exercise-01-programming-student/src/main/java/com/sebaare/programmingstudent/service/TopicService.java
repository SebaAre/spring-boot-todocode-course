package com.sebaare.programmingstudent.service;

import com.sebaare.programmingstudent.model.Topic;
import java.util.List;


public interface TopicService {
    
    public List<Topic> getTopics();
    
    public void saveTopic (Topic topic);
    
    public void deleteTopic (Long id);
    
    public Topic findTopic (Long id);
    
    public void editTopic (Topic topic);
    
    
}
