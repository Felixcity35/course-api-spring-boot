package com.ozonetech.springquickstart.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.web.bind.annotation.PathVariable;

import com.ozonetech.springquickstart.topic.Topics;

@Entity
public class Course {
	
	@Id
	private String id  ;
	private String name ;
	private String description ;
	
	@ManyToOne
	Topics topic ;
	
	public Course() {	
	}
	
	public Course(String id, String name, String description,String topicId ) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topics(topicId,"","");
		
	}
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
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

	public Topics getTopic() {
		return topic;
	}

	public void setTopic(Topics topic) {
		this.topic = topic;
	}
	
	
	
	

}
