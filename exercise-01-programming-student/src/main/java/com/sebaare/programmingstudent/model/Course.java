package com.sebaare.programmingstudent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Course {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String modality;
    private LocalDate completionDate;
    @OneToMany(mappedBy="course")
    private List<Topic> topics;

    public Course() {
    }

    public Course(Long id, String name, String modality, LocalDate completionDate, List<Topic> topics) {
        this.id = id;
        this.name = name;
        this.modality = modality;
        this.completionDate = completionDate;
        this.topics = topics;
    }
    
    
    
}

