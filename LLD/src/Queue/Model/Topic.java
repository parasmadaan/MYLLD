package Queue.Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Topic {
    private final String topicId;
    private String topicName;

    private final List<Message> messages;

    private final List<TopicSubscriber> subscribers;

    public Topic(String topicId,String topicName){
        this.topicId = topicId;
        this.topicName = topicName;
        this.messages = new LinkedList<>();
        this.subscribers = new ArrayList<>();

    }

    public String getTopicId() {
        return topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public void addMessage(Message message){
        this.messages.add(message);
    }

    public void addSubscriber(TopicSubscriber subscriber){
        this.subscribers.add(subscriber);
    }

    public List<TopicSubscriber> getSubscribers(){
        return this.subscribers;
    }

    public List<Message> getMessages(){
        return this.messages;
    }
}
