package com.ozonetech.springquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository ;
	
	public List<Topics> returnAllTopics()
	{
		
		List<Topics> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics ;
	}
	
	public Topics getTopic(String id) {
		
		return topicRepository.findById(id).get();
		
	// use optional in java 8 instead.
		
	}

	public void addTopic(Topics topic) {
		
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topics topic) {
		
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
		
	}

}

