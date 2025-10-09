package com.sebaare.programmingstudent.dto;

import com.sebaare.programmingstudent.model.Topic;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CourseTopicDTO {
    
    private String courseName;
    private List<Topic> topics;

    public CourseTopicDTO() {
    }

    public CourseTopicDTO(String courseName, List<Topic> topics) {
        this.courseName = courseName;
        this.topics = topics;
    }
    
}
