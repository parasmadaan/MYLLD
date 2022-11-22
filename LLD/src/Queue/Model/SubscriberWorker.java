package Queue.Model;

import java.util.concurrent.atomic.AtomicInteger;

public class SubscriberWorker implements Runnable {

    Topic topic;
    TopicSubscriber topicSubscriber;
    public SubscriberWorker(Topic topic, TopicSubscriber topicSubscriber) {
        this.topic = topic;
        this.topicSubscriber = topicSubscriber;
    }

    @Override

    public void run() {
        synchronized (topicSubscriber) {
            while (true) {
                AtomicInteger currentOffSet = topicSubscriber.getCurrentOffSet();
                while (currentOffSet.get() >= topic.getMessages().size()) {
                    try {
                        topicSubscriber.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Message message = topic.getMessages().get(currentOffSet.get());
                topicSubscriber.getIsubscriber().consume(message);
                currentOffSet.incrementAndGet();
            }
        }
    }

    public void wakeUpIfNeeded() {
        synchronized (topicSubscriber){
            topicSubscriber.notifyAll();
        }
    }
}
