package io.javabrains.afarrspringbootquickstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("Math", "Real Analysis", "Cauchy Sequences"),
			new Topic("CS", "Algorithms", "Convex Hull"),
			new Topic("Religion", "Yoga in India and the West", "KrishnaCore Punk")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream()
				.filter(t -> t.getId().equals(id))
				.findFirst()
				.get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

}
