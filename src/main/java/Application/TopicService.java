package Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics()
    {
        List<Topic> topics=new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }


    public Optional<Topic> getTopic(String id)
    {
        return topicRepository.findById(id);
        //return (List<Topic>) topicRepository.findAllById(Collections.singleton(id));
    }

    public void addTopic(Topic topic)
    {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
        }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
