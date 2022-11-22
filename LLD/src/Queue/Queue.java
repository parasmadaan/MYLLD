package Queue;

import Queue.Model.Isubscriber;
import Queue.Model.Message;
import Queue.Model.Topic;
import Queue.Model.TopicHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Queue{

    Logger logger ;
    private final Map<String,TopicHandler> topicProcessors;

    public Queue(){
        this.topicProcessors = new HashMap<String,TopicHandler>();
        logger =  Logger.getLogger(Queue.class.getName());

    }


    public Topic createTopic(final String topicName){
        final Topic topic = new Topic(String.valueOf(UUID.randomUUID()),topicName);
        TopicHandler topicHandler = new TopicHandler(topic);
        topicProcessors.put(topic.getTopicId(),topicHandler);
        logger.log(Level.INFO,"created topic "+topic.getTopicName());
        return topic;
    }

    public void subscribe(final Isubscriber isubscriber, final Topic topic){
        topic.addSubscriber(isubscriber);
        logger.log(Level.INFO,isubscriber.getSubscriberId() +" subscribed to the topic "+topic.getTopicName());
    }
    public void publish(Topic topic, Message message){
       new Thread(()->topicProcessors.get(topic.getTopicId()).publish(message)).start();
    }
}
