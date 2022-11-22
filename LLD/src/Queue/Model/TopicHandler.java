package Queue.Model;

import java.util.HashMap;
import java.util.Map;

public class TopicHandler {
    private Topic topic;
    private Map<String,SubscriberWorker> subscriberWorkers;

    public TopicHandler(Topic topic){
        this.topic = topic;
        subscriberWorkers = new HashMap<>();
    }

    public void publish(){
        topic.getSubscribers().forEach(topicSubscriber -> startSubscriberWorker(topicSubscriber));
    }

    private void startSubscriberWorker(TopicSubscriber topicSubscriber) {
        final String subscriberId = topicSubscriber.getIsubscriber().getSubscriberId();
        if(!subscriberWorkers.containsKey(subscriberId)){
            subscriberWorkers.put(subscriberId,new SubscriberWorker(topic,topicSubscriber));
            new Thread(subscriberWorkers.get(subscriberId)).start();
        }
        subscriberWorkers.get(subscriberId).wakeUpIfNeeded();
    }
}
